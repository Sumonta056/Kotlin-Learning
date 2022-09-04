package class_Object

// * constructor with init
// * no need var use here
class constructorTyp2 (name: String, id: Int) {
    val e_name: String
    var e_id: Int

    // * initialize with init
    init {
        e_name = name
        e_id = id
    }

    fun print()
    {
        println("$e_name $e_id")
    }
}

fun main()
{
    var obj = constructorTyp2("Rakib" , 201956)
    obj.print()
}