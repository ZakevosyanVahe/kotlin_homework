package homework

fun main() {
    println(gcd(18,15))
}

fun gcd(first: Int, second: Int): Int{
    if (first == second) {
        return first
    } else {
        if (first > second) {
            return gcd(first-second, second)
        } else
            return gcd(first, second-first)
    }
}
