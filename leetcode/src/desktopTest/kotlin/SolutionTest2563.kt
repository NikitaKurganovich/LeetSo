import dev.babananick.leet.Solution2563
import kotlin.random.Random
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest2563 {
    private lateinit var solution: Solution2563

    @BeforeTest
    fun setup() {
        solution = Solution2563()
    }

    @Test
    fun `nums = 0,1,7,4,4,5 lower = 3 upper = 6 returns 6`() {
        val nums = intArrayOf(0, 1, 7, 4, 4, 5)
        val lower = 3
        val upper = 6

        assertEquals(
            expected = 6,
            actual = solution.countFairPairs(nums, lower, upper)
        )
    }

    @Test
    fun `nums = 1,7,9,2,5 lower = 11 upper = 11 returns 1`() {
        val nums = intArrayOf(1, 7, 9, 2, 5)
        val lower = 11
        val upper = 11
        assertEquals(
            expected = 1,
            actual = solution.countFairPairs(nums, lower, upper)
        )
    }



    @Test
    fun `long array`() {
        val nums = IntArray(100000){ if (Random.Default.nextBoolean()) -1000000000 else 90 }
        val lower = 0
        val upper = 0
        assertEquals(
            expected = 0,
            actual = solution.countFairPairs(nums, lower, upper)
        )
    }

    @Test
    fun `nums = 0,0,0,0,0,0 lower = 0 upper = 0 returns 15`() {
        val nums = intArrayOf(0, 0, 0, 0, 0, 0)
        val lower = 0
        val upper = 0
        assertEquals(
            expected = 15,
            actual = solution.countFairPairs(nums, lower, upper)
        )
    }

}