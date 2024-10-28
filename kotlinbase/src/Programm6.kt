fun main(args: Array<String>) {
    println("Введите строку:")
    val input = readLine() ?: ""

    if (input.length < 2) {
        println("Строка слишком короткая для выполнения операции.")
    } else {
        val modifiedString = input.drop(2) + input.take(2)

        println("Результат: $modifiedString")
    }
}