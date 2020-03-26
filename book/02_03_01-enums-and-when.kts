// simple enum class
enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

// enum class with properties
//                .- declares properties in enum class
enum class Color2(val r: Int, val g: Int, val b: Int) {
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
println(Color2.BLUE.rgb())

// will crash because enum types can't be created that way
println(Color2(255, 255, 255).rgb())

val red = Color2.RED
println(red) // RED