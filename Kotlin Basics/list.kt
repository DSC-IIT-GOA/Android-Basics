fun main() {
    // Array is always be of fix size and List is always immutable
    // But mutable List can be use for arbitary array size.
    var immutableList = listOf(1,4,7,9)
    var mutableList = mutableListOf(1,4,5,8)
    println(immutableList)
    println(mutableList)
    mutableList[0] = 19
    println(mutableList)
    mutableList.add(30)
    println(mutableList)
    mutableList.remove(5)
    println(mutableList)
    mutableList.removeAt(1)
    println(mutableList)
    
    // store an user input
    println("User input Please for 6 number:")
    var input = mutableListOf<Int>()
    
    for(k in 0..5) {
        var value = readLine()?.toInt()
        if(value != null) {
            input.add(value)
        }
    }

    println(input)


    // Easy Level HomeWork
    println("Enter 5 Number:")
    var vector = mutableListOf<Int>()
    for(k in 0..4) {
        var value = readLine()?.toInt()
        if(value!= null) {
            vector.add(value)
        }
    }
    println("Reversed List")
    for(k in 4 downTo 0) {
        println(vector[k])
    }

    // Hard Level HomeWork
    println("Enter a Number n > 1:")
    var n = readLine()?.toInt()
    if(n != null && n > 1) {
        var feb = mutableListOf<Int>()
        for(k in 1..n) {
            if(k == 1 || k == 2) {
                feb.add(k - 1)
            }
            else {
                feb.add(feb[k-3] + feb[k-2])
            }
        }
        println(feb)
    }

}