fun getSecondLargest(numbers:
List<Int>):Int?{
    if(numbers.size<2)
        return null
    var max1 = numbers[0]
    var max2 = numbers[0]
    for(i in 1 until numbers.size){
        if(numbers[i]>max1){
            max2 = max1
            max1 = numbers[i]
        } else if(numbers[i]>max2){
            max2 = numbers[i]
        }
    }
    return max2
}
    fun main(){
    val numbers = listOf<Int>(3,2,5,7,1)
    val secondLargest = getSecondLargest(numbers)
    println(secondLargest)
    }