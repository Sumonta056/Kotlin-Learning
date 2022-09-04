package class_Object

// * secondary type constructor
class constructorTyp3 {

    constructor(id: Int){
        //code
        println("working $id")
    }
    constructor(name: String, id: Int){
        //code
        println("$name with $id")
    }
}

fun main()
{
    var obj1 = constructorTyp3(20)
    var obj2 = constructorTyp3("mridul" , 22)
}