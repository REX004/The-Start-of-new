package Lesson15

class Car: Vehical(), Moveable {
    override val numberOfWheels: Int = 4



    override val speed: Double
        get() = TODO("Not yet implemented")

    override fun move() {
        a = 10
    println("Завожу двигатель")
    println("Начинаю движение")
    }

    override fun info() {
        println("Some info")
    }
}