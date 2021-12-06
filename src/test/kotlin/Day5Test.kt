import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day5Test {

    @Test
    fun day5Part1Testdata() {
        assertEquals(5,Day5(testinputDay5).day5Part1().calculateResult())
    }
    @Test
    fun day5Part1MyData() {
        assertEquals(4993,Day5(inputDay5).day5Part1().calculateResult())
    }
    @Test
    fun day5Part2Testdata() {
        assertEquals(12,Day5(testinputDay5).day5Part2().calculateResult())
    }

    @Test
    fun day5Part2MyData() {
        assertEquals(21101,Day5(inputDay5).day5Part2().calculateResult())
    }
}

