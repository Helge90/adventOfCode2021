import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day1Test{

    @Test
    fun day1Part1TestInput(){
        assertEquals(7, Day1(day1TestInput).day1Part1())
    }

    @Test
    fun day1Part1MyInput(){
        assertEquals(1342, Day1(day1MyInput).day1Part1())
    }

    @Test
    fun day1Part2TestInput(){
        assertEquals(5, Day1(day1TestInput).day1Part2())
    }
    @Test
    fun day1Part2MyInput(){
        assertEquals(1378, Day1(day1MyInput).day1Part2())
    }
}