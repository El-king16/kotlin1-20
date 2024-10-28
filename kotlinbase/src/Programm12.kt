fun main(args: Array<String>) {
    println("Введите число:")
    val n = readLine()?.toIntOrNull()

    if (n == null || n <= 2) {
        println("Число должно быть больше 2")
    } else {
        for (i in 2 until n) {
            println(i * 2)
        }
    }
}