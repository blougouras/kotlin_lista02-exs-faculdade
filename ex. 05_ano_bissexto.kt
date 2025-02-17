fun main() {
    println("Digite um ano para descobrir se é bissexto: ")
    val ano = readln().toInt()

    if (ano % 4 == 0) {
        println("O ano $ano é bissexto")
    }
    else {
        println("O ano $ano não é bissexto")
    }
}