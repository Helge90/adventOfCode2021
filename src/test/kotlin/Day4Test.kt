import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day4Test{

    @Test
    fun day4Part1TestInput(){
        assertEquals(4512, Day4(day4TestInput).day4Part1())
    }

    @Test
    fun day4Part1MyInput(){
        assertEquals(49860, Day4(inputDay4).day4Part1())
    }

    @Test
    fun day4Part2TestInput(){
        assertEquals(1924, Day4(day4TestInput).day4Part2())
    }

    @Test
    fun day4Part2MyInput(){
        assertEquals(24628, Day4(inputDay4).day4Part2())
    }
}