fun max(a:Int, b:Int) : Int
{
    return if(a>b) a else b
}

fun max2(a:Int, b:Int) : Int = if(a>b) a else b

fun displayMax(a:Int, b:Int) // no return value sama seperti void
{
    println(max(a,b))
}

fun displayMax2(a:Int, b:Int) : Unit // no return value sama seperti void
{
    println(max(a,b))
}

fun main()
{
    println(max(1,2))
    println(max2(1,2))
    displayMax(1,2)
    displayMax2(1,2)

}