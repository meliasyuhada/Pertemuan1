fun main() {
    val s = ".. -.-, - ... --- -.-. .. .- .-.."
    println("The original messeage: $s")

    var message = ""

    val alpabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
        "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...",
        "-", "..-", "...-", ".--", "-..-", "-.--", "--..")

    val characters = s.split(" ")

    for (morseChar in characters) {
        val index = morseChars.indexOf(morseChar)

        if (index != -1) {
            message += alpabetChars[index]
        }
    }
    println("The decode message: $message")
}