package task2027

import dev.babananick.leet.task2027.Solution2027
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class TestSolution2027 {
    lateinit var solution: Solution2027

    @BeforeTest
    fun setup() {
        solution = Solution2027()
    }

    @Test
    fun `XXX returns 1`() {
        assertEquals(
            expected = 1,
            actual = solution.minimumMoves("XXX")
        )
    }

    @Test
    fun `XXOX returns 2`() {
        assertEquals(
            expected = 2,
            actual = solution.minimumMoves("XXOX")
        )
    }

    @Test
    fun `OOOO returns 0`() {
        assertEquals(
            expected = 0,
            actual = solution.minimumMoves("OOOO")
        )
    }

    @Test
    fun `XOXOX returns 2`() {
        assertEquals(
            expected = 2,
            actual = solution.minimumMoves("XOXOX")
        )
    }
}