package Basics

class `10_List` {
}

fun main()
{
    // * LIST calling
    // * size fixed with initial call : can't add later
    //read only, fix-size
    var list = listOf("Ajay","Vijay","Prakash")
    //* type 1 traverse
    for(element in list){
        println(element)
    }
    //* type 2 traverse
    for(index in 0..list.size-1){
        println(list[index])
    }


    // * Types of list
    var intList: List<Int> = listOf<Int>(1,2,3)
    var stringList: List<String> = listOf<String>("Ajay","Vijay","Prakash")
    var anyList: List<Any> = listOf<Any>(1,2,3,"Ajay","Vijay","Prakash")

     // * applications of list
    println()
    println(stringList.get(0)) // * get index based element

    println(stringList.indexOf("Vijay"))
    println(stringList.lastIndexOf("Vijay"))

    println(stringList.size)

    // * check a value is in kotlin or not:return true if found
    println(stringList.contains("Prakash"))
    println(stringList.containsAll(list)) // search with another list

    // * sub listing
    println(stringList.subList(2,4))

    // * check list empty
    println(stringList.isEmpty())

    // * delete n no number of elements from list
    println(stringList.drop(1))
    println(stringList.dropLast(2))

}