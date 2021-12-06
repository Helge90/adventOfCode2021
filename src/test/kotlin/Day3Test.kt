import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day3Test{

    @Test
    fun day3Part1TestData(){
        assertEquals(198, Day3(day3TestInput).day3Part1())
    }
    @Test
    fun day3Part1MyData(){
        assertEquals(845186, Day3(day3MyData).day3Part1())
    }

    @Test
    fun day3Part2TestData(){
        assertEquals(230, Day3(day3TestInput).day3Part2())
    }
    @Test
    fun day3Part2MyData(){
        assertEquals(4636702, Day3(day3MyData).day3Part2())
    }
}