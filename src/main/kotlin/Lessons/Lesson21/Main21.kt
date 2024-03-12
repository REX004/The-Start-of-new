package Lessons.Lesson21

fun main() {
    test()
}
fun test(){
    val a = 10
    val b = 2
    val tel = 12345678

    try {
        validate(tel)
    } catch (e: ValidationExeption){
        println(e.message)
    }
}
fun validate(tel: Int){
    if (tel < 123456789){
        throw ValidationExeption("Ошибка валидации")
    }
}