import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    print("Input Bilangan = ")
    val nX = read.nextInt()

    var x = 0
    var y = nX
    while (x < 5) {
        if (y%2==0 || y%3==0) {
            print("$y ")
            x++
        }
        y += nX
    }
}
