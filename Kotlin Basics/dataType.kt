// when we declar any variable using var then we can change it's value 
// throughout the code.
// But
// When we declare a variable using val then we can't change it's value.

fun main() {
    var myVariable : Int = 6
    println("the variable myVariable value is ${myVariable}")
    myVariable = 7
    println("the variable myVariable value is ${myVariable}")
    val myVariable2 : Int = 9
    println("the variable myVariable2 value is ${myVariable2}")
    // myVariable2 = 10
    // println("the variable value is ${myVariable2}")
    var myBool : Boolean = true
    println("the variable myBool value is ${myBool}")
    myBool = false
    println("the variable myBool value is ${myBool}")

    // Home Work
    var favoriteNumber : Int = 4
    val age : Int = 19
    val name : String = "Srajan Chourasia"
    println("Hii\nMyself ${name}")
    println("My favorite Number is ${favoriteNumber}")
    println("My age is ${age}")
}