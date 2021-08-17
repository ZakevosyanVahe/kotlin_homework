fun Int.primeFactorMultiplicity(): List<Pair<Int,Int>>{
    return this.primeFactors()
        .groupBy { it }
        .map { Pair(it.key, it.value.size) }
}
