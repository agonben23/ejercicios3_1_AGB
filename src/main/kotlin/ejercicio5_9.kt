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

    fun hacerTransferencia(importe : Double,cuentaIngreso : Cuenta){
        saldo -= importe
        cuentaIngreso.saldo =+ importe
        println("Se ha realizado una transferencia de $importe desde la cuenta $numCuenta a la cuenta ${cuentaIngreso.numCuenta}")
        println("El nuevo saldo de la cuenta de pago $numCuenta es $saldo")
        println("El nuevo saldo de la cuenta de ingreso ${cuentaIngreso.numCuenta} es ${cuentaIngreso.saldo}")
    }
}

class Persona(val dni: String) {
    fun anadirCuenta() {

    }

    fun esMoroso() {

    }
}

fun main() {
    val cuenta1 = Cuenta("3453453GDG", 600.0)
    val cuenta2 = Cuenta("2323545DCA",450.0)
    cuenta1.hacerTransferencia(20.0,cuenta2)

}
