// declares a package, everything underneath is put into this package
package geometry.shapes

// import from other package
import java.util.Random

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

println(createRandomRectangle().isSquare)