class Day6(input: String) {
    class Lanternfish(var daysTilSpawn: Int) {
        fun spawn() = if (daysTilSpawn == 0) {
            daysTilSpawn = 6
            Lanternfish(8)
        } else {
            daysTilSpawn -= 1
            null
        }
    }

    val input = input.split(",").map { it.toInt() }

    fun day6Part1(days: Int) = spawnForDayMutable(input.map { Lanternfish(it) }.toMutableList(), days).size

    fun day6Part2(days: Int): Long {
        val fishOnDay = Array(2) { Array(9) { 0L } }
        input.map { fishOnDay[1][it]++ }
        val fish = (days downTo 1).fold(fishOnDay) {  acc, i ->
            val newList =  Array(2) { Array(9) { 0L } }

            newList[0][8] = acc[0][0]
            newList[0][7] = acc[0][8]
            newList[0][6] = acc[0][7]
            newList[1][6] = acc[0][0]
            newList[0][5] = acc[0][6]
            newList[0][4] = acc[0][5]
            newList[0][3] = acc[0][4]
            newList[0][2] = acc[0][3]
            newList[0][1] = acc[0][2]
            newList[0][0] = acc[0][1]


            newList[1][6] = newList[1][6] + acc[1][0]
            newList[0][8] = newList[0][8] + acc[1][0]
            newList[1][5] = acc[1][6]
            newList[1][4] = acc[1][5]
            newList[1][3] = acc[1][4]
            newList[1][2] = acc[1][3]
            newList[1][1] = acc[1][2]
            newList[1][0] = acc[1][1]

  //          newList.forEach {
  //              it.forEach { print(it) }
  //              println()
  //          }
  //          println()

            newList
        }
        return fish.fold(0L){acc: Long, ints: Array<Long> ->
            acc + ints.sum()
        }
    }

    private tailrec fun spawnForDay(lanternfish: List<Lanternfish>, daysLeft: Int): List<Lanternfish> =
        if (daysLeft == 0) lanternfish
        else {
            println("daysLeft $daysLeft size ${lanternfish.size} ")
            spawnForDay(lanternfish = lanternfish + lanternfish.fold(emptyList()) { acc, fish ->
                val newFish = fish.spawn()
                if (newFish != null) acc + newFish else acc
            }, daysLeft = daysLeft - 1)
        }
    private tailrec fun spawnForDayMutable(lanternfish: MutableList<Lanternfish>, daysLeft: Int): MutableList<Lanternfish> =
        if (daysLeft == 0) lanternfish
        else {
       //     println("daysLeft $daysLeft  ")
            lanternfish.addAll(lanternfish.fold(mutableListOf()) { acc, fish ->
                val newFish = fish.spawn()
                if (newFish != null) acc.add(newFish)
                acc
            })
            spawnForDayMutable(lanternfish = lanternfish, daysLeft = daysLeft - 1)
        }
}

val day6TestInput = """ 
    3,4,3,1,2
""".trimIndent()

val day6MyData = """
    5,1,1,4,1,1,4,1,1,1,1,1,1,1,1,1,1,1,4,2,1,1,1,3,5,1,1,1,5,4,1,1,1,2,2,1,1,1,2,1,1,1,2,5,2,1,2,2,3,1,1,1,1,1,1,1,1,5,1,1,4,1,1,1,5,4,1,1,3,3,2,1,1,1,5,1,1,4,1,1,5,1,1,5,1,2,3,1,5,1,3,2,1,3,1,1,4,1,1,1,1,2,1,2,1,1,2,1,1,1,4,4,1,5,1,1,3,5,1,1,5,1,4,1,1,1,1,1,1,1,1,1,2,2,3,1,1,1,1,1,2,1,1,1,1,1,1,2,1,1,1,5,1,1,1,1,4,1,1,1,1,4,1,1,1,1,3,1,2,1,2,1,3,1,3,4,1,1,1,1,1,1,1,5,1,1,1,1,1,1,1,1,4,1,1,2,2,1,2,4,1,1,3,1,1,1,5,1,3,1,1,1,5,5,1,1,1,1,2,3,4,1,1,1,1,1,1,1,1,1,1,1,1,5,1,4,3,1,1,1,2,1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1,1,1,1,3,3,1,2,2,1,4,1,5,1,5,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1,1,1,1,5,1,1,1,4,3,1,1,4
""".trimIndent()