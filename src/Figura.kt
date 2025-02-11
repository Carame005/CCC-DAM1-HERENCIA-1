abstract class Figura( protected val nombre : String,protected val color: Color) {
    abstract fun area() : Double

    abstract fun perimetro() : Double

    override fun toString(): String {
        return "Esta figura llamada $nombre de color $color, área: ${area()}, perímetro: ${perimetro()}"
    }
}