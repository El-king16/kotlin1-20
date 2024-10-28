fun main(args: Array<String>) {
    println("Введите строку (или нажмите Enter, чтобы оставить пустой):")
    val input: String? = readLine()

    val length = input?.length ?: "Строка имеет значение null"    // Проверка на то что строка не равна null и вывод её длины

    println("Длина строки: $length")
}