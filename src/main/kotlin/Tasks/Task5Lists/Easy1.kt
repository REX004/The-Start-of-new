package Tasks.Task5Lists

fun main(){
    listOf(1, 3, 3, 2, 4, 1)
        .indices
        .sum()
        .let { println(it) }//=15

}