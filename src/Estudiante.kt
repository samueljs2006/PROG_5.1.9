class Estudiante(
    nombre: String,
    edad: Int,
    id: String,
    val curso: String, // Curso al que pertenece el estudiante
    val calificacionPromedio: Double // Calificación promedio del estudiante
) : Persona(nombre, edad, id) {

    override fun mostrarRol() {
        println("Rol: Estudiante")
    }

    fun mostrarCalificacion() {
        println("Calificación Promedio: $calificacionPromedio")
    }
}