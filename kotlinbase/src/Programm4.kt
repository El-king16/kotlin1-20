fun main(args: Array<String>) {
    println("Введите символ в нижнем регистре:")
    val inputChar = readLine()?.firstOrNull() ?: return

    val upperChar = inputChar.uppercaseChar()

    val unicode = upperChar.code
    println("Символ в верхнем регистре: $upperChar")
    println("Код Unicode символа: $unicode")
}