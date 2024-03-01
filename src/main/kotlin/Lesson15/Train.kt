package Lesson15

class Train: Moveable {
    override val speed: Double = 300.0

    override fun move() {
        println("Закидываю уголь")
        println("Начинаю движение")
    }
}