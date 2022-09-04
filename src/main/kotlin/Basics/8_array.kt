package Basics

fun main()
{
    // * declare array
    // * create array
    // * Type - 1
     val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")

    // * Access Elements of array
    println(cars[2])
    println(cars[1])

    // * Change array element
    cars[0]  = "Ferrari"
    println(cars[0])

    // * Size
    println(cars.size)

    // * if else
    // * Check element exists in array
    val name = "BMW"
    if(name in cars) println("Yes")
    else println("No")

    // * New For loop
    // * Look through array
    for(x in cars)
    {
        println(x)
    }

    // * array declaration types
    // * initializes the element of array of int type with

    // * size 5 with all elements as 0
    var myArray = Array<Int>(5){0}

    var myArray1 = arrayOf(1,10,4,6,15)
    var myArray2 = arrayOf<Int>(1,10,4,6,15)
    val name1 = arrayOf<String>("Ajay","Prakesh","Michel","John","Sumit")
    var myArray4= arrayOf(1,10,4, "Ajay","Prakesh")
    var myArray5: IntArray = intArrayOf(5,10,20,12,15)

    // * changing array values
    myArray[1]= 10
    myArray[3]= 15
    for(element in myArray){             // * type 1 loop
        println(element)
    }

    // * traversing array
    for (index in 0..myArray5.size-1) { // * type 2 loop
        println(myArray5[index])
    }


    }