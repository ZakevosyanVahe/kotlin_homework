fun Int.goldbach(): Pair<Int,Int> {
    if (this % 2 != 0) return Pair(0, 0)

    var i = 2
    while (i < this) {
        var num = this-i
        if (i.isPrime() && (num).isPrime()) {
            break
        } else {
            i++
        }
    }
    return Pair(i, this - i)
}

fun main() {
    print(204.goldbach())
}
