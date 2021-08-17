fun Int.isPrime2():Boolean = this > 1 && (2..(this/2)).all { this % it != 0 }
