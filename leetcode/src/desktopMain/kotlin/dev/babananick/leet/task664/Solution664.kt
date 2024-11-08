package dev.babananick.leet.task664

/**
 * 664. Strange Printer. Hard
 *
 * [LeetCode](https://leetcode.com/problems/strange-printer/)
 *
 *  There is a strange printer with the following two special properties:
 *
 *  The printer can only print a sequence of the same character each time.
 *  At each turn, the printer can print new characters starting from and ending at any place and will cover the original existing characters.
 *
 *  Given a string s, return the minimum number of turns the printer needed to print it.
 *
 * Constraints:
 * - 1 <= s.length <= 100
 * - s consists of lowercase English letters.
 */
class Solution664 {

    fun strangePrinter(s: String): Int {
        if (s.isEmpty()) return 0
        val uniqueChars = s.removeDuplicates()
        val uniqueCharsCount = uniqueChars.size

        val countArray = Array(uniqueCharsCount){
            IntArray(uniqueCharsCount)
        }

        for (i in 0 until uniqueCharsCount ) countArray[i][i] = 1

        val nextOccurrence = generateNextOccurrence(uniqueChars, uniqueCharsCount)

        for(length in 2 ..  uniqueCharsCount) {
            for (start in 0 .. uniqueCharsCount - length) {
                val end = start + length - 1

                countArray[start][end] = countArray[start + 1][end] + 1

                var nextChar = nextOccurrence[start]

                while (nextChar != -1 && nextChar <= end) {
                    countArray[start][end] = minOf(
                        countArray[start][end],
                        countArray[start][nextChar - 1] + if (nextChar + 1 <= end) countArray[nextChar + 1][end] else 0)
                    nextChar = nextOccurrence[nextChar]
                }
            }
        }

        return countArray[0][uniqueCharsCount - 1]
    }

    private inline fun generateNextOccurrence(uniqueChars: List<Char>, uniqueCharsCount: Int): Array<Int> {
        val lastSeenChar = mutableMapOf<Char, Int>()
        val nextOccurrence = Array(uniqueCharsCount){ -1 }
        for (i in uniqueCharsCount - 1 downTo 0) {
            val char = uniqueChars[i]
            nextOccurrence[i] = lastSeenChar[char] ?: -1
            lastSeenChar[char] = i
        }
        return nextOccurrence
    }

    private inline fun String.removeDuplicates(): List<Char> {
        val list = mutableListOf<Char>()
        for (char in this) {
            if (list.isEmpty() || list.last() != char) {
                list.add(char)
            }
        }
        return list
    }
}