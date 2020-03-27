// checks, if letter is within range
// under the hood: a <= c && c <= f
fun isLetter(c: Char) = c in 'a'..'f' || c in 'A'..'F'

// checks, if letter in _not_ within range
fun isNotDigit(c: Char) = c !in '0'..'9'


fun recognize(c: Char) =
    when (c) {
        in '0'..'9' -> "It's a digit!"
        in 'a'..'z' -> "It's a letter!"
        else -> "I don't know"
    }

println(recognize('8'))