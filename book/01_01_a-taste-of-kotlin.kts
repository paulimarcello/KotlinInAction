//                                              .- nullable will default
data class Person(val name: String, val age: Int? = null)

fun main() {
    val persons = listOf(
        Person("Alice"),
//                           .- named argument
        Person("Bob", age = 29)
    )

//                              .- beginning of a lambda
    val oldest  = persons.maxBy { person -> person.age ?: 0 }
//                                .- shorthand named it(em)
//                                |      .- elvis operator (treat null as 0)
    var oldest2 = persons.maxBy { it.age ?: 0 }

    println("The oldest person is: $oldest")
}

//                       .- auto-generated toString()
// The oldest person is: Person(name=Bob, age=29)

main()