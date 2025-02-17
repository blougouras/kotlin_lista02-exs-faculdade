fun main() {
    println("Digite seu nome e suas notas: ")
    average()
}
fun average() {
    val nome = readln()
    val nota1 = readln().toFloat()
    val nota2 = readln().toFloat()

    val avg = (nota1 + nota2) / 2

    if (avg > 7.0) {
        println("O aluno $nome teve um bom aproveitamento com uma média de: $avg")
    }
    else {
        println("O aluno $nome não teve um bom aproveitamento com uma média de: $avg")
    }
}