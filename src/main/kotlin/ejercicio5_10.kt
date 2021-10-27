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
        if (lislibros.size <= 3) {
            lislibros.add(libroNuevo)
        } else
            println("Este conjunto ya tiene $cantidad libros asociados")
    }

    fun eliminarLibro(campo: String) {
        val contadorMax = lislibros.size
        var i = 0
        do {
            val lActual = lislibros[i]
            if (lActual.autor == campo || lActual.titulo == campo) {
                lislibros.remove(lActual)
            } else
                i++
        } while (i != contadorMax)
    }
}

fun main() {
    val libro1 = Libro("bianco", "jose", 45, 8)
    val libro2 = Libro("dado", "juanma", 23, 10)
    val conjunto1 = ConjuntoLibros(5)
    conjunto1.eliminarLibro("bianco")
}