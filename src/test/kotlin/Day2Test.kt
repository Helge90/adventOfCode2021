import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day2Test{

    @Test
    fun day2Part1TestData(){
        assertEquals(150, Day2(day2TestInput).day2Part1())
    }

    @Test
    fun day2Part1MyData(){
        assertEquals(1580000, Day2(day2MyData).day2Part1())
    }

    @Test
    fun day2Part2TestData(){
        assertEquals(900, Day2(day2TestInput).day2Part2())
    }

    @Test
    fun day2Part2MyData(){
        assertEquals(1251263225, Day2(day2MyData).day2Part2())
    }
}