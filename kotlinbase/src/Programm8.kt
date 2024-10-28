fun main(args: Array<String>) {
    println("Введите ваш возраст:")
    val age = readLine()?.toIntOrNull()

    when {
        age == null || age < 0 -> println("Введено некорректное значение")
        age >= 18 -> println("Совершеннолетний")
        else -> println("Несовершеннолетний")
    }
}