fun main() {
    val valInt: Int = 1
    val valSum: Long = 3L + valInt //konversi implisit

    println("Konversi variabel secara implisit : $valSum")

    val valLong : Long = valInt.toLong() //konversi eksplisit

    println("Konversi variabel valInt secara eksplisit : $valLong")
}