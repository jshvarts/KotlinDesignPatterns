package lambdas

fun foo(arg: () -> Int): Int {
    return arg()
}

fun bar(): Int {
    return 1
}

fun main(args: Array<String>) {
    foo(::bar).apply { println(this) }
}