class Day2(input: String) {
    data class Position(val horizontal: Int, val depth: Int, val aim: Int = 0) {
        fun calculatePlannedCourse() = horizontal * depth
    }

    private val input = input.split("\n").map {
        val command = it.split(" ")
        Pair(command[0], command[1].toInt())
    }

    fun day2Part1() = input.fold(Position(0, 0)) { acc, command ->
        when (command.first) {
            "forward" -> acc.copy(horizontal = acc.horizontal + command.second)
            "up" -> acc.copy(depth = acc.depth - command.second)
            "down" -> acc.copy(depth = acc.depth + command.second)
            else -> throw RuntimeException()
        }
    }.calculatePlannedCourse()

    fun day2Part2() = input.fold(Position(0, 0, 0)) { acc, command ->
        when (command.first) {
            "forward" -> acc.copy(horizontal = acc.horizontal + command.second, depth = acc.depth + acc.aim * command.second)
            "up" -> acc.copy(aim = acc.aim - command.second)
            "down" -> acc.copy(aim = acc.aim + command.second)
            else -> throw RuntimeException()
        }
    }.calculatePlannedCourse()
}


val day2TestInput = """
    forward 5
    down 5
    forward 8
    up 3
    down 8
    forward 2
""".trimIndent()

val day2MyData = """
    forward 8
    down 9
    forward 2
    down 1
    forward 9
    forward 7
    forward 5
    up 3
    up 3
    down 5
    forward 2
    down 8
    down 3
    forward 6
    down 2
    down 4
    down 7
    down 7
    forward 2
    down 6
    down 8
    down 2
    down 8
    up 9
    down 8
    forward 8
    down 5
    up 4
    forward 4
    forward 4
    forward 3
    down 9
    forward 8
    up 3
    forward 2
    forward 3
    forward 6
    down 7
    down 2
    forward 4
    forward 7
    forward 6
    up 5
    up 1
    forward 4
    down 9
    up 6
    forward 6
    up 9
    forward 1
    down 9
    forward 4
    down 3
    forward 7
    forward 5
    down 1
    up 9
    down 9
    forward 6
    forward 1
    down 5
    down 6
    forward 6
    forward 3
    up 4
    up 9
    down 3
    forward 6
    up 4
    up 6
    forward 4
    down 1
    down 2
    up 9
    forward 8
    down 2
    down 3
    down 4
    up 3
    forward 3
    forward 4
    down 4
    forward 7
    forward 9
    down 7
    forward 6
    forward 2
    up 6
    forward 7
    forward 9
    down 5
    forward 6
    up 9
    forward 6
    forward 2
    forward 6
    up 3
    down 1
    forward 5
    down 3
    forward 7
    down 4
    forward 1
    forward 7
    down 1
    up 2
    down 7
    down 6
    forward 8
    forward 2
    forward 1
    forward 9
    down 3
    forward 3
    down 6
    up 8
    up 3
    forward 1
    forward 3
    forward 7
    down 9
    forward 7
    forward 3
    up 6
    forward 4
    down 9
    forward 2
    down 4
    up 2
    down 1
    up 1
    down 6
    forward 1
    up 6
    up 7
    forward 3
    forward 3
    forward 2
    forward 1
    down 7
    forward 9
    down 5
    down 9
    up 9
    forward 3
    forward 8
    down 3
    forward 9
    forward 4
    down 3
    up 4
    up 8
    up 4
    down 8
    down 6
    down 5
    forward 2
    up 6
    up 1
    up 9
    down 4
    up 8
    forward 6
    down 1
    forward 7
    up 2
    forward 6
    up 2
    down 6
    down 5
    forward 2
    down 2
    down 1
    forward 8
    forward 1
    up 9
    forward 3
    down 6
    forward 2
    forward 8
    down 3
    forward 3
    forward 4
    forward 7
    forward 2
    up 4
    forward 8
    forward 1
    forward 9
    down 3
    down 1
    forward 8
    down 5
    down 3
    forward 5
    down 7
    down 1
    forward 8
    forward 2
    forward 4
    forward 8
    forward 6
    down 1
    forward 5
    forward 9
    forward 9
    up 9
    forward 9
    forward 4
    down 5
    down 2
    down 3
    forward 8
    forward 9
    up 8
    up 1
    up 6
    forward 7
    up 9
    forward 2
    forward 6
    up 6
    forward 3
    up 4
    forward 1
    down 4
    up 6
    down 5
    forward 7
    forward 6
    down 3
    down 4
    forward 3
    down 6
    down 1
    forward 5
    forward 7
    up 8
    forward 4
    up 7
    down 4
    forward 3
    down 7
    forward 7
    forward 4
    forward 1
    forward 8
    up 5
    up 6
    forward 5
    forward 3
    down 6
    forward 8
    forward 2
    forward 7
    down 7
    down 8
    down 3
    up 3
    down 1
    down 1
    forward 6
    forward 9
    forward 4
    forward 9
    forward 6
    down 1
    forward 9
    down 6
    down 8
    up 5
    down 8
    forward 4
    forward 2
    up 6
    down 9
    forward 6
    down 9
    down 6
    down 6
    forward 2
    up 8
    down 7
    down 2
    forward 2
    forward 2
    down 1
    up 8
    down 5
    forward 9
    forward 5
    forward 8
    forward 8
    forward 1
    down 2
    down 7
    up 5
    forward 9
    forward 4
    forward 4
    forward 6
    down 7
    up 5
    forward 5
    up 9
    down 7
    down 4
    down 9
    forward 7
    up 4
    down 1
    down 6
    up 2
    up 6
    down 2
    forward 9
    down 3
    forward 3
    forward 4
    forward 1
    up 2
    forward 6
    down 3
    forward 2
    down 9
    forward 8
    forward 3
    forward 2
    up 5
    forward 3
    forward 1
    down 8
    up 2
    up 4
    up 5
    down 3
    down 6
    down 1
    forward 4
    up 3
    down 1
    down 4
    up 6
    forward 8
    down 5
    down 7
    down 7
    forward 9
    forward 9
    down 2
    up 2
    down 5
    forward 5
    forward 4
    down 7
    forward 4
    down 2
    forward 2
    forward 4
    up 8
    down 8
    up 4
    forward 2
    forward 2
    up 8
    forward 2
    down 3
    down 7
    down 9
    up 6
    up 3
    forward 2
    forward 3
    up 8
    forward 6
    up 8
    up 1
    down 6
    down 8
    up 9
    down 1
    up 8
    forward 9
    forward 4
    forward 9
    forward 8
    forward 1
    down 6
    down 7
    up 5
    down 1
    forward 9
    down 9
    forward 7
    down 5
    forward 7
    down 1
    down 4
    down 4
    forward 6
    forward 1
    up 4
    up 2
    forward 7
    down 6
    down 2
    down 3
    up 7
    up 1
    down 6
    down 6
    down 8
    down 8
    forward 5
    forward 1
    forward 5
    up 8
    forward 8
    up 8
    forward 1
    down 9
    forward 1
    up 7
    up 3
    down 1
    down 9
    up 2
    down 3
    down 2
    forward 9
    up 9
    up 1
    up 5
    forward 8
    down 3
    down 7
    forward 7
    down 8
    down 5
    down 5
    down 4
    down 7
    forward 6
    forward 6
    forward 4
    forward 6
    forward 3
    up 5
    forward 2
    down 7
    forward 1
    down 4
    down 7
    down 7
    forward 4
    down 2
    up 4
    forward 2
    up 2
    up 3
    down 5
    forward 3
    down 2
    forward 5
    down 2
    down 1
    up 4
    up 5
    up 9
    forward 1
    forward 9
    down 9
    up 8
    forward 9
    forward 7
    down 9
    down 2
    down 9
    forward 9
    forward 7
    up 7
    forward 6
    up 6
    forward 5
    forward 6
    down 4
    forward 8
    forward 5
    forward 2
    up 4
    down 4
    forward 1
    down 2
    up 9
    up 7
    up 2
    up 3
    down 9
    forward 4
    up 6
    forward 5
    forward 5
    forward 9
    forward 1
    down 6
    forward 8
    down 5
    up 3
    up 1
    down 2
    up 4
    down 1
    down 9
    forward 8
    down 2
    forward 7
    down 7
    up 5
    down 7
    down 3
    forward 2
    forward 2
    forward 4
    down 9
    down 6
    down 9
    forward 6
    down 6
    down 9
    forward 1
    down 1
    forward 8
    down 4
    up 6
    down 2
    forward 9
    down 3
    up 3
    down 2
    up 2
    up 5
    down 8
    forward 1
    forward 3
    down 8
    up 3
    up 3
    up 3
    forward 2
    up 3
    down 4
    down 1
    down 7
    forward 3
    down 3
    down 8
    down 9
    forward 9
    forward 3
    up 4
    forward 8
    forward 8
    up 7
    up 3
    forward 6
    down 9
    up 1
    forward 2
    down 6
    up 6
    forward 2
    down 6
    down 3
    up 7
    forward 6
    down 6
    down 1
    down 5
    forward 6
    up 2
    down 2
    down 3
    down 1
    up 9
    forward 6
    up 2
    forward 2
    down 6
    up 3
    up 4
    forward 8
    up 8
    up 4
    down 7
    down 4
    up 9
    forward 9
    up 6
    forward 5
    forward 7
    forward 2
    forward 8
    down 7
    down 5
    down 4
    up 3
    forward 7
    down 2
    forward 5
    forward 9
    forward 4
    forward 7
    forward 8
    up 6
    down 1
    forward 3
    forward 9
    forward 1
    down 8
    down 1
    down 3
    down 1
    down 1
    up 3
    down 5
    up 1
    down 8
    down 2
    down 8
    down 3
    forward 2
    forward 8
    forward 4
    down 8
    down 6
    forward 8
    down 7
    forward 8
    forward 2
    forward 6
    forward 6
    forward 4
    up 2
    forward 3
    up 8
    forward 7
    forward 4
    down 8
    down 3
    down 4
    up 8
    forward 5
    forward 3
    up 4
    up 2
    down 6
    forward 4
    up 8
    up 3
    up 8
    down 3
    up 1
    forward 2
    down 4
    down 4
    down 9
    down 5
    forward 9
    up 6
    up 5
    down 8
    down 6
    down 7
    forward 8
    forward 4
    up 4
    forward 1
    down 4
    up 4
    down 9
    up 6
    down 9
    up 3
    forward 4
    down 1
    down 5
    down 5
    up 1
    down 8
    down 9
    down 1
    forward 4
    down 8
    down 6
    down 1
    forward 2
    down 5
    up 1
    up 1
    down 1
    down 3
    down 3
    down 8
    down 6
    down 5
    down 3
    up 3
    forward 5
    down 7
    down 7
    forward 2
    forward 6
    forward 1
    down 8
    forward 2
    up 2
    forward 2
    down 2
    forward 7
    down 7
    down 9
    up 2
    up 2
    down 3
    forward 1
    down 1
    forward 5
    forward 4
    down 4
    forward 6
    forward 2
    forward 7
    forward 2
    forward 8
    down 4
    up 3
    down 3
    up 9
    down 7
    up 8
    down 1
    down 8
    up 9
    down 6
    up 5
    up 8
    down 2
    down 3
    forward 1
    down 5
    down 5
    forward 8
    down 9
    forward 7
    forward 8
    down 1
    down 2
    up 8
    down 2
    up 5
    down 3
    forward 5
    forward 6
    up 4
    up 3
    forward 5
    forward 1
    down 2
    forward 2
    down 9
    up 7
    down 2
    up 8
    forward 2
    forward 2
    up 4
    forward 5
    down 4
    up 6
    up 8
    forward 9
    up 1
    forward 9
    forward 7
    forward 3
    forward 1
    down 1
    forward 5
    forward 2
    forward 6
    forward 6
    forward 3
    forward 7
    up 7
    down 6
    down 2
    up 5
    down 5
    up 2
    forward 7
    forward 2
    down 9
    up 4
    down 5
    down 3
    forward 7
    down 2
    forward 9
    forward 6
    down 3
    down 3
    forward 6
    down 9
    forward 7
    up 5
    up 6
    down 3
    up 4
    forward 4
    up 3
    down 8
    down 9
    down 9
    down 4
    up 1
    up 2
    down 3
    forward 4
    forward 5
    down 1
    up 3
    down 8
    down 7
    forward 2
    up 4
    down 8
    forward 1
    forward 6
    up 8
    down 2
    down 6
    forward 5
    up 8
    forward 7
    down 9
    forward 9
    down 3
    forward 9
    forward 1
    forward 6
    up 7
    forward 1
    down 5
    down 8
    down 3
    forward 5
    forward 6
    down 7
    forward 4
    down 6
    forward 4
    up 4
    down 4
    forward 4
    down 9
    forward 3
    down 6
    forward 3
    down 3
    up 3
    forward 3
    down 4
    down 4
    down 4
    down 5
    forward 5
    down 9
    down 7
    down 1
    forward 5
    forward 3
    forward 8
    down 5
    forward 4
    forward 3
    down 8
    forward 1
    forward 1
    down 6
    forward 4
    down 5
    forward 8
    down 7
    forward 6
    down 7
    up 2
    forward 6
    down 7
    down 3
    down 6
    up 2
    forward 8
    forward 5
    down 6
    forward 5
    up 7
    forward 8
    down 1
    forward 2
    up 7
    down 4
    up 5
    forward 5
    forward 4
    forward 3
    down 1
    forward 8
    up 9
    down 2
    up 4
    forward 7
    up 6
    forward 3
    down 8
    forward 4
    down 2
    down 9
    forward 8
    down 5
    forward 3
    down 9
    up 1
    forward 6
    up 9
    down 7
    forward 5
    forward 3
    down 8
    down 6
    up 3
    down 5
    forward 7
    up 2
    forward 4
    up 1
    down 8
    down 7
    forward 3
    forward 1
    down 3
    down 8
    forward 7
    up 2
    down 7
    up 6
    down 7
    down 1
    down 3
    up 6
    forward 2
    down 5
    forward 1
    forward 7
    forward 2
    down 8
    down 8
    down 7
    forward 7
    forward 5
    forward 1
    forward 7
    forward 3
    down 2
    up 8
    up 4
    up 6
    down 2
    down 1
    down 5
    down 3
    forward 2
    up 1
    forward 8
    up 8
    forward 7
    up 1
    down 7
    forward 7
    forward 5
    forward 3
    up 4
    down 5
    down 5
    forward 3
    forward 9
    down 9
    up 6
    up 7
    down 7
    forward 7
""".trimIndent()