//Boolean bernilai true atau false.
fun main() {
    var varBool: Boolean = true
    if (varBool)
        println("varBool bernilai $varBool")

    var varInt: Int = 1
  //  if (varInt) { //jika kondisi ini diganti dengan variabel boolean (varBool) maka eror nya hilang.
        //terjadi ketidakcocokan pada kondisi if.
        //VarInt merupakan tipe data Integer, sedangkan yang diharapkan ialah tipe data Boolean

        println("varInt bernilai $varInt")
   // }
}