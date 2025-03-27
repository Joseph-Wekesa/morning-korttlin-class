import java.util.*
fun main() {
    var read = Scanner(System.`in`)
    println("enter room temperature :")
    var temperatue = read.nextInt()
    if (temperatue < 25) {
        println("it is cold")

    } else println({ "it is hot" })
}