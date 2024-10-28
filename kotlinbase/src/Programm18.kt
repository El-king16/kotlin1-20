fun main() {
    println("Введите количество элементов первого множества:")
    val firstSetSize = readLine()?.toIntOrNull()

    if (firstSetSize == null || firstSetSize <= 0) {
        println("Некорректный ввод. Введите положительное число для количества элементов.")
        return
    }

    val firstSet = mutableSetOf<String>()
    println("Введите элементы первого множества:")
    repeat(firstSetSize) {
        val element = readLine() ?: ""
        firstSet.add(element)
    }

    println("Введите количество элементов второго множества:")
    val secondSetSize = readLine()?.toIntOrNull()

    if (secondSetSize == null || secondSetSize <= 0) {
        println("Некорректный ввод. Введите положительное число для количества элементов.")
        return
    }

    val secondSet = mutableSetOf<String>()
    println("Введите элементы второго множества:")
    repeat(secondSetSize) {
        val element = readLine() ?: ""
        secondSet.add(element)
    }

    val intersectionSet = firstSet intersect secondSet

    println("Общие элементы: ${intersectionSet.joinToString(", ")}")
}
