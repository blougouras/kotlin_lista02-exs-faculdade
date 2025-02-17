fun main() {
    descontos()
}

fun descontos() {
    println("Digite seu nome: ")
    val name = readln()

    println("Digite seu sexo: ")
    val sexo = readln().uppercase()

    println("Digite o valor de sua compra: ")
    val value = readln().toFloat()

    if (sexo == "F") {
        val desc = 0.13 * value
        println("O valor da compra com o desconto aplicado fica de R$${"%.2f".format(value - desc)}", )
    }
    else {
        val desc = 0.05 * value
        println("O valor da compra com o desconto aplicado fica de R$${"%.2f".format(value - desc)}")
    }
}