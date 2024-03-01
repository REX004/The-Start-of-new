fun main(){
    print("Введите ваш запрс: ")

    val answerET = readLine()
    val answer = getAnswer("$answerET")

    println(answer?.toUpperCase())
}
fun getAnswer(qustion:String): String?{
    var answer: String? = null

    if(qustion.length < 10 ){
        answer = "Some answer"
    }

    return answer
}