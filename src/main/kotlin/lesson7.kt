import java.util.*

fun main(){
//    val s = "Hello World"
//
//    println(s.first())
//    println(s.last())

//    val cardNumber = "1234 5678 9101 1121"

//    println(cardNumber.startsWith("1234")) // true
//    println(cardNumber.endsWith("2323")) // false

//    val a = "Hello"
//
//    println("The length of \"Hello\" \nis ${a.length}")

//    val name = "JOhn"
//    val newName = name.decapitalize()
//    val newName = name.toUpperCase()
//    val newName = name.toLowerCase()
//    println(newName)

//    val name = " "
//
//    println(name.isEmpty())
//    println(name.isBlank())

//    val name = "      John   "
//    val newName = name.trimStart()
//    val newName = name.trim()
//
//
//    println(newName)
    // replace
    // split
//    val m = "Today мы играли за пианино и today мечтали выиграть игру today"
//    val newM = m.toLowerCase().replace("today", "*****")
//
//    println(newM)
//    val list = "Молоко Хлеб Апельсины Киви Масло"
//
//    val ar = list.split(",")
//    println(ar)

    print("Enter your name: ")

    var input = readLine()?.toLowerCase()?.capitalize()

    if (input == "Amir"){
        println("Good Job")

    }else {
        println("Sorry, Bad Name $input")
    }

}