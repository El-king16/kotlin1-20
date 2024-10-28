fun main() {
    println("Введите элементы списка через запятую:")
    val input = readLine()

    if (input.isNullOrEmpty()) {
        println("Список пуст")
        return
    }

    val elements = input.split(",").map { it.trim() }

    val frequencyMap = elements.groupingBy { it }.eachCount()

    println("Частота элементов:")
    for ((element, count) in frequencyMap) {
        println("$element - $count")
    }
}
