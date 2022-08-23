fun fMax(arr:Array<Int>){
    var max = arr[0]
    for(i in arr){
        if(i> max){
            max = i
        }
    }
    println("Maximum Element of the array is $max")
}

fun main() {
    fun printArray(vararg nameArray:Int){
        println(nameArray.joinToString())

    }
    fun<T> printArray(nameArray:Array<T>){
        println(nameArray.contentDeepToString())
    }
    var arr = arrayOf(39,15,71,64,57,40)
    print("Element of the array:")
    printArray(arr)
    fMax(arr)

}