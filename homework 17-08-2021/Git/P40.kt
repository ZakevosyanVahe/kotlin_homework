fun Int.goldbach1(): Pair<Int, Int> {
    if (this == 2) return Pair(1, 1)
    if (this == 3) return Pair(1, 2)
    val param: Int = listPrimesInRange(2 until this).find { (this - it).isPrime2() } ?: throw IllegalStateException()
    return Pair(param, this - param)

}
