import java.lang.Exception

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 255 + g) * 256 + b
}

fun mixOptimized(c1: Color, c2: Color) =
    when {
        c1 == Color.RED && c2 == Color.YELLOW ||
        c1 == Color.YELLOW && c2 == Color.RED -> Color.ORANGE

        c1 == Color.YELLOW && c2 == Color.BLUE ||
        c1 == Color.BLUE && c2 == Color.YELLOW -> Color.GREEN

        c1 == Color.BLUE && c2 == Color.VIOLET ||
        c1 == Color.VIOLET && c2 == Color.BLUE -> Color.INDIGO

        else -> throw Exception("Dirty color")
    }

println(mixOptimized(Color.BLUE, Color.VIOLET))