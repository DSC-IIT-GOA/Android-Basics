

fun main() {
    var string = readLine()
    println("The message is: $string?")

    println("Write a null message")
    
    var message = readLine()

    println("The length of the message is: ${message?.length}")

    println("Write a null message")
    
    message = readLine()

    if (message == null) {
        println("The message is null")
    }
    else {
        println("The message is: $message")
    }

    // HomeWork
    println("Please enter your age:")
    var age = readLine()

    if(age == null) {
        println("The age is null")
    }
    else {
        var x = age.toInt()
        if(x < 18) {
            println("You are young")
        }
        else if(x > 18 && x < 65) {
            println("You are a adult")
        }
        else{
            println("You are too old")
        }
    }
}