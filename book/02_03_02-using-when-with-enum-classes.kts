// enum class with properties
//                .- declares properties in enum class

enum class Color(val r: Int, val g: Int, val b: Int) {
    // specifies property values when each constant is created
    // enum constants
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238); // ; is required here, it seperates constant definitions from methods

    // defines a method on the enum class
    fun rgb() = (r * 255 + g) * 256 + b
}

// 255
println(Color.BLUE.rgb())

// will crash because enum types can't be created that way
println(Color(255, 255, 255).rgb())

val red = Color.RED
println(red) // RED

//------------------------------------------------------------------------------------------------

// this functions returns a when expression
fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

val blue = Color.BLUE
println(getMnemonic(blue))

fun getWarmth(color: Color) =
    when (color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
        Color.GREEN -> "neutral"
        Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
    }

println(getWarmth(blue))