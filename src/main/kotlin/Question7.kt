fun longestString(list:List<String>):
        String{
    var longest = ""
    for(str in list){
        if(str.length>longest.length){
            longest = str
        }
    }
    return longest
}
fun main(){
    val list = listOf<String>("Ivy went to the bank", "I love hiking in the mountains")
    val longest = longestString(list)
    println(longest)
}