package Tasks

fun main(){
    print("Введите любые целые числа через запятую: ")

    val input = readLine()
    val numbers = input?.split(",")

    if (numbers.isNullOrEmpty()){
        println("Ошибка ввода")
        return
    }

    val SortedNumbers = numbers.toSet().sorted()

    println("Цифры в отсортированном порядке: $SortedNumbers")
}