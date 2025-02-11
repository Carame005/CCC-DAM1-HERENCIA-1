class Rectangulo(nombre : String ,color: Color, private val base: Double, private val altura: Double) : Figura(nombre,color) {
    override fun area(): Double = base * altura
    override fun perimetro(): Double = 2 * (base + altura)
}