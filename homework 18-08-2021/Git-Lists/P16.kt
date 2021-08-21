fun <T> drop(n: Int, list: List<T>) : List<T> =
    list.filterIndexed { index, t -> (index + 1) % n != 0}

fun main() {
    println(drop(3, "abcdefghijk".toList()))
}
