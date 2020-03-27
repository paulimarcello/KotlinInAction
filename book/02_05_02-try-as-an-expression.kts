import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    }
    catch (e: NumberFormatException) {
        // will stop the whole function so println won't be executed
        return

        // will return null assigned to number
        null
    }

    println(number)
}

val reader = BufferedReader(StringReader("not a number"))
readNumber(reader)