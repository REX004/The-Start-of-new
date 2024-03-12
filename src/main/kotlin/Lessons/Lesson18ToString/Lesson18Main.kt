package Lessons.Lesson18ToString

import User

fun main(){
    val user1 = User("Bob", "Hello", 22)
    val user2 = User("Bob", "Helleero", 2232322)


    println(user2 == user1)



    println(user1.hashCode())
    println(user2.hashCode())


}