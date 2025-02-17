fun main() {
    println("Digite o ano do seu nascimento: ")
    alistamento()
}
fun alistamento() {
    val anoNasc = readln().toInt()
    val idade = 2025 - anoNasc

    if (idade >= 18) {
        println("Já se passaram ${idade - 18} anos do seu alistamento")
    }
    else {
        println("Faltam ${18 - idade} anos para o alistamento")
    }
}