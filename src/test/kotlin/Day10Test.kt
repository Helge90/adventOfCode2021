import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day10Test{

    @Test
    fun day10Part1TestInput(){
        assertEquals(26397, Day10(day10TestInput).day10Part1())
    }

    @Test
    fun day10Part1MyInput(){
        assertEquals(323691, Day10(day10MyInput).day10Part1())
    }

    @Test
    fun day10Part2TestInput(){
        assertEquals(288957, Day10(day10TestInput).day10Part2())
    }

    @Test
    fun day10Part2MyInput(){
        assertEquals(2858785164, Day10(day10MyInput).day10Part2())
    }

}