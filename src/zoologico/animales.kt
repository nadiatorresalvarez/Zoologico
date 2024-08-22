package zoologico

abstract class Animal {
    abstract val nombre: String
    abstract val especie: String
}

interface AccionAnimal {
    fun comer()
    fun moverse()
}

class Leon(override val nombre: String, override val especie: String = "Panthera leo") : Animal(), AccionAnimal {
    override fun comer() {
        println("$nombre está cazando y comiendo carne.")
    }

    override fun moverse() {
        println("$nombre está corriendo por la sabana.")
    }
}

class Elefante(override val nombre: String, override val especie: String = "Loxodonta africana") : Animal(), AccionAnimal {
    override fun comer() {
        println("$nombre está comiendo hierba y hojas.")
    }

    override fun moverse() {
        println("$nombre está caminando lentamente por la sabana.")
    }
}
