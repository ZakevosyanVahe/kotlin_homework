fun printGoldbachList(numbers: IntRange): List<String>{
    var newList = mutableListOf<String>()

    var firstNumber = numbers.start

    while (firstNumber <= numbers.endInclusive) {

        if (firstNumber % 2 ==0){
            newList.add("${firstNumber} = ${firstNumber.goldbach().first } + ${ firstNumber.goldbach().second}")
            firstNumber += 2
        } else {
            firstNumber++
        }
    }
    return newList
}

fun main() {
    for (num in printGoldbachList(9..20)){
        println(num)
    }
}
