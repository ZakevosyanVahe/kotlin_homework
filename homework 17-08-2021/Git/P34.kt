fun Int.totient1(): Int =
    (1..this).filter { this.isCoprimeTo1(it) }
        .size
