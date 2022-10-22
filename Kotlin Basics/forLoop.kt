
fun main() {
    // for using an array
    var array = arrayOf(2, 8, 9, 12, 45, 18)

    println("For using array")
    for(i in array) {
        println(i)
    }

    // for using an range
    println("For using ..")
    for(i in 1..6) {
        println(i)
    }

    // for using an range backward
    println("For using backward")
    for(i in 10 downTo 6) {
        println(i)
    }

    // for using an range downTo
    println("For using downTo with step")
    for(j in 16 downTo 9 step 2) {
        println(j)
    }

    // for using an range in charecters
    println("For using range on charecters")
    for(j in 'a'..'k') {
        println(j)
    }

    // HomeWork
    println("Easy Version of HomeWork")
    var total = 0
    for(i in array) {
        total += i
    }
    println("sum is $total")

    println("Hard Version of HomeWork")
    print("Please Enter 5 number: ")
    total = 0
    for(i in 1..5) {
        var num = readLine()?.toInt()
        if(num != null) {
            total += num
        }
    
    }
    total = total/5
    println("Average is $total")


}