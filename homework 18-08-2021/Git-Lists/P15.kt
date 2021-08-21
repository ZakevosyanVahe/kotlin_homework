fun<T> duplicateN(n: Int, list: List<T>) : List<T> =
    list.flatMap {a -> List(n) { a } }

fun main() {
    println(duplicateN(4,"abcd".toList()))
}
