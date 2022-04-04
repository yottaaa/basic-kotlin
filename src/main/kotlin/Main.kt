
// top level variables - outside of function/classes
// immutable - cannot reassigned
// mutable - can be reassigned
val cannotModify: String = "This value cannot be changed"
var canModify: String = "This can be changed!"

// function accepting params
fun userDetails(age: Int, firstname: String, lastname: String): String {
    return "Name: ${"$firstname $lastname"}\nAge: $age"
}
// function returning a value
fun phraseRandomizer(): String {
    // phrases
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    // random index
    val rand1 = (Math.random() * wordArray1.size).toInt()
    val rand2 = (Math.random() * wordArray2.size).toInt()
    val rand3 = (Math.random() * wordArray3.size).toInt()

    return "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
}

fun main(args: Array<String>) {
    println("PassPhrase: ${phraseRandomizer()}")
    println(userDetails(21,"Erick","Bautista"))

    val options = arrayOf("rock", "paper", "scissors")
    options[1] = "hammer"
    println(options[1])

    // String functions
    println("\n------ String Libraries -------")
    println("Reverse: ${"hello".reversed()}")
    println("Equals: ${"Hello".equals("hello")}")
    println("HashCode: ${"Hello".hashCode()}")
    println("SubSequence: ${"Hello".subSequence(1,3)}")
    println("Indices: ${"Hello".indices}")
    println("LastIndex: ${"Hello"["Hello".lastIndex]}")
    println("SpecifiedIndex: ${"Hello"[0]}")
    println("LowerCase: ${"HellO".lowercase()}")
    println("UpperCase: ${"HellO".uppercase()}")
    println("Contains: ${"hellO".contains("el")}")
    println("StringCount: ${"hellO".count()}")

    // Collection libraries
    val li = mutableListOf<String>("hello","world")
    li[1] = "underworld"
    println(li[1])

    val dict = mutableMapOf<String,String>("first" to "hello", "second" to "world")
    dict["second"] = "underworld"
    dict["third"] = "..."
    dict.remove("third")
    println(dict["first"])
}