package zoologico

open class Habitat(open var nombre: String, open var clima: String, open var superficie: Int) {
    open val tipo = "Natural"
    open var capacidad: Int = 0

    open fun detallesHabitat() {
        println("Hábitat: $nombre")
        println("Clima: $clima")
        println("Superficie: $superficie m²")
        println("Capacidad: $capacidad animales")
    }

    init {
        println("---Inicializando hábitat---")
    }

    constructor(nombre: String, clima: String, superficie: Int, capacidad: Int) : this(nombre, clima, superficie) {
        this.capacidad = capacidad
    }
}

class Sabana(override var nombre: String, override var clima: String, override var superficie: Int) : Habitat(nombre, clima, superficie) {
    override val tipo = "Sabana"

    init {
        println("Inicializando hábitat sabana: $nombre")
    }
}
