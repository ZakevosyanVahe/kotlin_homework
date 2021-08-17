fun Int.primeFactors1(): List<Int> {
    if (this.isPrime2()) return listOf(this)
     val numeros = (2..(this/2))
         .filter { it.isPrime2() }
         .find { this % it == 0 }

    return if(numeros == null) {
        emptyList()
    } else {
        listOf(numeros) + (this / numeros).primeFactors1()
    }
}
