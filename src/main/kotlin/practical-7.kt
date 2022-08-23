fun main(){
    var n = 5
    var result: Long
    result = factorial(n)
    println("Factorial of $n = $result")

   println("By Using Tailrec Keyword ,Factorial of 6 is "+fact(6))
}
fun factorial(n: Int): Long {
    return if(n == 1){
        n.toLong()
    }
    else{
        n*factorial(n-1)
    }
}

tailrec fun fact(a:Int):Long{ if (a<=1){
    return 1 }
else{
    return fact(a-1)*a
}}