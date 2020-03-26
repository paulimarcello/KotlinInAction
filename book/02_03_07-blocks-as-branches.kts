import java.lang.IllegalArgumentException

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

val tree = Sum(Sum(Num(1), Num(2)), Num(4))

fun evalWithLogging(tree: Expr): Int =
    when (tree) {
        is Num -> {
            println("value is ${tree.value}")
            tree.value // last expr gets returned
        }
        is Sum -> {
            val left = evalWithLogging(tree.left)
            val right = evalWithLogging(tree.right)
            println("sum: $left + $right")
            left + right // last expr gets returned
        }
        else -> throw IllegalArgumentException("Unknown Expression")
    }

evalWithLogging(tree)