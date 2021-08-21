fun<T> encode(list: List<T>): List<Pair<Int, T>> =
    pack(list).map { Pair(it.size, it.first()) }


fun main() {
    println(encode("aabcccdddbb".toList()))
}
