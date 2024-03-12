package Lessons.Lesson16

class MoscowCoffeeShop(americanoPrice: Double, cappuccinoPrice: Double, lattePrice: Double) :
    CofeeShop(americanoPrice, cappuccinoPrice, lattePrice), Biscuits {
    override fun makeAmericano() {
        americanoCount++
        println("Thanks for order Americano in Moscow Coffee Shop")
    }

    override fun makeCappuccino() {
        cappuccinoCount++
        println("Thanks for order Cappuccino in Moscow Coffee Shop")
    }

    override fun makeLatte() {
        latteCount++
        println("Thanks for order Latte in Moscow Coffee Shop")
    }

    override fun sellBiscuits() {
        println("Take your biscuits")
    }
}