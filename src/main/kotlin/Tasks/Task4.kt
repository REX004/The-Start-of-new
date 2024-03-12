package Tasks

fun main() {
    while (true){
        print("Введите числа через запятую: ")

        val input = readLine()

        if (input.isNullOrEmpty()) {
            println("Ошибка ввода.")
        } else {
            val evenNumbers = input.split(",").mapNotNull { it.trim().toIntOrNull() }.filter { it % 2 == 0 }
            println("Исходный список: $input")
            println("Список четных чисел: $evenNumbers")
        }
    }

}
