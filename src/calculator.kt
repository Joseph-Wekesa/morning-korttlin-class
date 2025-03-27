import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)
    println("enter first number :")
    var firstNumber = read.nextInt()
    println("enter operator (+,-,*,/,) :")
    var operator = readln()
    println("enter second number :")
    var secondNumber=read.nextInt()

    var result=  when (operator) {
        "+" -> println("The result is $firstNumber + $secondNumber = ${firstNumber + secondNumber}")
        "-" -> println("The result is $firstNumber - $secondNumber = ${firstNumber - secondNumber}")
        "/" -> println("The result is $firstNumber / $secondNumber = ${firstNumber / secondNumber}")
        "*" -> println("The result is $firstNumber * $secondNumber = ${firstNumber * secondNumber}")
        else -> println("Unknown operator")
    }



}