val list = listOf(1, 2, 3, 4, 5)

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ",", // default values
    prefix: String = "",
    postfix: String = "") : String {
    val builder = StringBuilder(prefix)
    for ((index, item) in collection.withIndex()) {
        when (index) {
            0 -> builder.append(item)
            else -> builder.append("$separator $item")
        }
    }
    return builder.append(postfix).toString()
}

println(joinToString(list))

// ---------------------------------------------------------

// Default values in Java

// One can annotate the Kotlin function with @JvmOverloads to overload the Kotlin function

@JvmOverloads
fun <T> joinToString(collection: Collection<T>, separator: String = ",", prefix: String = "", postfix: String = "") : String {
    ...
}

// will generate following Java-Code
String joinToString(Collection<T> collection, String separator, String prefix, String postfix);
String joinToString(Collection<T> collection, String separator, String prefix);
String joinToString(Collection<T> collection, String separator);
String joinToString(Collection<T> collection);