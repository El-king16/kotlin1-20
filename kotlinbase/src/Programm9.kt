fun main(args: Array<String>) {
    println("Введите число:")
    val number = readLine()?.toIntOrNull()

    if (number == null) {
        println("Введено некорректное значение")
    } else if (number % 2 == 0) {
        println("Чётное число")
    } else {
        println("Нечётное число")
    }
}