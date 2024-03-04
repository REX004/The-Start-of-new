package Lesson16

import kotlin.system.exitProcess

fun main() {

    val moscowCoffeeShop = MoscowCoffeeShop(20.0, 10.0, 15.0)
    val newYorkCoffeeShop = NewYorkCoffeeShop(10.0, 12.0, 16.0)
    println("Hello Man! Welcome to other shop, choose a city:")

    while (true) {
        println("Choose a city:")

        println("1.Moscow\n2. New York\n\n0. Exit")


        var currentCoffeeShop: CofeeShop = when (readlnOrNull()) {
            "1" -> moscowCoffeeShop
            "2" -> newYorkCoffeeShop
            "0" -> break
            else -> {
                println("Sorry, we have not got this city!")
                continue
            }
        }

        println("Choose a drink: ")
        println("1. Americano\n2. Cappuccino\n3. Latte\n\n0. Show statistic")


        when (readlnOrNull()) {
            "1" -> {
                println(currentCoffeeShop.makeAmericano())
                checkAndAskForBiscuits(currentCoffeeShop)
            }

            "2" -> {
                println(currentCoffeeShop.makeCappuccino())
                checkAndAskForBiscuits(currentCoffeeShop)
            }

            "3" -> {
                println(currentCoffeeShop.makeLatte())
                checkAndAskForBiscuits(currentCoffeeShop)
            }

            "0" -> println(currentCoffeeShop.showStatistics())

            else -> {
                println("Sorry, we have not got this city!")
                exitProcess(1)
            }
        }


    }
}
    fun checkAndAskForBiscuits(currentCoffeeShop: CofeeShop){
        if (currentCoffeeShop is Biscuits){
            println("Would you like biscuits?")
            println("1. Yes\n2. No")

            val isBiscuits = readLine()

            if (isBiscuits == "1"){
                currentCoffeeShop.sellBiscuits()
            }
        }
    }


