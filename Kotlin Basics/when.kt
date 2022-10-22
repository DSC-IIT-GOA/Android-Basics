fun main() {
    
    print("PLease enter your age: ")

    var age = readLine()?.toInt()

    if(age != null && age > 0) {
        when(age) {
            in 0..5 -> println("You are a young kid.")
            in 6..17 -> println("You are a teenager.")
            18 -> {
                println("Finally you are 18!")
                println("make your Voter Id!")
            }
            19, 20 -> println("you are a young adult.")
            in 21..65 -> println("you are a ADULT")
            else -> println("You are really old")
        }
    }

    // HomeWork
    print("Please Enter Your PLace of Birth: ")

    val nation = readLine()

    if(nation != null) {
        when(nation) {
            "India", "india" -> println("Namaste")
            "USA" -> println("Hello")
            "Russia", "russia" -> println("Privet")
            "Germany", "germany" -> println("Hallo")
            else -> println("Sorry! I don't Know")
        }
    }
}