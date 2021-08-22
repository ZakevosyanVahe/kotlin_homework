fun lotto(n: Int, m: Int) : List<Int> = (1..m).toList().shuffled().take(n)

/*
fun lotto1(n: Int, k: Int, random: Random = Random): List<Int> =
    randomSelect1(n, (1..k).toList(), random)
 */
