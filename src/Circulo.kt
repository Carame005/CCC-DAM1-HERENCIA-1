class Circulo (color: Color, var diametro : Double) : Figura(color) {
    var area : Double = 0.0
    var perimetro : Double = 0.0

    override fun area(): Double {
        area = Math.PI * ((diametro/2)*(diametro/2))
        return area
    }

    override fun perimetro(): Double {
        perimetro = Math.PI * diametro
        return perimetro
    }
}