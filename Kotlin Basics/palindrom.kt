fun main() {
    var string : String = "srajan"
    var string1 : String = "racecar"
    var stringR : String = string.reversed()
    var stringR1 : String = string1.reversed()
    if(stringR != string) {
        println("string $string is not a palendrom string")
    }
    else {
        println("string $string is a palendrom string")
    }
    if(stringR1 != string1) {
        println("string1 $string1 is not a palendrom string")
    }
    else {
        println("string1 $string1 is a palendrom string")
    }
}