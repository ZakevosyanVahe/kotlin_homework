fun joinOptions(options: Collection<String>) =
        options.joinToString(prefix = "[", postfix = "]")

fun main() {
        joinOptions(listOf("a","b","c")).also(::println)
}
