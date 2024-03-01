fun main(){
    println("Привет пользователь, рады тебя видеть в нашем консольном калькуляторе!")

    while (true){
        print("Пожалуйста введите число: ")

        val number = readLine()?.toDoubleOrNull()

        print("Пожалуйста введите второе число: ")

        val number2 = readLine()?.toDoubleOrNull()

        print("Какую функцию хотите совершить над 2 числами (+, -, *, /): ")

        val operator = readLine()

        if (number == null || number2 == null || operator.isNullOrEmpty()){
            println("Что то неверно")
        } else{
            val result = calculate(number, number2, operator)

            println("Результат твоих действий: $result")
        }
    }



}
fun calculate(number: Double, number2: Double, operator: String): Double{

    var res = 0.0

    when(operator){

        "+" -> res = number + number2
        "-" -> res = number - number2
        "*" -> res = number * number2
        "/" -> res = number / number2

    }
    return res
}