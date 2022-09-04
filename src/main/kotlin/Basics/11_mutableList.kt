package Basics

class `11_mutableList` {
}

// * now we can add elements in lated
fun main()
{
    var mutableList1 = mutableListOf("Ajay","Vijay")
    mutableList1.add("Prakash")

    // * no need to initialize first
    // * size not fixed
    // * can add elements later
    // * add element with index
    var mutableList2 = mutableListOf<String>()
    mutableList2.add("Ajeet")
    mutableList2.add("Amit")
    mutableList2.add("Akash")
    mutableList2.add(1,"Aki")  // * index wise add
    mutableList2.addAll(2,mutableList1) // * add another list
    mutableList2.remove("Vijay")  // * remove element
    mutableList2.removeAt(2)       // * remove index wise
    // * mutableList2.clear()
    println(mutableList2.subList(1,4))  // * Sub from 1 to n-1
    println(mutableList2)  // * print all values of mutable list


    for(element in mutableList1){
        println(element)
    }
    println()
    for(element in mutableList2){
        println(element)
    }

    mutableList2.retainAll(mutableList1)
    println(mutableList2)
}