package Lessons

fun main() {
    var message = readLine()
    var age: Int

    age = 18


    when(message){
        "Понедельник" -> println("Сегодня Понедельник")
        "Вторник" -> println("Сегодня Вторник")
        "Среда" -> println("Сегодня Среда")
        "Четверг" -> println("Сегодня Четверг")
        "Пятница" -> println("Сегодня понедельник")
        "Суббота" -> println("Сегодня Суббота")
        "Воскресенье" -> println("Сегодня Воскресенье")
        else -> println("Нет такого дня")
    }
    }
//    if (age >= 140 ){
//        println("Вам 120 или больше 120")
//    } else if (age >= 110){
//        println("Вам 110 или больше 110")
//    } else if (age >= 100){
//        println("Вам 100 или больше 100")
//    } else if (age >= 90){
//        println("Вам 90 или больше 90")
//    } else if (age >= 80){
//        println("Вам 80 или больше 80")
//    } else if (age >= 70){
//        println("Вам 70 или больше 70")
//    } else if (age >= 60){
//        println("Вам 60 или больше 60")
//    } else if (age >= 50){
//        println("Вам 50 или больше 50")
//    } else if (age >= 40){
//        println("Вам 40 или больше 40")
//    } else if (age >= 30){
//        println("Вам 30 или больше 30")
//    } else if (age >= 20){
//        println("Вам 20 или больше 20")
//    }  else if (age >= 18){
//        println("Вы созрели")
//    }else if (age > 15 && age < 18){
//        println("Вы почти созрели")
//    }
//    else {
//        println("Здрасте вы еще малыш")
//    }
