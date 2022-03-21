class PRAK104 {
    // property
    private val id = "IDX0001"
    private val nama = "Asus Zenbook"
    private val manufactureYear = 2009
    private val produsen = "Asus Corporation Ltd."

    // function
    fun printAll() {
        print("""
            Detail Produk
            No ID   : $id
            Nama    : $nama
            Rilis   : $manufactureYear
            Pabrik  : $produsen
        """.trimIndent())
    }
}
fun main(args: Array<String>) {
    val obj = PRAK104() // membuat objek
    obj.printAll()
}