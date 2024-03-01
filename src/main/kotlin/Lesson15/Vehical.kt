package Lesson15

abstract class Vehical {

    abstract val numberOfWheels: Int

    var a = 5

    open fun info(){
        println("Number of wheels is $numberOfWheels")
    }
    abstract fun move()

}