//Penerapan konversi eksplisit pada char
fun main() {
    //ASCII value
    var c: Char //character
    var i: Int //nilai ordinal (ASCII) dari karakter

    //konversi dari teks ke nilai ASCII
    c = 'a'
    i = c.toInt()
    println("The character $c was converted to its ASCII value of $i")

    //konversi dari nilai ASCII ke text
    i = 98
    c = i.toChar()
    println("The ASCII value of $i was converted to its textual value of $c")

}