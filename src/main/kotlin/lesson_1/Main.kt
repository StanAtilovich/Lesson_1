package lesson_1

fun main() {
    val numberOfOrders = 75
    val gratitude = "Thanks for $numberOfOrders shopping!\n"
    println(gratitude)


    val numberOfEmployees = 2000
    println("количество работников в данный момент $numberOfEmployees")
    val numberEmployeesNow = numberOfEmployees - 1
    println("1 работник ушел, осталось $numberEmployeesNow\n")


    val year = 1951
    var hour = "09"
    var minute = "07"
    println("Год полета - $year")
    println("Взлет - $hour:$minute")

    hour = "10"
    minute = "55"
    println("Посадка - $hour:$minute")


    val lenght: Long = 40_868_600_000
    val age: Byte = 27
    val partOfDay: Double = 0.075
    val second: Short = 6480
    val partOfYear: String = "2.0547945205479453E-4"
    val apogee: Int = 327000

    println("\nДанные для задачи:\nрастояние$lenght\nВозраст - $age\nЧасть дня - $partOfDay\nСекунды$second\nЧасть года - $partOfYear\nАпогей арбиты - $apogee")

    val timeInSpace = 69

    val minutes = timeInSpace / 10 / 6
    val seconds = timeInSpace / 1 % 60
    println("\n$minutes минута $seconds секунд")

}

