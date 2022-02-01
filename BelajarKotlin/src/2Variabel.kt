fun main()
{
    val valReadOnly:String = "ini ReadOnly" // Variabel hanya ReadOnly
//    valReadOnly = "Halo2" // Error
    println(valReadOnly)

    var varMutable:String = "ini Mutable" // Bisa ganti value dari variable
    println(varMutable)

    varMutable = "ini Mutable2"
    println(varMutable)

    var number:Int = 0
    var number2 = 1
    println(number)
    println(number2)

    // val : read-only reference, not object
    // bisa menambahkan item karena List adalah object
    // mutableListOf << List yang mutable
    val iniListMutable = mutableListOf("Java","Python")
    println(iniListMutable)

    iniListMutable.add("Kotlin")
    println(iniListMutable)

    // listOf << unmutable list
    val iniListUnmutable = listOf("Java")
//    iniListUnmutable.add("Python") //Error
}