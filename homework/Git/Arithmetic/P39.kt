fun listPrimesInRange(numbers: IntRange): List<Int>{

   return numbers.filter { it.isPrime() }
}

fun main() {
    print(listPrimesInRange(10..19))
}
