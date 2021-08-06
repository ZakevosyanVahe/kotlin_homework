fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { it % 2 == 0 }


fun main() {
        val list1 = listOf(1,2,3)
        containsEven(list1).also(::println)
        val list2 = listOf(1,3,5)
        containsEven(list2).also(::println)
}
