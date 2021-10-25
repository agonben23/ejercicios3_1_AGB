import org.jetbrains.annotations.TestOnly

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

    fun hacerTransferencia(importe: Double, cuentaIngreso: Cuenta) {
        saldo -= importe
        cuentaIngreso.saldo += importe
        println("Se ha realizado una transferencia de $importe desde la cuenta $numCuenta a la cuenta ${cuentaIngreso.numCuenta}")
        println("El nuevo saldo de la cuenta de pago $numCuenta es $saldo")
        println("El nuevo saldo de la cuenta de ingreso ${cuentaIngreso.numCuenta} es ${cuentaIngreso.saldo}")
    }
}

class Persona(val dni: String) {
    val lisCuenta = arrayListOf<Cuenta>()
    fun anadirCuenta(cuentaNueva: Cuenta) {
        if (lisCuenta.size <= 3) {
            lisCuenta.add(cuentaNueva)
        } else
            println("Esta persona ya tiene tres cuentas asociadas")
    }

    fun esMoroso() {
        var moroso : Boolean
        val contadorMax = lisCuenta.size
        var i = 0
        do {
            var cActual = lisCuenta.get(i)
            moroso = cActual.saldo < 0
            i += 1
        }while (moroso || (i == contadorMax))
        if (moroso == true){
            println("Esta persona es morosa")
        }else
            println("Esta persona no es morosa")
    }
}

fun main() {
    val cuenta1 = Cuenta("3453453GDG", 600.0)
    val cuenta2 = Cuenta("2323545DCA",-150.0)
    val persona1 = Persona("4545745H")
    persona1.anadirCuenta(cuenta1)
    persona1.anadirCuenta(cuenta2)
    persona1.esMoroso()
    cuenta1.hacerTransferencia(20.0, cuenta2)

}
