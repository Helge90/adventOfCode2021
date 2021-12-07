import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day7Test{

    @Test
    fun day7Part1TestInput(){
        assertEquals(37, Day7(day7TestInput).day7Part1())
    }

    @Test
    fun day7Part1MyInput(){
        assertEquals(352997, Day7(day7MyInput).day7Part1())
    }


    @Test
    fun day7Part2TestInput(){
        assertEquals(168, Day7(day7TestInput).day7Part2())
    }

    @Test
    fun day7Part2MyInput(){
        assertEquals(101571302, Day7(day7MyInput).day7Part2())
    }

}