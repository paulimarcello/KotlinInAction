val question: String = "The ultimate question of life, the universe, and everything"
val answer: Int = 42

//          .- omitting type
val question2 = "The ultimate question of life, the universe, and everything"
val answer2 = 42

// val = value -> immutable _reference_!!! / final variable in java
val yearsToCompute = 7.5e6 // 7.5 * 10^6, type Double

// var = variable -> mutable reference, so can be changed
var answer3: Int
answer3 = 42

// message will first be declared and must be assign within the declaring block
// after that, message is immutable
fun test(){
    val message: String

    if(true) {
        message = "Ok"
    }
    else {
        message = "Failure"
    }

    message = "This will fail"

    println(message)
}
test()

// !!! Attention !!!
// immutable reference does only mean, that the reference itself is immutable - so you can change the object itself!
val languages = arrayListOf("Java", "Kotlin", "C#")
languages.add("Elixir") // this will change the object! signature: String -> Boolean