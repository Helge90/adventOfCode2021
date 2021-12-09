import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day9Test{

    @Test
    fun day9Part1TestInput(){
        assertEquals(15, Day9(day9TestInput).day9Part1())
    }
    @Test
    fun day9Part1MyInput(){
        assertEquals(580, Day9(day9MyInput).day9Part1())
    }

    @Test
    fun day9Part2TestInput(){
        assertEquals(1134, Day9(day9TestInput).day9Part2())
    }
    @Test
    fun day9Part2MYInput(){
        assertEquals(856716, Day9(day9MyInput).day9Part2())
    }
}