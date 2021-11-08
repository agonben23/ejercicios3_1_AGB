class Cuenta(val numCuenta: String, var saldo: Double = 0.0) {
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

    companion object {
        fun hacerTransferencia(importe: Double,cuentaPago: Cuenta, cuentaIngreso: Cuenta) {
            cuentaPago.saldo -= importe
            cuentaIngreso.saldo += importe
            transferenciaHecha(importe, cuentaPago.numCuenta, cuentaIngreso, cuentaPago.saldo)
        }
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
companion object{
    fun esMoroso(persona: Persona) {
        var moroso = false
        val contadorMax = persona.lisCuenta.size
        var i = 0
        do{
            if (persona.lisCuenta[i].saldo < 0){
                println("Esta persona es morosa")
                moroso = true
            }else
                i++
        }while (!moroso && i != contadorMax)
        if(!moroso){
            println("Esta persona no es morosa")
        }
    }
}
}

fun main() {
    val cuenta1 = Cuenta("3453453GDG", 600.0)
    val cuenta2 = Cuenta("2323545DCA",-150.0)
    val persona1 = Persona("4545745H")
    persona1.anadirCuenta(cuenta1)
    persona1.anadirCuenta(cuenta2)
    Persona.esMoroso(persona1)
    Cuenta.hacerTransferencia(20.0,cuenta1,cuenta2)
}
fun transferenciaHecha(importe: Double,numCuenta: String,cuentaIngreso: Cuenta,saldo: Double){
    println("Se ha realizado una transferencia de $importe desde la cuenta $numCuenta a la cuenta ${cuentaIngreso.numCuenta}")
    println("El nuevo saldo de la cuenta de pago $numCuenta es $saldo")
    println("El nuevo saldo de la cuenta de ingreso ${cuentaIngreso.numCuenta} es ${cuentaIngreso.saldo}")
}

















