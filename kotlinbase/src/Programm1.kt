fun main(args: Array<String>) {
    println("Введите первое число: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0 //toDouble конвертирует число в double, а orNull задает 0.0 если пустое значение(если не введено чилсло окда?)

    println("Введите второе число: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Введите третье число: ")
    val num3 = readLine()?.toDoubleOrNull() ?: 0.0

    val avg = (num1 + num2 + num3) / 3

    println("сред. число трех чисел: $avg")
}
