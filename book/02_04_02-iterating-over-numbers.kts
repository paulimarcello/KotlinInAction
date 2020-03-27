// no such thing as a Java for-loop
// Kotlin uses the concept of ranges

// _progression_          .- always creates a range
val oneToTen = 1..10 // closed and inclusive
// if you can iterate over all values in a range, such a range is called _progression_

fun fizzBuzz(n: Int) =
    when {
        n % 15 == 0-> "FizzBuzz"
        n % 3 == 0 -> "Fizz"
        n % 5 == 0 -> "Buzz"
        else -> "$n"
    }

for (i in 1..100)
    println(fizzBuzz(i))

for (i in 100 downTo 1 step 2)
    println(fizzBuzz(i))

// 0 up tp 99
val notIncluded = 100;
for (x in 0 until notIncluded)
    println(x)
