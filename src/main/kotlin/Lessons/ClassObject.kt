package Lessons

fun main(){

    var house = Building()

    println(house.floars)

    var house1 = Building()


    house1.floars = 3
    house1.length = 7.0
    house1.width = 7.0

    println(house1.floars)

    house1.destroy()

}
