import java.util.Currency

fun main() {
    //standard library funtions/predifined functions
    var output=Math.sqrt(12.0)
    println("the squareroot of 12 is $output")


    var number=Math.round(45.89)
    println(number)
    school()
    add()
    student("john","male",34)
    employee(
        "joel",90000,Disability = false
    )




}

//user defined functions
fun school(){

    println("emobilis")
}
fun add(){

    var x=3
    var y=5
    println(x+y)
}
//parameters and arguemet/value
fun student(name:String,Gender:String,Age:Int){
    println("$name is a $Gender.$name is a$Age years old")

}
fun employee(name: String, salary:Int,Disability:Boolean){
    println("$name earns $salary.Disability:$Disability")

}
