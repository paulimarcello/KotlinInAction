import java.lang.Exception

enum class Color(val r: Int, val g: Int, val b: Int) {
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

fun mix(c1: Color, c2: Color) =
    // argument of when can be any object
    when (setOf(c1, c2)) {
        // a set is a collection for which the order of items doesn't matter
        // tweo sets are equal, if they contain the same items
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty Color")
    }

println(mix(Color.BLUE, Color.VIOLET))
println(mix(Color.VIOLET, Color.BLUE))