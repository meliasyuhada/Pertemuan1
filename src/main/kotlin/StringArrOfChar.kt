/*
fun main() {
    val namaSaya: String = "Septi Melia"
    for (chr in namaSaya) {
        print(chr)
    }
     print('\n')
}
*/

/*
fun main() {
    val d = "abcde" + 1 // operator + digunakan untuk mengabungkan tipe data string dan tipe data setelahnya, sehingga tipe data setelahnya mengikuti tipe data sebelumnya.
    println(d + "fghi")
}
 */

fun main() {
    var text = """ //petik 3 disebut raw string yang bisa digunakan untuk memuat kywords kotlin
        for (c in "foo")
        print(c)
    """.trimIndent()
    println(text)
}