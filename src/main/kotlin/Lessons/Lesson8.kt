package Lessons
//fun myFunc(arr: Array<String>, count: Int){
//    for (name in arr) {
//        when(name){
//            "Bob" -> println("Access denied $count times")
//            "Sara" -> println("Welcome, Peter")
//            else -> println("We dont know you")
//
//        }
//    }
//}

fun main(){
//    val names = arrayOf("Bob", "Sara", "Victor")
//    val lastNames = arrayOf("Bob", "Sara", "Victor")
//
//    myFunc(names, 2)
//        if (readLine() == "Get all names") {
//            myFunc(names, 5)
//        }

    var x = 2
    var y = 3

    val result = add(x, y)

    println(result)

}
fun add(x: Int, y: Int): Int {

    return x + y
}