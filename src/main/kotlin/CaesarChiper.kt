fun main() {
    //The Caesar ciper
    //variabel initialization

    val s = "blackholesarewheregoddividedbyzero"
    println("Origianal message: $s")
    var message = ""
    var shift = 1

    //Loop iterating over characters
    for (c in s) {
        var i = c.toInt()
        i += shift
        if (i > 'z'.toInt()) {
            i -= 26
        }
        val char = i.toChar()
        message += char
    }

    //print(mencetak)
    println("Encypted message: $message")
}