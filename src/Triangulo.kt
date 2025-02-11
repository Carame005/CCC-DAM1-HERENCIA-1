class Triangulo(
    nombre : String,
    color: Color,
    private val base: Double,
    private val altura: Double,
    private val lado1: Double,
    private val lado2: Double
) : Figura(nombre,color) {
    override fun area(): Double = (base * altura) / 2
    override fun perimetro(): Double = lado1 + lado2 + base
}