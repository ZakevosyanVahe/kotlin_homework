fun <T> removeAt(n:Int, list: List<T>) : Pair<List<T>, T> =
    Pair(list.filterIndexed { value, element -> value != n }, list[n] )


fun main() {
    println(removeAt(2, "abcd".toList()))
}
