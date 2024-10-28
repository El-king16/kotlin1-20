fun main(args: Array<String>) {
    println("Введите символ:")
    val input = readLine()

    val isLetter = input?.length == 1 && input[0].isLetter()
    println(isLetter)
}