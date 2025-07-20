import dev.babananick.leet.Solution664
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class TestSolution664 {

    private lateinit var solution: Solution664

    @BeforeTest
    fun setup() {
        solution = Solution664()
    }

    @Test
    fun `aaabbb returns 2`() {
        assertEquals(
            expected = 2,
            actual = solution.strangePrinter("aaabbb")
        )
    }

    @Test
    fun `abcde returns 5`() {
        assertEquals(
            expected = 5,
            actual = solution.strangePrinter("abcde")
        )
    }

    @Test
    fun `aba returns 2`() {
        assertEquals(
            expected = 2,
            actual = solution.strangePrinter("aba")
        )
    }

    @Test
    fun `abcabc returns 5`() {
        assertEquals(
            expected = 5,
            actual = solution.strangePrinter("abcabc")
        )
    }

    @Test
    fun `tbgtgb returns 4`() {
        assertEquals(
            expected = 4,
            actual = solution.strangePrinter("tbgtgb")
        )
    }

    @Test
    fun `ababc returns 4`() {
        assertEquals(
            expected = 4,
            actual = solution.strangePrinter("ababc")
        )
    }
}