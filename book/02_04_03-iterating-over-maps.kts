import java.util.*

//               .- keys are sorted
val binaryReps = TreeMap<Char, String>()

for (c in 'A'..'F') {
    val rep =  Integer.toBinaryString(c.toInt())
    binaryReps[c] = rep
}

//    .- unpacking (deconstruct?)
for ((k, v) in binaryReps) {
    println("$k : $v")
}


// another unpacking example
val list = arrayListOf("10", "11", "1001")
for ((index, element) in list.withIndex()) {
    println("$index : $element")
}