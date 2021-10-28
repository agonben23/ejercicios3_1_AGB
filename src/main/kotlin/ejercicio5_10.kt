class Libro(var titulo: String, var autor: String, var num_pag: Int, var calificacion: Int) {
    fun cambiarTitulo(nuevoTitulo: String) {
        titulo = nuevoTitulo
    }

    fun cambiarNumpag(nuevoNumPag: Int) {
        num_pag = nuevoNumPag
    }

    fun cambiarCalif(nuevaCalif: Int) {
        calificacion = nuevaCalif
    }
}


class ConjuntoLibros(val cantidad: Int) {
    val lislibros = arrayListOf<Libro>()
    fun anadirLibro(libroNuevo: Libro) {
        if (lislibros.size <= cantidad) {
            lislibros.add(libroNuevo)
        } else
            println("Este conjunto ya tiene $cantidad libros asociados")
    }

    fun eliminarLibro(campo: String) {
        var eliminado : Boolean = false
        val contadorMax = lislibros.size
        var i = 0
        do {
            val lActual = lislibros[i]
            if (lActual.autor == campo || lActual.titulo == campo) {
                lislibros.remove(lActual)
                println("Se ha eliminado el libro ${lActual.titulo} de ${lActual.autor}")
                eliminado= true
            } else
                i++
        } while (i != contadorMax && !eliminado)
        if (!eliminado){
            println("No se ha encontrado ningún libro con este campo")
        }
    }
    fun cCalificacion(){
        var mCalificacion = 0
        var pCalificacion = 10
        var lMejCal : Libro
        var lPeorCal : Libro
        val contadorMax = lislibros.size
        var i = 0
        do {
            val lActual = lislibros[i]
            lMejCal = lActual
            if (lActual.calificacion > mCalificacion) {
                mCalificacion = lActual.calificacion
                i++
            } else
                i++
        } while (i != contadorMax)
        var i2 = 0
        do {
            val lActual = lislibros[i2]
            lPeorCal = lActual
            if (lActual.calificacion < pCalificacion) {
                lPeorCal = lislibros[i2]
                pCalificacion = lActual.calificacion
                i2++
            } else
                i2++
        } while (i2 != contadorMax)
        println("El libro con mayor calificación es ${lMejCal.titulo} de ${lMejCal.autor} con una calificación de ${lMejCal.calificacion}")
        println("El libro con peor calificación es ${lPeorCal.titulo} de ${lPeorCal.autor} con una calificación de ${lPeorCal.calificacion}")

    }
    fun mostrarTodo(){
        val contadorMax = lislibros.size
        var i = 0
        do{
            if (i<contadorMax) {
                val todo = lislibros[i]
                println("El libro se llama ${todo.titulo}")
                println("Tiene un total de ${todo.num_pag} paginas")
                println("Su autor se llama ${todo.autor}")
                println("Su calificacion es ${todo.calificacion}")
                i++
            }
        }while (i != contadorMax)
    }
}

fun main() {
    val libro1 = Libro("bianco", "jose", 45, 8)
    val libro2 = Libro("dado", "juanma", 23, 10)
    val conjunto1 = ConjuntoLibros(5)
    conjunto1.anadirLibro(libro1)
    conjunto1.anadirLibro(libro2)
    conjunto1.cCalificacion()
    conjunto1.eliminarLibro("bianco")
}