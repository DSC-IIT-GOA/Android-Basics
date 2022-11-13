fun main(){
    print("Please enter a number: ")
    var number = readLine()?.toInt()

    if(number != null){
        if(number.isPrime()) {
            println("$number is a prime number!")
        }
        else {
            println("$number is not a prime number!")
        }
    }
}

fun Int.isPrime(): Boolean {
    for( i in 2 until this - 1){
        if(this % i == 0){
            return false
        }
    }
    return true
}