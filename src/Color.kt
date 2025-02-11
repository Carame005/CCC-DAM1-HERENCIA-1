enum class Color {
    Blanco,
    Negro,
    Gris,
    Azul,
    Verde;
    companion object {
        fun colorAleatorio(): Color {
            return entries.random()
        }
    }
}