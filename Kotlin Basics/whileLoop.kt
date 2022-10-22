fun main() {
    var array = arrayOf("HELLO", "GUYS", "Yo!", "WHAT's UP?")
    var arraySize = array.size
    var i = 0
    while(i < arraySize) {
        println(array[i])
        i++
    }
    println("End of Loop.")

    // HomeWork

    print("Please Enter a Number: ")
    var num = readLine()?.toInt()

    if(num != null) {
        println("Lets Count from $num to 0")
        while(num >= 0) {
            println(num)
            num--
        }
    }
    else {
        println("Number is null")
    }

    // Power Function

    print("Please Enter the first Number: ")
    var num1 = readLine()?.toInt()

    print("Please Enter the second Number: ")
    var num2 = readLine()?.toInt()

    if(num1 != null && num2 != null) {
        print("$num1 to the power $num2 is : ")
        var result = num1
        while(num2 > 1) {
            result *= num1
            num2--
        }
        println(result)
    }
    else {
        println("Number is null")
    }

}