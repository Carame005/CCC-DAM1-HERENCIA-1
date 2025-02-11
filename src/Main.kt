fun main() {
    var circulo = Circulo("Circulo",color = Color.colorAleatorio(),8.0)
    println(circulo)

    var rectangulo = Rectangulo("Rectangulo",color = Color.colorAleatorio(),8.0,20.0)
    println(rectangulo)

    var triangulo = Triangulo("Triangulo",color = Color.colorAleatorio(),8.0,5.0,9.0,6.0,4.0)
    println(triangulo)
}