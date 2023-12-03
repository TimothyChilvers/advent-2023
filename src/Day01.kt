fun main() {
    fun part1(input: List<String>): Int {
        val integers = listOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
        val firsts = input.map({ line -> line.toCharArray().filter({ char -> integers.contains(char) }).first() })
        val lasts = input.map({ line -> line.toCharArray().filter({ char -> integers.contains(char) }).last() })
        var runningCount = 0
        firsts.forEachIndexed({ index, first ->
            runningCount += (first.toString() + lasts[index].toString()).toInt()
        })
        return runningCount
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01")
    part1(testInput).println()
}
