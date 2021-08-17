fun gcd1(first: Int, second: Int) : Int = when {
    first == second -> first
    first > second -> gcd1(first-second, second)
    else -> gcd1(first, second - first)
}
