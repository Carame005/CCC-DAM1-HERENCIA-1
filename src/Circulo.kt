class Circulo(nombre : String,color: Color, private val radio: Double) : Figura(nombre,color) {
    override fun area(): Double = Math.PI * radio * radio
    override fun perimetro(): Double = Math.PI * radio
}