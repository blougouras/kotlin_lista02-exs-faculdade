fun main () {
    println("Qual a seu ano de nascimento: ")
    val anoNasc = readln().toInt()
    val idade = 2025 - anoNasc

    if (idade >= 16){
        println("Você pode votar")
    }
    else {
        println("Você não pode votar ainda")
    }
}