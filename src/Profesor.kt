class Profesor(
    nombre: String,
    edad: Int,
    id: String,
    val departamento: String, // Departamento al que pertenece el profesor
    val aniosExperiencia: Int // Años de experiencia del profesor
) : Persona(nombre, edad, id) {

    // Sobrescribimos el método mostrarRol() para indicar que es un profesor
    override fun mostrarRol() {
        println("Rol: Profesor")
    }

    // Método para mostrar los años de experiencia
    fun mostrarExperiencia() {
        println("Años de Experiencia: $aniosExperiencia")
    }
}