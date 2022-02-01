fun forIterating()
{
    val list = listOf("a","b","c")
    for(s in list)
    {
        print(s)
    }
}

fun iteratingOverMap()
{
    val map = mapOf(1 to "one",
                    2 to "two",
                    3 to "three")

    for((key,value) in map)
    {
        println("$key = $value")
    }

}

fun iteratingWithIndex()
{
    val list = listOf("a","b","c")
    for((index,element) in list.withIndex())
    {
        println("$index:$element")
    }
}

fun iteratingOverRange()
{
    for(i in 1..9)
    {
        print(i) // output 123456789
    }
    println()
    for(i in 1 until 9)
    {
        print(i) // output 12345678
    }
    println()
}

fun iteratingWithStep()
{
    for(i in 9 downTo 1 step 2)
    {
        print(i) //output 97531
    }
    println()
}

fun iteratingOverString()
{
    for(ch in "abc")
    {
        print(ch+1)
    }
    println()

}

fun main()
{
    forIterating()
    println()
    iteratingOverMap()
    println()
    iteratingWithIndex()
    iteratingOverRange()
    iteratingWithStep()
    iteratingOverString()
}