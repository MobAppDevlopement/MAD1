fun main(args : Array<String>){
    Sum()
    Sub()
    Mul()
    Div()
}
fun Sum(){
    var n1=111
    var n2=2222
    var n3=-222

    println("Addition of $n1 ,$n2,$n3 is "+(n1+n2+n3))
}
fun Sub(){
    var n1=111
    var n2=2222
    var n3=-222

    println("Subtraction of $n1 ,$n2,$n3 is "+(n1-n2-n3))
}
fun Mul(){
    var n1=111
    var n2=2222
    var n3=-222

    println("Multiplication of $n1 ,$n2,$n3 is "+(n1*n2*n3))
}
fun Div(){
    var n1=111
    var n2=2222

    println("Division of $n1 ,$n2 is "+(n2/n1))
}