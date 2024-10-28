import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    val random = Random
    println("Введите число для поиска:")
    val targetNumber = readLine()?.toIntOrNull()

    if (targetNumber == null) {
        println("Введите целое число")
        return
    }

    println("Введите количество элементов массива:")
    val arraySize = readLine()?.toIntOrNull()

    if (arraySize == null || arraySize <= 0) {
        println("Введите положительное число для размера массива")
        return
    }

    val array = IntArray(arraySize) { random.nextInt(0, 100)  }.asList() //ограничение на рандом от 0 до сотки
    val target = targetNumber in array
    println(array.joinToString(" "))
    println(target)

}