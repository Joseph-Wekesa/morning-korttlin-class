import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)
    println("ennter first :")
    var first = read.nextInt()
    println("enter second :")
    var second = read.nextInt()
    println("enter third")
    var third = read.nextInt()
    if (first > second && first > third) {
        println("$first is the largest number")
    } else if (second > first && second > third) {
        println("$second is the largest number")
    } else{
        println("$third is the largest number")
    }
}