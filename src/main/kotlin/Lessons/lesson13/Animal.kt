package Lessons.lesson13

abstract class Animal(val voice: String) {

    open val maxAge = 100

    init {
        println("Инициализация объекта Animal")
    }
    open fun sleep(){
        println("I am sleeping")
    }

    protected open fun makeVoice(){
        println(voice)
    }

    abstract fun eat()

}