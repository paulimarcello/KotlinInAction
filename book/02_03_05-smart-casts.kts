interface Expr
//                        .- implementing the interface
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

// (1 + 2) + 4
//         sum
//        /   \
//      sum    4
//     /   \
//    1     2

val tree = Sum(Sum(Num(1), Num(2)), Num(4))

fun eval(tree: Expr): Int {
    //       .- type checking / instanceof in Java
    // if true, tree is casted to Num under the hood -> smart cast
    if (tree is Num) {
        return tree.value
    }
    val s = tree as Sum // explicit cast
    return eval(s.left) + eval(s.right)
}

println(eval(tree))