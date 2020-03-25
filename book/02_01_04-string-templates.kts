fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    //             .- string template (in backgroung StringBuilder is used)
    println("Hello $name!")

    // if you need $x to be printed, you have to escape it
    println("Hello Mr. \$x") // Hello Mr. $x

    //              .- use ${} for more complex expressions
    println("Hello, ${args[0]}")

    // nesting double quotes
    println("Tach ${if (args.size > 1) args[1] else "Elfriede"}")
}

main(arrayOf("Rambo"))