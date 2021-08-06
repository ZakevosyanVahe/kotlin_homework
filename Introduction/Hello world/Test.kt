fun start(): String = "OK"
fun main() {
    start().also(::println) // start().also{ println(it)}
}
