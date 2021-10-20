class Coche(
    var color: String,
    val marca: String,
    val modelo: String,
    val num_caballos: Int,
    val num_puertas: Byte,
    val matricula: String
) {
    fun cambiarColor() {
        println("¿Cual es el nuevo color?")
        color = readLine().toString()
        while (color == "") {
            println("Color no válido, vuelve a intentarlo")
            println("¿Cual es el nuevo color?")
            color = readLine().toString()
        }
    }

    override fun toString(): String {
        return ("El coche es $color, es un $marca $modelo, tiene $num_caballos caballos de potencia, $num_puertas puertas y matrícula $matricula")
    }
}

fun main() {
    var c1 = Coche("blanco", "Subaru", "B360", 240, 4, "7665FNT")
    println(c1.toString())
    c1.cambiarColor()
    println(c1.toString())
}