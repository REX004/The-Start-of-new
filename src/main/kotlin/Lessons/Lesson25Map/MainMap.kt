package Lessons.Lesson25Map

fun main(){
    val passports = mutableMapOf<String, String>(

        )
    var vector = "23455"
    val telephones = mapOf(
        79872559009 to vector,
        79872559001 to 124.457,
        79892559339 to 12455.34590,
        79872555609 to 113525.7890,
        79856559009 to 3455,

        )

    val books = mapOf(
        "Ivan Ivanov" to listOf("Book 1", "Book 2"),
        "Sasha Belkov" to listOf("Book 4", "Book 7")
    )
    val person = passports.get("QT123")


    passports.put("UY345", "Volodya Borisov")
    passports.put("IM432", "Semen Volkov")


    passports.replace("UY345", "Walter Jackson")
//    println(passports.size)
//    println(passports["UY345"])

    for (value in passports.values){
        println(value)
    }
//    val i = readLine()
//    if (i.isNullOrEmpty() ){
//        println("No people found")
//    }else{
//        println(passports[i])
//    }

}




















//val passwordNumbers = listOf("QW111", "RT222", "OM123")
//val persons = listOf("Ivan Ivanov", "Misha Kovalev", "Dima Petrov")
//
//fun main(){
//    println(getPersonByPassportNumber("RT222"))
//}
//
//fun getPersonByPassportNumber(number: String): String{
//    val i = passwordNumbers.indexOf(number)
//    val person = persons[i]
//
//    return person
//
//}