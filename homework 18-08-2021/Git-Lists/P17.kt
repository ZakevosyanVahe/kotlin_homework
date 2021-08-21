fun <T> split(n: Int, list: List<T>) :Pair<List<T>, List<T>> {
    var size = n + 1
    return list.partition {
        size--
        size > 0
    }
}

fun main() {
    println(split(2, "abcdefghijk".toList()))
}
