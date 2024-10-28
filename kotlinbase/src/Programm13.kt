fun main(args: Array<String>) {
    println("Введите число для обратного отсчёта:")
    val number = readLine()?.toIntOrNull()

    if (number == null || number <= 0) {
        println("Введите положительное число")
    } else {
        for (i in number downTo 1) {
            println(i)
        }
        println("Старт!")
    }
}