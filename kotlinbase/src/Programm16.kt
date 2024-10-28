fun main() {
    println("Введите длину списка:")
    val listSize = readLine()?.toIntOrNull()

    if (listSize == null || listSize <= 0) {
        println("Некорректный ввод. Введите положительное число для длины списка.")
        return
    }

    val list = mutableListOf<String>()
    repeat(listSize) { index ->
        println("Введите элемент №${index + 1}:")
        val element = readLine() ?: ""
        list.add(element)
    }

    val uniqueSet = LinkedHashSet(list)

    println("Уникальные элементы: ${uniqueSet.joinToString(", ")}")
}
