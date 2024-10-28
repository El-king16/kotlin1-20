fun main(args: Array<String>) {
    println("Введите длину массива:")
    val arraySize = readLine()?.toIntOrNull()

    if (arraySize == null || arraySize <= 0) {
        println("Введите положительное число для длины массива")
        return
    }

    val array = IntArray(arraySize) { index ->
        println("Введите элемент №${index + 1}:")
        readLine()?.toIntOrNull() ?: 0
    }

    val reversedArray = array.reversedArray()

    println("Массив в обратном порядке: ${reversedArray.joinToString(", ")}")
}