import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class day8Test{

    @Test
    fun day8Part1Testinput(){
        assertEquals(26, Day8(day8TestInput).day8Part1())
    }

    @Test
    fun day8Part1Myinput(){
        assertEquals(367, Day8(day8MyInput).day8Part1())
    }


    @Test
    fun day8Part2ExampleInput(){
        assertEquals(5353, Day8(day8Part2ExampleInput).day8Part2())
    }


    @Test
    fun day8Part2TestInput(){
        assertEquals(61229, Day8(day8TestInput).day8Part2())
    }

    @Test
    fun day8Part2MyInput(){
        assertEquals(974512, Day8(day8MyInput).day8Part2())
    }

}