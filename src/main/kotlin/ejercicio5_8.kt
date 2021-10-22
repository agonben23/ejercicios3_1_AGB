class Tiempo(var hora: String, var minuto: String?, var segundo: String?) {

    override fun toString(): String {
        return ("La hora es $hora h $minuto m $segundo s")
    }
}

fun main() {
    val hora = getHora()
    val minuto = getMinuto()
    val segundo = getSegundo()
    val tiempo1 = Tiempo(hora, minuto, segundo)
    println(tiempo1.toString())
}

fun getHora(): String {
    println("Introduce la hora")
    var hora = readLine().toString()
    while (hora.isEmpty() || (hora.toByte() !in 0..23)) {
        println("Hora no válida, vuelva a intentarlo")
        getHora()
    }
    return hora
}

fun getMinuto(): String {
    println("Introduce los minutos")
    var minuto = readLine().toString()
    if (minuto.isEmpty()) {
        minuto = "0"
    }
    while (minuto.toByte() !in 0..59) {
        println("Minuto no válido, vuelva a intentarlo")
        getMinuto()
    }
    return minuto
}

fun getSegundo(): String {
    println("Introduce los segundos")
    var segundo = readLine().toString()
    if (segundo.isEmpty()) {
        segundo = "h0"
    }
    while (segundo.toByte() !in 0..59) {
        println("Segundo no válido, vuelva a intentarlo")
        getSegundo()
    }
    return segundo
}