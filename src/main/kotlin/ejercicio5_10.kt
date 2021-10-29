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
    fun mostrar(){
        println("El libro se llama $titulo")
        println("Tiene un total de $num_pag paginas")
        println("Su autor se llama $autor")
        println("Su calificacion es $calificacion")
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
        var lMejCalTitulo = ""
        var lPeorCalTitulo= ""
        var lMejCalAutor= ""
        var lPeorCalAutor= ""
        val contadorMax = lislibros.size
        var i = 0
        do {
            val lActual = lislibros[i]
            if (lActual.calificacion > mCalificacion) {
                mCalificacion = lActual.calificacion
                lMejCalTitulo = lActual.titulo
                lMejCalAutor = lActual.autor
            }

            if (lActual.calificacion < pCalificacion) {
                pCalificacion = lActual.calificacion
                lPeorCalTitulo = lActual.titulo
                lPeorCalAutor = lActual.autor
            }
            i++
        } while (i != contadorMax)
        println("El libro con mayor calificación es $lMejCalTitulo de $lMejCalAutor con una calificación de $mCalificacion")
        println("El libro con peor calificación es $lPeorCalTitulo de $lPeorCalAutor con una calificación de $pCalificacion")

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
    conjunto1.eliminarLibro("juanma")
    val libro3 = Libro("aries","rafa",57,7)
    libro3.mostrar()
}