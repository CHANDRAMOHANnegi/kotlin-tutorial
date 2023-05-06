fun main() {
    var arr= arrayOf("One","Two","Three")

    for ((i,e) in arr.withIndex()){
        println("$i - $e")
    }

    println(arr[0])
    println(arr.get(0))
    println(arr.set(0,"hello"))
    println(arr[0])
    println(arr.size)

}