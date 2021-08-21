fun <T> slice(firstIndex:Int, lastIndex: Int, list: List<T>): List<T> =
    list.drop(firstIndex).take(lastIndex-firstIndex)

    //list.subList(firstIndex,lastIndex)

fun main() {
    println(slice(3, 8, "abcdefghijk".toList()))
}
