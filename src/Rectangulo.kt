class Rectangulo (color: Color, var base : Double, var altura : Double) : Figura(color) {
    var area : Double = 0.0
    var perimetro : Double = 0.0

    override fun area(): Double {
        area = base*altura
        return area
    }

    override fun perimetro(): Double {
        perimetro = 2*base + 2*altura
        return perimetro
    }
}