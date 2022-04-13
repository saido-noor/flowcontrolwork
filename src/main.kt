fun main() {
//    var name = "Saido"
//    if(name=="saido"){
//        println("Hello Saido")
//    }
//    else {
//        println("Who are you?")
//    }
//
//    numbers(10)
//    numbers(3)
//    hasVisitedCapital("Uganda")
//    hasVisitedCapital("Kenyan")
//    hasVisitedCapital("Somalia")
//   saySomething("Susan")
//    saySomething("Frida")
//    saySomething("Saido")
//    saySomething("Shanaya")
//    println( validPassword("abcdefhj"))
//    println( validPassword("password"))
//    println( validPassword("abcdefhjabcdefhj"))
    //for loop
//    var languages = arrayOf("Kiswahili", "English", "Kinyaruwanda", "Luganda")
//    for (language in languages) println(language)
//
//    //ranges
//    for (n in 23..64) {
//        println(n)
//    }
//
//    hasVisitedCapital("Kenyan")
//    hasVisitedCapital("Tanzania")
//    hasVisitedCapital("Ugandan")
//    hasVisitedCapital("Nigeria")
//    squareNumber()
    printMultiple()


}

//write a function that prints out square of all the odd numbers between 1 to 10
//fun squareNumber() {
//    for (number in 1..10) if (number % 2 !== 0) {
//        println(number * number)
//    }
//}

//create a function that prints out multiples of 6 and 8
// between 1 and 1000 for multiples of both 6 and 8
//it should print out "Bingo"

fun printMultiple() {
    for (number in 1..1000) if (number%6  && number%8 !== 0) {
        println(number * number)
    } else{
        println("Bingo!")
    }
}













//fun hasVisitedCapital(nationality:String){
//    if(nationality.equals("Kenyan")){
//        println("Have you ever been to Nairobi?")
//
//    }
//    else if(nationality.equals("Tanzania")){
//        println("Have you ever been to Dodoma?")
//    }
//    else if (nationality.equals("Uganda")){
//        println("Have you ever been to Kampala?")
//    }
//    else{
//        println("Have you ever been to East Africa?")
//    }
//
//}
//fun details(password:String):Boolean{
//    if (password.length>=8){
//
//        return true
//
//    }
//    else if(password.equals(16)){
//        return true
//    }
//    else{
//        println(password.length <=16)
//        return false
//    }
//
//
//}


//fun saySomething(friends:String){
//    if (friends.equals("Susan")){
//        println("Come to the class")
//    }
//    else if (friends.equals("Saido")){
//        println("I Went to the Zoo Jana")
//    }
//    else{
//        println("Hello,$friends")
//    }
//}

//create a function that takes in a password as a parameter
//for a password to be valid it must meet the following conditions
//must be at leat 8
//16characts
//must not be a password
//use if else statement to determine whether the password procided is valid or not the function returns false true

fun validPassword(password: String): Boolean {
    if (password.length >= 8 && password.length <= 16 && !password.equals("password")) {
        return true
    }
    return false
}

fun hasVisitedCapital(nationality: String) {
    when (nationality) {
        "Kenyan" -> println("Have you ever been to Nairobi?")
        "Ugandan" -> println("Have you ever been to Kampala?")
        "Tanzania" -> println("Have you ever been to Dodoma?")

        else -> println("Have you ever been to E.A?")
    }
}


//even - even = odd
//odd - even = odd
//0 is even number


//write a function that prints out odd or even depending on the number passed to it
//fun numbers(Even: Int) {
//    if (Even % 2 == 0) {
//        println("The number is even")
//    } else {
//        println("The number is Odd")
//
//    }
//
//}