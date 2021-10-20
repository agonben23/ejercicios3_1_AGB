class Rectangulo(val base: Int, val altura: Int) {
    fun area(): Int {
        return (base * altura)
    }

    fun perimetro(): Int {
        return ((base * 2) + (altura * 2))
    }

    override fun toString(): String {
        return ("El area es ${area()} y el perímetro es ${perimetro()}")
    }
}

fun main() {
    val rec1 = Rectangulo(3, 2)
    println(rec1.toString())
    val rec2 = Rectangulo(19, 18)
    println(rec2.toString())
    val rec3 = Rectangulo(7, 4)
    println(rec3.toString())
}