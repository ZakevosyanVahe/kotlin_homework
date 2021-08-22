fun <T> insertAt(x: T, n: Int, list: List<T>) : List<T> =
    list.take(n).plus(x).plus(list.drop(n))
