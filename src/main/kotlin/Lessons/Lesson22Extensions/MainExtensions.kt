package Lessons.Lesson22Extensions

fun main(){
//    val a = "Hello"
//    val b = a.getThirdLetter()
//    println(b)

//    val arr = arrayOf("a", "b", "c", "d", "e")
//
//    arr.swap(1,4)
//
//    arr.print()

    val dog = Dog()
    dog.bark()
    dog.fakeBark()

    dog.sleep()
}
class Dog{
    fun bark(){
        println("Woof")
    }
}

fun Dog.fakeBark(){
    println("Meow")
}

fun Dog.sleep(){
    println("I am dog")
}



fun String.getThirdLetter(): Char{
    return this[2]
}

fun <T> Array<T>.swap(i1:Int, i2:Int){
    val ell = this[i1]
    val ell2 = this[i2]
    this[i1] = ell2
    this[i2] = ell

}
fun <T> Array<T>.print(){
    for (i in this)
        println(i)
}