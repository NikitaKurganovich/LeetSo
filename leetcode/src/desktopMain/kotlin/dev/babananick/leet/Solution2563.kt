package dev.babananick.leet

/**
 * 2563 Count the Number of Fair Pairs. Medium
 *
 * [LeetCode](https://leetcode.com/problems/count-the-number-of-fair-pairs/)
 *
 * Given a 0-indexed integer array nums of size n and two integers lower and upper, return the number of fair pairs.
 *
 * A pair (i, j) is fair if:
 *
 * - 0 <= i < j < n, and
 * - lower <= nums&#91;i&#93; + nums&#91;j&#93; <= upper
 *
 * Constraints:
 *
 * - 1 <= nums.length <= 105
 * - nums.length == n
 * - -109 <= nums&#91;i&#93; <= 109
 * - -109 <= lower <= upper <= 109
 */
class Solution2563 {
    fun countFairPairs(nums: IntArray, lower: Int, upper: Int): Long {
        var pairCount: Long = 0L
        val sortedNums = nums.sortedArray()
        var rightIndex = sortedNums.size - 1
        var leftIndex = 0

        while (leftIndex < rightIndex) {
            val sum = sortedNums[leftIndex] + sortedNums[rightIndex]
            if (sum > upper) {
                rightIndex--
                continue
            }
            if (sum < lower) {
                leftIndex++
                continue
            }
            var localLeftIndex = leftIndex
            while (
                localLeftIndex < rightIndex &&
                sortedNums[localLeftIndex] + sortedNums[rightIndex] in lower..upper
            ) {
                pairCount++
                localLeftIndex++
            }
        }
        return pairCount
    }
}