fun main() {
    //character occurrance in a sentence analysis
    //the string that we want to analyze

    var s = "A programmet gets stuck in shiwer because the instructions on the shampoo were: Larher, Wash, and Repeat."

    println(s)
    s = s.toLowerCase()

    //counters initialization
    var vowelCount = 0
    var consonantCount = 0

    //definitation of character groups
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"

    //main loop
    for (c in s){
        if (vowels.contains(c)) {
            vowelCount++
        } else if (consonants.contains(c)) {
            consonantCount++
        }
    }

    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
    println("Other characters: ${s.length - (vowelCount + consonantCount)}")
}