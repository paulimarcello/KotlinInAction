import java.lang.Exception
import java.lang.IllegalArgumentException

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

val tree = Sum(Sum(Num(1), Num(2)), Num(4))

fun eval(tree: Expr): Int =
    when (tree) {
        is Num -> tree.value
        is Sum -> eval(tree.left) + eval(tree.right)
        else -> throw IllegalArgumentException("Unknown Expression")
    }

println(eval(tree))