package Tasks

fun main(){
    println("Введите цифру: ")

    val firstInput = readLine()?.split(",").isNullOrEmpty()

    println("Введите цифру: ")

    val secondInput = readLine()?.split(",").isNullOrEmpty()

    if (firstInput == secondInput){
        println("Цифры одинаковы")
    }else{
        println("Цифры отличаются")
    }
}