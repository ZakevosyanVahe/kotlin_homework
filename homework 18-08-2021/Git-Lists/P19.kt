fun <T> rotate(n: Int, list: List<T>) : List<T> = when {
    n == 0 -> list
    n > 0  -> list.drop(n) + list.take(n)
    else   -> list.takeLast(-n) + list.dropLast(-n)
}
/*{

    var abs = n
    var rotateList =  listOf<T>()
    var A = emptyList<T>()//.take(n.absoluteValue)
    var B = emptyList<T>()//.drop(n.absoluteValue)

    if (n>0){
        A = list.take(abs)
        B = list.drop(abs)
        rotateList = B.plus(A)
    } else {
        abs = n.absoluteValue
        A = list.take(list.size - abs)
        B = list.drop(list.size - abs)

        rotateList = B.plus(A)
    }
        return rotateList
}

 */

fun main() {
    println(rotate(-2, "abcdefghijk".toList()))
}
