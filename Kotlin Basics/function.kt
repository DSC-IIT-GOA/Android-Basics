fun main() {
    var vector = listOf(54,7,432,312,76,23,3454,90)
    printThreeLine()
    printPower(2, 10)
    printPower(3, 6)
    printPower(5, 5)
    printPower(11, 3)
    println()
    var a = power(3, 4)
    println("$a")
    println()
    multiply(5, 7)
    printFirst(vector)

    // HomeWork
    print("Please enter a natural number: ")
    var naturalNumber = readLine()?.toInt()
    if (naturalNumber != null) {
        printSum(naturalNumber)
    }

    println()
    println("Please enter a number: ")
    var number = readLine()?.toInt()
    if (number!= null) {
        var index : Int = findIndex(vector, number)
        println("Index is : $index")
    }

}

fun printThreeLine() {
    println("Printing the first line.")
    println("Printing the second line.")
    println("printing the third line.")
}

fun printPower(base: Int, power: Int) {
    var result = 1
    for(i in 1..power) {
        result *= base
    }
    println("$base to the power of $power is $result.")
}

fun power(base: Int, power: Int): Int {
    var result = 1
    for(i in 1..power) {
        result *= base
    }
    println("$base to the power of $power is $result.")
    return result
}

fun multiply(a: Int, b: Int) = a * b

fun printFirst(list: List<Int>) = println("${list[0]}")

// HomeWork
fun printSum(num: Int) {
    var result = num*(num+1)/2
    println("The sum of first $num natural numbers is $result.")
}

fun findIndex(list: List<Int>, num: Int): Int {
    var index = 0
    for(element in list) {
        if(element == num) {
            return index
        }
        index++
    }
    return -1
}