class cuenta(val numCuenta: String,var saldo: Double){
    fun recibirAbono(){
        println("Introduzca el saldo a añadir")
        val abono = readLine()!!.toDouble()
        saldo += abono
    }
}
class persona(){

}

fun main(){

}