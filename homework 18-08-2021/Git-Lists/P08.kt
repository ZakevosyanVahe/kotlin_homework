fun<T> compras(list: List<T>) =
    list.fold(emptyList<T>()){
            result, value ->
        if (result.isNotEmpty() && result.last() == value)
            result else result + value
    }


fun main() {
    println(compras("vvvvaaahaheeeeee".toList()))
}
