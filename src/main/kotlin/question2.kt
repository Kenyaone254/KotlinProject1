fun sumOfEvenNumbers(numbers: List<Int>): Int {
    var sum = 0
    for (number in numbers) {
        if (number % 2 == 0) {
            sum += number
        }
    }
    return sum
}
fun main(){
    val numbers = listOf<Int>(1,2,4,5,6,7,8,9,10)
    val sum = sumOfEvenNumbers(numbers)
    println(sum)
}