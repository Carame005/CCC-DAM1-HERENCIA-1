class Triangulo(color: Color, var base : Double, var altura : Double, var lado1 : Double, var lado2 : Double, var lado3 : Double) : Figura(color) {
    var area : Double = 0.0
    var perimetro : Double = 0.0
    override fun area(): Double {
        area = (base*altura)/2
        return area
    }

    override fun perimetro(): Double {
        perimetro = lado1+lado2+lado3
        return perimetro
    }
}