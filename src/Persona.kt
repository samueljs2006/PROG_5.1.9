open class Persona(
    val nombre: String,
    val edad: Int,
    val id: String
) {
    open fun mostrarRol() {
        println("Rol: Persona")
    }
}