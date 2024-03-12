package Tasks
fun main() {
    while (true){
        println("Введите число:")
        val input = readLine()
        val number = input?.toIntOrNull()

        if (number == null || number < 0) {
            println("Некорректный ввод. Пожалуйста, введите неотрицательное число.")
            return
        }

        var factorial: Long = 1
        for (i in 2..number) {
            factorial *= i
        }

        println("Факториал числа $number равен $factorial")
    }

}