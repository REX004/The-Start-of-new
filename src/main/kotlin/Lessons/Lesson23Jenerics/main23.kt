package Lessons.Lesson23Jenerics

fun main() {

    val moneyCase = Case<Money, Int>(Money(1000000000), 12)


    println(moneyCase.get())
    println(moneyCase.get2())

    moneyCase.add(Money(10000))
    println(moneyCase.get())

    val jeweleryCase = Case<Jewelery, Char>(Jewelery("Brilliant"), 'A')

    println(jeweleryCase.get())
    jeweleryCase.add(Jewelery("Jewelery X"))
    println(jeweleryCase.get())

}