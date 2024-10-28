fun main(args: Array<String>) {
    println("Введите ваш возраст: ")
    val age = readLine()!!.toIntOrNull()

    val category = when {
        age == null || age < 0 -> "Некоректный возраст"
        age in 0..12 -> "Ребенок"
        age in 13..17 -> "Подросток"
        age in 18..64 -> "Взрослый"
        age >= 65 -> "Пожилой"
        else -> "Некоректный возраст"
    }
    println(category)
}