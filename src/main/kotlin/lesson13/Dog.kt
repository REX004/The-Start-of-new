package lesson13

class Dog(voice: String): Animal(voice) {
    override val maxAge = 20
    init {
        println("Инициализацияя объекта Dog")
    }
    override fun sleep(){
        super.sleep()
        println("I am a dog")
    }

    public  override fun makeVoice() {
        super.makeVoice()
        println("Hello")
    }

    override fun eat() {
        println("I am eating")

    }

    fun info(){
        println("Dog max age is $maxAge")
        println("Animal max age is " + super.maxAge)
    }

}