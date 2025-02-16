fun main() {
    val estudiante1 = Estudiante("Juan Pérez", 20, "E123", "Ingeniería", 8.5)
    estudiante1.mostrarRol()
    println("Curso: ${estudiante1.curso}")
    estudiante1.mostrarCalificacion()
    println()

    val profesor1 = Profesor("Ana Gómez", 40, "P456", "Matemáticas", 15)
    profesor1.mostrarRol()
    println("Departamento: ${profesor1.departamento}")
    profesor1.mostrarExperiencia()
}