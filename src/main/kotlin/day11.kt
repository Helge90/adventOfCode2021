class Day11(input: String) {
    class DumboOctopus(var energy: Int, var flashed: Boolean = false, var neighbors: List<DumboOctopus> = emptyList()) {
        fun flash(): Int {
            if (flashed) return 0 else energy += 1
            if (energy > 9) {
                energy = 0
                flashed = true
                return 1 + neighbors.sumOf { it.flash() }
            }
            return 0
        }
    }

    private val octopus = input.split("\n").map {
        it.map { energy -> DumboOctopus(energy.digitToInt()) }
    }.let { findNeighbors(it) }.flatten()


    fun day11Part1(): Int = (1..100).sumOf { _ ->
        octopus.forEach { it.flashed = false }
        octopus.sumOf { it.flash() }
    }

    fun day11Part2(): Int {
        (1..1000).forEach { day ->
            octopus.forEach { it.flashed = false }
            if (octopus.sumOf { it.flash() } == 100) return day
        }
        throw RuntimeException()
    }

    private fun findNeighbors(octopus: List<List<DumboOctopus>>) =
        octopus.mapIndexed { y, length ->
            length.mapIndexed { x, dumboOctopus ->
                dumboOctopus.neighbors = getAdjacent(x, y, octopus)
                dumboOctopus
            }
        }

    private fun getAdjacent(x: Int, y: Int, octopus: List<List<DumboOctopus>>): List<DumboOctopus> {
        val length = octopus.first().size
        val depth = octopus.size
        val right = if (x < length - 1) octopus[y][x + 1] else null
        val left = if (x > 0) octopus[y][x - 1] else null
        val above = if (y > 0) octopus[y - 1][x] else null
        val aboveAndRight = if (y > 0 && x < length - 1) octopus[y - 1][x + 1] else null
        val aboveAndLeft = if (y > 0 && x > 0) octopus[y - 1][x - 1] else null
        val below = if (y < depth - 1) octopus[y + 1][x] else null
        val belowAndRight = if (y < depth - 1 && x < length - 1) octopus[y + 1][x + 1] else null
        val belowAndLeft = if (y < depth - 1 && x > 0) octopus[y + 1][x - 1] else null
        return listOfNotNull(right, left, above, aboveAndRight, aboveAndLeft, below, belowAndRight, belowAndLeft)
    }
}


val day11TestInput = """
    5483143223
    2745854711
    5264556173
    6141336146
    6357385478
    4167524645
    2176841721
    6882881134
    4846848554
    5283751526
""".trimIndent()

val day11MyInput = """
    4438624262
    6263251864
    2618812434
    2134264565
    1815131247
    2612457325
    8585767584
    7217134556
    2825456563
    8248473584
""".trimIndent()