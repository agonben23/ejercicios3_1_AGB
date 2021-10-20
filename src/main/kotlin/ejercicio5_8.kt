class Tiempo(var hora: String, var minuto: String?, var segundo: String?) {

    override fun toString(): String {
        return ("La hora es $hora:$minuto:$segundo")
    }
}

fun main() {
    println("Introduce la hora")
    var hora = readLine().toString()
    while (hora.isEmpty() || (hora.toByte() !in 0..23)) {
        println("Hora no válida, vuelva a intentarlo")
        println("Introduce la hora")
        var hora = readLine()!!.toString()
    }
    println("Introduce los minutos")
    var minuto = readLine().toString()
    if (minuto.isEmpty()) {
        minuto = "00"
    }
    if (minuto.toByte() in 0..9) {
        val cero = "0"
        minuto = "$cero$minuto"
    }
    while (minuto.toByte() !in 0..59) {
        println("Minuto no válido, vuelva a intentarlo")
        println("Introduce los minutos")
        var minuto = readLine().toString()
        if (minuto.isEmpty()) {
            minuto = "00"
        }
        if (minuto.toByte() in 0..9) {
            val cero = "0"
            minuto = "$cero$minuto"
        }
    }
    println("Introduce los segundos")
    var segundo = readLine().toString()
    if (segundo.isEmpty()) {
        segundo = "00"
    }
    if (segundo.toByte() in 0..9) {
        val cero = "0"
        segundo = "$cero$segundo"
    }
    while (segundo.toByte() !in 0..59) {
        println("Segundo no válido, vuelva a intentarlo")
        println("Introduce los segundos")
        var segundo = readLine().toString()
        if (segundo.isEmpty()) {
            segundo = "00"
        }
        if (segundo.toByte() in 0..9) {
            val cero = "0"
            segundo = "$cero$segundo"
        }
    }
    var Tiempo1 = Tiempo(hora, minuto, segundo)
    println(Tiempo1.toString())
}