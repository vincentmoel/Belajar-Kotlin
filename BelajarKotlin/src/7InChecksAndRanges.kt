import kotlin.reflect.typeOf

fun isLetter(c:Char) = c in 'a'..'z' || c in 'A'..'Z'
//fun isLetter(c:Char) = 'a' <= c && c<='z' || c in 'A'..'Z' //bisa juga

fun isNotDigit(c:Char) = c !in '0'..'9'

fun recognize(c:Char) = when (c)
{
    in '0'..'9' -> "Ini angka"
    in 'a'..'z', in 'A'..'Z' -> "Ini Huruf"
    else -> "Ga tau"
}


fun main()
{
    println(isLetter('q')) // true
    println(isLetter('*')) // false
    println(isNotDigit('x')) // true
    println(recognize('1'))
    println()
    println("Kotlin" in "Java".."Scala")
}