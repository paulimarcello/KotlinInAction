class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() { // custom property with provided implementation
            return height == width
        }
}

// shorthand
class Rectangle2(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

val rectangle1 = Rectangle(10, 10)
println(rectangle1.isSquare)

val rectangle2 = Rectangle2(10, 5)
println(rectangle2.isSquare)