package homework2

fun<T> last(list: List<T>) : T{
    return list.last()
}


fun main() {
     val list = mutableListOf("1,2,3,4,56","a","aga")
    println(last(list))
}
