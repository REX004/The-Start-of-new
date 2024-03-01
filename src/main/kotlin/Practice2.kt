import kotlin.system.exitProcess

fun main(){
    println("Hello Welcome to this app!")
    print("Пожалуйста введите имена через запятую(,): ")
    val p_name = readLine().orEmpty()

    val namesArray = p_name.split(",")

    print("Пожалуйста, введите фамилии через запятую(,): ")

    val last_name = readLine().orEmpty()

    val lastNamesArray = last_name.split(",")

    if (namesArray.size != lastNamesArray.size){
        println("Ошибочка тут! У вас количкство фамилий и имен разное!")
        exitProcess(0)
    }

    validlLength(namesArray, 10,"Name")
    validlLength(lastNamesArray, 10,"Last Name")

    printTable(namesArray, lastNamesArray)

}

fun printTable(namesArray: List<String>, lastNamesArray: List<String>) {

    println("-".repeat(23))

    for (name in namesArray){
        val index = namesArray.indexOf(name)
        val last_name = lastNamesArray[index]

        println("|")

        val f1 = (12 - name.length) / 2
        val f2 = 12 - name.length - f1
        val s1 = (8 - last_name.length) / 2
        val s2 = 8 - last_name.length - s1

        print("|")
        print(" ".repeat(f1))
        print(name)
        print(" ".repeat(f2))
        print("|")
        print(" ".repeat(s1))
        print(last_name)
        print(" ".repeat(s2))
        println("|")

    }

    println("-".repeat(23))
}

fun validlLength(namesArray: List<String>, maxSize:Int, entity:String){

    for (name in namesArray) {
        if (name.length > maxSize) println ("$entity must be up to $maxSize characters")
    exitProcess(0)
    }
}