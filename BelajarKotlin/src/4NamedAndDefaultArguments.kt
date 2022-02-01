
fun displaySeparator(character : Char = '*', size : Int = 10)
{
    repeat(size)
    {
        print(character)
    }
    println()
}


fun main()
{
    println(listOf('a','b','c').joinToString(separator = "",prefix = "(",postfix = ")"))
    println(listOf('a','b','c').joinToString(postfix = "."))

    displaySeparator('#',5)
    displaySeparator('#')
    displaySeparator()

}
