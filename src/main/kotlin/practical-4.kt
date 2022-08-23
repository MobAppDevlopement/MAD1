fun main() {
    print("Enter a Number :")
    var a= readLine()!!
    var val1 : Int=a.toInt()

    if(val1 % 2==0){
        println("The Number entered is EVEN")
    }
    else{
        println("The Number entered is ODD")
    }
}
