package homework2

fun nth(x: Int, list: List<Int>){
    println(list.lastIndexOf(x))
}

fun main() {
    nth(2, listOf(11,1,3,2,3,4,5,2))
}
