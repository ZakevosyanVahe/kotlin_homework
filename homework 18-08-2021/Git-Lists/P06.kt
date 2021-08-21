fun isPalindrome(list: List<Int>): Boolean = when (list) {
    list.reversed() -> true
    else -> false
}

fun main() {
    println(isPalindrome(listOf()))
}
