

fun main() {
    var array = intArrayOf(12, 56, 3, 8)
    var max = getMax(1,2,5,3,4,19,5,2,5,17,4,3,7,8,4,16,8,6)
    println(max)
    max = getMax(1,2,5,3,4,*array,19,5,2,5,17,4,3,7,8,4,16,8,6)
    println(max)
    searchFor("How to become a good programmer")
    searchFor("How to becom a good Kotlin programmer", "Bing")
    searchFor(searchEngine = "Bing", search = "How to becom a good App developer")

    // HomeWork
    var altSum = alternatingSum(1,2,5,3,4,19,5,2,5,17,4,3,7,8,4,16,8,6)
    println("THe Alternating Sum = $altSum")
}

fun getMax(vararg vector: Int): Int {
    var max = vector[0]
    for (i in vector) {
        if (i > max) {
            max = i 
        }
    }
    return max
}

fun searchFor(search: String, searchEngine: String = "Google") {
    println("searching for '$search' on the search engine '$searchEngine'")
}

// HomeWork

fun alternatingSum(vararg vector: Int): Int {
    var flag : Boolean = true
    var sum = 0
    for (i in vector) {
        if(flag) {
            sum += i
            flag = false
        }
        else {
            sum -= i
            flag = true
        }
    }
    return sum
}