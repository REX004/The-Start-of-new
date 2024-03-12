package Lessons.Lesson15

interface Moveable {
    val speed: Double
    fun move()

    fun info(){
        println("Hello from interface ")
    }
}