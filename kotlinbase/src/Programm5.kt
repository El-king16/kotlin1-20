fun main(args: Array<String>) {
    val strings = mutableListOf<String>()

    for (i in 1..5) {
        println("Введите строку №$i:")
        val input = readLine() ?: ""
        strings.add(input)
    }

    val combinedString = strings.joinToString(" ")

    println(combinedString)
}