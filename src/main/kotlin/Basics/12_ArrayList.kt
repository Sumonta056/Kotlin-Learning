package Basics

class `12_ArrayList` {
}

fun main()
{
    // * Types of array list declare
    //Creating an empty arraylist
    val arr = ArrayList<String>()
    //Creating arraylist with size initial
    val arrayList2 = ArrayList<Int>(5)

    //Adding object in arraylist
    arr.add("Sumonta")
    arr.add("Saha")
    arr.add("Mridul")

    arrayList2.add(14)
    arrayList2.add(20)
    arrayList2.add(80)
    // Here initial array size = 5
    // as we added just three element  array size = 3
    println("size of arrayList2 = "+arrayList2.size)

    // * traverse array List
    for(i in arr)
    {
        println(i)
    }
    println()

    // * Filled elements in ArrayList using collection
    val arrayList: ArrayList<String> = ArrayList<String>(5)
    var list: MutableList<String> = mutableListOf<String>()

    list.add("Ajay")
    list.add("Vijay")
    list.add("Prakash")

    arrayList.addAll(list)

    for(i in arrayList)
    {
        println(i)
    }
    println()

    // * use get to access value in Index
    println(arrayList.get(1))
    // or
    println(arrayList[1])

    // * Use Set to change value in index
    arrayList.set(1,"Adib")
    // arrayList[1] = "Adib"
    println(arrayList[1])


    // * get index of value
    // * -1 if not array
    println(arrayList.indexOf("Vijay"))
    println(arrayList.lastIndexOf("Vijay"))
    // if two or more same element get the last value


    // * remove any value
    arrayList.remove("Adib")
    println(arrayList[1])

    // * remove using index
    arrayList.removeAt(1)
    println(arrayList[1])
    // error cause these element deleted


    // *


}