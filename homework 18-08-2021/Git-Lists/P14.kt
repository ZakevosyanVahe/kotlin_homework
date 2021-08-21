fun<T> duplicate(list: List<T>): List<T> =
    list.flatMap { listOf(it,it) }

fun main() {
    println(duplicate("abbcccdddd".toList()))
}
