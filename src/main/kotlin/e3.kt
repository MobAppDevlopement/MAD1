open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }

}
fun main(){
    var s1=Student("Ravindra","Raval",20,20012011046,"CE","A","AB2")
    var s2=Student("Saumil","Patel",20,20012011124,"CE","C","AB8")
    var s3=Student("Raju","Despande",19,20012011021,"IT","C","AB7")
    var s4=Student("Keyur","Raval",19,20012011146,"CE","C","AB9")
    var s5=Student("Harsh","Mehta",20,20012011076,"IT","B","AB4")

}