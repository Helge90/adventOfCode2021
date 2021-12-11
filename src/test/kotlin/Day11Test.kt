import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day11Test{

    @Test
    fun Day11Part1TestInput(){
        assertEquals(1656, Day11(day11TestInput).day11Part1())
    }

    @Test
    fun Day11Part1MyInput(){
        assertEquals(1640, Day11(day11MyInput).day11Part1())
    }


    @Test
    fun Day11Part2TestInput(){
        assertEquals(195, Day11(day11TestInput).day11Part2())
    }

    @Test
    fun Day11Part2MyInput(){
        assertEquals(312, Day11(day11MyInput).day11Part2())
    }

}