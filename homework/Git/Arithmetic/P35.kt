fun Int.primeFactors(): List<Int>{
    val list = mutableListOf<Int>()
    var i: Int = 2
    var numero = this
    while (i < this) {
        if (i.isPrime()) {
            if (numero % i == 0) {
                list.add(i)
                numero /=  i
            } else {
                i++
            }
        } else {
            i++
        }
    }
    if (numero != 1){
        list.add(numero)
    }

    return list
}

fun main() {
    println(111.primeFactors())
}
