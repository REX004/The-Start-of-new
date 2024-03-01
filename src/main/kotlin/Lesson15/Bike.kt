package Lesson15

class Bike: Vehical() {
    override val numberOfWheels: Int = 2

    override fun move() {
        println("Начинаю крутить педаль")
        println("Начинаю движение")
    }
}