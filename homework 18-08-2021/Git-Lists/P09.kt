fun<T> pack(list: List<T>) : List<List<T>> =
    if (list.isEmpty()) emptyList()
     else {
        val paked = list.takeWhile { it == list.first() }
        listOf(paked) + pack(list.drop(paked.size))


    }

fun main() {
    println(pack("aabcccdddbb".toList()))
}
