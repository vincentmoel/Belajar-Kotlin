import java.lang.Exception

enum class Color
{
    BLUE, ORANGE, RED
}

fun getDescription(color: Color) : String =
    when (color)
    {
        Color.BLUE -> "Cold"
        Color.ORANGE -> "mild"
        Color.RED -> "hot"
    }

fun respondToInput(input:String) = when (input)
{
    "y","yes" -> "Kondisi Yes"
    "n","no" -> "Kondisi No"
    else -> "Masuk Else"
}


enum class Color2
{
    BLUE, ORANGE, RED, YELLOW, VIOLET, GREEN, INDIGO
}
fun mix(c1 : Color2, c2 : Color2) =
    when (setOf(c1,c2))
    {
        setOf(Color2.RED,Color2.YELLOW) -> Color2.ORANGE
        setOf(Color2.YELLOW,Color2.BLUE) -> Color2.GREEN
        setOf(Color2.BLUE,Color2.VIOLET) -> Color2.INDIGO
        else -> throw Exception("Dirty Color")
    }

fun updateWeather(derajat : Int)
{
    val(deskripsi, warna) = when {
        derajat < 5 -> "cold" to Color.BLUE
        derajat < 23 -> "cold" to Color.ORANGE
        else -> "hot" to Color.RED
    }
}

fun main()
{
    var a = 1
    var b = 2
    val max = if(a > b) a else b
    println(max)

    getDescription(Color.BLUE)
    println(respondToInput("y"))
    println(mix(Color2.RED,Color2.YELLOW))
    println(updateWeather(3))


}
