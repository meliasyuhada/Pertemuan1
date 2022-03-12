fun main() {
    val s = "Politeknik"
    println(s.startsWith("pol"))
    println(s.endsWith("nik"))
    println(s.contains("tek"))
    println(s.contains("lo"))

    //toUpperCase() and toLowerCase()
    var config = "Fullscreen shaDows autosave"
    config = config.toLowerCase()
    println("Will the game run in fullscreen ?")
    println(config.contains("fullscreen"))
    println("Will shadows be turnednon ?")
    println(config.contains("shadows"))
    println("Will sound be turned off?")
    println(config.contains("nosound"))
    println("Would the player like to use autosave?")
    println(config.contains("autosave"))

    //replace()
    var strJava = "Java is the best!"
    strJava = strJava.replace("Java", "Kotlin")
    println(s)
    println("$strJava is ${strJava.length} characters long.")

    //substring()
    println("I would not banish all of these internets. ".substring(2, 7))

    //compareTo()
    println("alpa".compareTo("bravo"))
}