fun main() {
    print(35.isCoprimeTo(63))
}

fun Int.isCoprimeTo(number: Int):Boolean{
    return gcd(this,number) == 1

}
