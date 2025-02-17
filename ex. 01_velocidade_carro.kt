fun main() {
    println("Qual a velocidade do carro? ")
    multa()
}

fun multa () {
    val velocidade = readln().toInt()
    if (velocidade > 80){
        val multa = ((velocidade - 80 ) * 5)
        println("Você foi multado por estar acima da velocidade permitada no valor de: $multa")
    }
    else{
        println("Você está no limite permitido")
    }
}