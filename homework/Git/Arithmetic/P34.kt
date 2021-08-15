package homework

fun main() {
    print(11.totient())
}

fun Int.totient(): Int{
    var i : Int =1
    var count = 0
    while (i>=1 && i<=this){
        if(this.isCoprimeTo(i)) {
            i++
            count++
        } else {
            i++
        }
    }
    return count
}
