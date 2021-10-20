class Tiempo(var hora:Byte,var minuto:Byte?,var segundo: Byte?){

    override fun toString(): String {
        return ("La hora es $hora:$minuto:$segundo")
    }
}
fun main(){
    println("Introduce la hora")
    var hora= readLine()!!.toByte()
    println("Introduce los minutos")
    var minuto= readLine()?.toByte()
    println("Introduce los segundos")
    var segundo= readLine()?.toByte()
    var Tiempo1 = Tiempo(hora,minuto,segundo)
    println(Tiempo1.toString())
}
