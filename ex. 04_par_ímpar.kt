fun main() {
    println("Digite um número para descobrir se um número é par ou ímpar: ")
    val number = readln().toInt()

    if (number % 2 == 0) {
        println("O número $number é par")
    }
    else {
        println("O número $number é ímpar")
    }
}