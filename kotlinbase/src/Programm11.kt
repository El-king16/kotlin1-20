fun main(args: Array<String>) {
    println("Введите число дня недели: ")
    val day = readLine()!!.toIntOrNull()

    val week = when{
        day == null || day <=0 -> "Некорректное число"
        day == 1 -> "Понедельник"
        day == 2 -> "Вторник"
        day == 3 -> "Среда"
        day == 4 -> "Четверг"
        day == 5 -> "Пятница"
        day == 6 -> "Суббота"
        day == 7 -> "Воскресенье"
        else -> "некоректное число"
    }
    println(week)
}