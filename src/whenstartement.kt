import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)
    println("enter day(number) :")
    var day = read.nextInt()
    var result = when (day) {
        1 -> "monday"
        2 -> "tuesday"
        3 -> "wednesday"
        4 -> "thursday"
        5 -> "friday"
        6 -> "saturday"
        7 -> "sunday"

        else -> "invalid day of the week"
    }
    println("day $day corresponds to $result")
}

