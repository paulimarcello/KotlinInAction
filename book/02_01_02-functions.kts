//                       .- return type
//                           .- block body
fun max(a: Int, b: Int): Int {
    //     .- expression, not a statement!
    return if (a > b) a else b;
}

//                            .- expression body
//                              .- can ommit return
fun max2(a: Int, b: Int): Int = if (a > b) a else b

//                      .- can ommit return type because type inference
fun max3(a: Int, b: Int) = if (a > b) a else b

println(max(2, 3))
// 3

println(max2(4, 5))
// 3