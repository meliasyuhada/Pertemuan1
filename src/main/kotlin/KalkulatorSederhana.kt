//kalkulator sederhana
fun main() {
    println("Selamat Datang di Kalkulator Sederhana")
    println("Tekan enter untuk memulainya : ")
    val a = readLine()!!.toDouble()
    println("Tekan enter untuk memasukkan angka kedua : ")
    val b = readLine()!!.toDouble()
    val jumlah = a + b
    val pengurangan = a - b
    val perkalian = a * b
    val pembagian = a / b

    println("Jumlah : ${jumlah}")
    println("Pengurangan: ${pengurangan}")
    println("Perkalian: ${perkalian}")
    println("Pembagian: ${pembagian}")
    println("Terima Kasih sudah menggunakan kalkulator ini. Sampai Jumpa Lagi *=*")
}