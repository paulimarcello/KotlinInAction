import java.lang.IllegalArgumentException

// same as in Java
if (percentage !in 0..100)
    throw IllegalArgumentException("Must be between 0 and 100")

// throw are expressions
val percentage =
    if (number in 0..10)
        number
    else
        throw IllegalArgumentException("Must be between 0 and 100")