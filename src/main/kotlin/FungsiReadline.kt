
//fungsi readline merupakan perintah masukkan di kotlin.
fun main() {
    //parrot program
    println("Hi I'm Septi, students from bengkalis state polytechnic ");
    println("Program Studi : ");
    var input: String
    input = readLine()!!
    var output: String
    output = input + ", " + input + "!"
    println(output)

}