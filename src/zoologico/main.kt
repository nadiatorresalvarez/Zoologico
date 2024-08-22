package zoologico

fun gestionarHabitats() {
    val sabana = Sabana("Sabana Africana", "Cálido", 10000)
    sabana.capacidad = 20
    sabana.detallesHabitat()
}

fun gestionarAnimales() {
    val leon = Leon("Simba")
    val elefante = Elefante("Dumbo")

    println("Animal: ${leon.nombre}, Especie: ${leon.especie}")
    leon.comer()
    leon.moverse()

    println("Animal: ${elefante.nombre}, Especie: ${elefante.especie}")
    elefante.comer()
    elefante.moverse()
}

fun main() {
    gestionarHabitats()
    println("------------------------------------------")
    gestionarAnimales()
}