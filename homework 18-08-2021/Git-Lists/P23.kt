fun <T> randomSelect(n: Int, list: List<T>) : List<T> =
    list.shuffled().take(n)

/*
fun <T> randomSelect1(n: Int, list: List<T>, random: Random = Random): List<T> =
    if (n == 0) emptyList()
    else {
        val value = list[random.nextInt(list.size)]
        randomSelect1(n - 1, list.filter { it != value }, random) + value
    }
 */
