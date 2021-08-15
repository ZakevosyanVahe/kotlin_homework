package homework

fun main() {

    println(1559.isPrime())
   println (13.isPrime1())
}

fun Int.isPrime(): Boolean{
    var i = 1
    var count = 0

    while (i<=this){
        if(this % i == 0){
            count++
            if(count >2){
               return false
            }
        }
        i++
    }
   return true
}

fun Int.isPrime1() = this > 1 && (2..(this / 2)).all { this % it != 0 }
