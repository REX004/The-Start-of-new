package Lesson19

fun main(){
    val emailService = EmailService()
    val smsService = SMSService()

    smsService.sendMessage("123456789", "123456789", "Hello")
    emailService.sendMessage("Vanya@", "Igor@", "Hello")


}