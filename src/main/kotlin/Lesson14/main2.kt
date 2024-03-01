import lesson13.Dog

fun main(){

    // В котин существует 4 модификатора доступа: public, private, protected & internal
    val dog = Dog("Hello Der!")

    println(dog.sleep())
    println(dog.info())
    println(dog.eat())

}