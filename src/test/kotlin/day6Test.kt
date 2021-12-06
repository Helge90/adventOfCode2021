import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class day6Test{
    
    @Test
    fun day6Part1TestInput18Days() {
        assertEquals(26, Day6(day6TestInput).day6Part1(18))
    }
    @Test
    fun day6Part1TestInput80Days() {
        assertEquals(5934, Day6(day6TestInput).day6Part1(80))
    }
    @Test
    fun day6Part1MyInput() {
        assertEquals(391888, Day6(day6MyData).day6Part1(80))
    }

    @Test
    fun day6Part2TestInput18() {
        assertEquals(26, Day6(day6TestInput).day6Part2(18))
    }

    @Test
    fun day6Part2TestInput80() {
        assertEquals(5934, Day6(day6TestInput).day6Part2(80))
    }

    @Test
    fun day6Part2TestInput256() {
        assertEquals(26984457539, Day6(day6TestInput).day6Part2(256))
    }
    @Test
    fun day6Part2MyInput80() {
        assertEquals(391888, Day6(day6MyData).day6Part2(80))
    }

    @Test
    fun day6Part2MyInput258() {
        assertEquals(1754597645339, Day6(day6MyData).day6Part2(256))
    }
}