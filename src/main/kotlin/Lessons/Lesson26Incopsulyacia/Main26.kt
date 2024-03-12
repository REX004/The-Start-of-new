package Lessons.Lesson26Incopsulyacia

fun main(){
    val tv = TV()
    tv.watch(2)

    println(tv.getChannels())

    tv.setChannels(arrayOf("Discovery", "Nat Geo"))

    tv.watch(1)
}