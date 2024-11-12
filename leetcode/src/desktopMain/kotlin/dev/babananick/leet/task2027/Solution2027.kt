package dev.babananick.leet.task2027

/**
 * 2027 Minimum Moves to Convert String. Easy
 *
 * [LeetCode](https://leetcode.com/problems/minimum-moves-to-convert-string/)
 *
 * You are given a string s consisting of n characters which are either 'X' or 'O'.
 *
 * A move is defined as selecting three consecutive characters of s and converting them to 'O'.
 * Note that if a move is applied to the character 'O', it will stay the same.
 *
 * Return the minimum number of moves required so that all the characters of s are converted to 'O'.
 *
 * Constraints:
 *
 * - 3 <= s.length <= 1000
 * - s&#91;i&#93; is either 'X' or 'O'.
 */
class Solution2027 {
    fun minimumMoves(s: String): Int {
        if (!s.contains("X")) return 0
        var stepCount = 1

        val firstXPos = s.indexOf("X")
        val lastXPos = s.lastIndexOf("X")
        var position = firstXPos + 3

        while (position in firstXPos .. lastXPos){
            if (s[position] == 'X') {
                position += 3
                stepCount++
            } else {
                position++
            }
        }
        return stepCount
    }
}


