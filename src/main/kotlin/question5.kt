fun removeDuplicates(numbers: List<Int>): List<Int> {
    val uniqueList = mutableListOf<Int>()
    numbers.forEach {
        if (!uniqueList.contains(it)) uniqueList.add(it)
    }
    return uniqueList
}
fun main(){
    val numbers = listOf<Int>(1,2,3,4,4,5)
    val uniqueList = removeDuplicates(numbers)
    println(uniqueList)
}