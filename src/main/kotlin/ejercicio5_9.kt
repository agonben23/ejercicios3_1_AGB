class Cuenta(val numCuenta: String, var saldo: Double) {
    fun recibirAbono() {
        println("Introduzca el saldo a añadir")
        val abono = readLine()!!.toDouble()
        saldo += abono
    }

    fun realizarPago() {
        println("Introduzca el saldo a pagar")
        val pago = readLine()!!.toDouble()
        saldo -= pago
    }
}

class Persona(val dni: String) {
    val listCuenta : List<Cuenta> = List<Cuenta>(3,)
    fun anadirCuenta() {

    }

    fun esMoroso() {

    }
}

fun main() {
    val cuenta1 = Cuenta("3453453GDG", 600.0)
    val cuenta2 = Cuenta("2323545DCA",450.0)

    hacerTransferencia(cuenta1,cuenta2)

}
fun hacerTransferencia(cuentaPago : Cuenta,cuentaIngreso : Cuenta){
    println("Introduzca el importe a transferir")
    val impTransf = readLine()!!.toDouble()
    cuentaPago.saldo -= impTransf
    cuentaIngreso.saldo =+ impTransf
    println("Se ha realizado una transferencia de $impTransf desde la cuenta ${cuentaPago.numCuenta} a la cuenta ${cuentaIngreso.numCuenta}")
    println("El nuevo saldo de la cuenta de pago ${cuentaPago.numCuenta} es ${cuentaPago.saldo}")
    println("El nuevo saldo de la cuenta de ingreso ${cuentaIngreso.numCuenta} es ${cuentaIngreso.saldo}")
}