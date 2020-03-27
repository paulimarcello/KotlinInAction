val list = listOf(1, 2, 3, 4, 5)

fun <T> joinToString(collection: Collection<T>, separator: String, prefix: String, postfix: String): String {
    val builder = StringBuilder(prefix)
    for ((index, item) in collection.withIndex()) {
        when (index) {
            0 -> builder.append(item)
            else -> builder.append("$separator $item")
        }
    }
    return builder.append(postfix).toString()
}

println(joinToString(list, ";", "(", ")"))