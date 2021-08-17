fun listPrimesInRange(numbers: IntRange): List<Int>{

   return numbers.filter { it.isPrime() }
}
