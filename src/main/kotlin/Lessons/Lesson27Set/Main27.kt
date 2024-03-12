package Lessons.Lesson27Set

fun main(){
    val mySet = setOf("apple", "orange", "banana")
    val mySet2 = setOf("banana", "orange", "watermelon")

    println(mySet.union(mySet2))

    val mySet4 = mySet.intersect(mySet2)
    println(mySet4)

    val mySet5 = mySet2.subtract(mySet)
    println(mySet5)
//    println(mySet)
//    println(mySet.contains("banana"))
//
//    val mutableSet = mutableSetOf(1, 2, 3, 4, 5, 1)
//    mutableSet.add(2)
//    println(mutableSet)
//
//    for (element in mySet){
//        println(element)
//    }



}