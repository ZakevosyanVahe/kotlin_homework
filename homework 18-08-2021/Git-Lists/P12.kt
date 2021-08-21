fun<T> decode(list: List<Pair<Int, T>>): List<T> =
    list.flatMap { (count, value) -> List(count){value} }

fun main() {
    println(decode(listOf((4 to "a"), (1 to "b"), (2 to "c"), (2 to "a"), (1 to "d"), (4 to "e"))))
    println(List(3){"a"})
}
