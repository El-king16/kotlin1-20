fun main(args: Array<String>) {
    println("Введите первый символ:")
    val char1 = readLine()?.firstOrNull() ?: return //если ничего не вводиться то алгоритм останавливается

    println("Введите второй символ:")
    val char2 = readLine()?.firstOrNull() ?: return

    val unicodeDif = char1.code - char2.code

    println("Разность Unicode значений: $unicodeDif")
}