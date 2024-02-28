fun main(){
    val list: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val names = arrayOf("Bob", "Summer", "Jenny", "Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer","Bob", "Summer")

//    println(names[2])
//    println(names.get(2))
//    names.set(0, "hdpi")
//    println(names[0])
//    println(names.size)
//    for (i in list){
//        println(i)
//    }
//    list.forEach { currentElement ->
//        if (currentElement > 3)
//            println("Эта цифра больше 3")
//        else println("Эта цифра меньше 3")
//    }
    list.forEachIndexed { index, number ->
        println("Index $index has number $number")
    }

}