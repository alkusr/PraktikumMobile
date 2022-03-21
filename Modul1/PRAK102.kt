import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    print("Nilai x = ")
    val nX = read.nextInt()

    val hasil = rumus(nX)
    println(hasil)
}

fun rumus(x: Int ):Int {
    return (2*x*x)+(5*x)-8
}
