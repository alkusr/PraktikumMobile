import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {
    print("Waktu Sekarang: ")
    var waktu = readLine()
    if (waktu.equals("pagi", ignoreCase = true) ||
        waktu.equals("siang", ignoreCase = true) ||
        waktu.equals("sore", ignoreCase = true) ||
        waktu.equals("malam", ignoreCase = true)) {
        print("")
    } else {
        print("Waktu Invalid Masukkan Lagi: ")
        waktu = readLine()}
    print("Nama Anda: ")
    val nama = readLine()
    print("Umur Anda: ")
    val umur = readLine()
    print("Suhu Tubuh Anda: ")
//    val suhuRandom = ThreadLocalRandom.current().nextDouble(35.0, 37.0)
    val suhu = readLine()

    println("\nSelamat $waktu, $nama. Umur anda $umur Tahun.\n" +
            "Suhu Tubuh anda $suhu derajat Celcius.")
}
