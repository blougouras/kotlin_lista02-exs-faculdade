fun main() {
    println("Qual a distância que deseja percorrer? (em Km): ")
    distance()
}
fun distance() {
    val distancia = readln().toFloat()

    if (distancia <= 200) {
        val valor = distancia * 0.50
        println("O preço da passagem fica no valor de R$${"%.2f".format(valor)}")
    }
    else {
        val valor = distancia * 0.45
        println("O preço da passagem fica no valor de R$${"%.2f".format(valor)}")
    }
}