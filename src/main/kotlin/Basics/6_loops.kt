package Basics

fun main()
{

    var i = 0
    while (i < 5)
    {
        println(i)
        i++
    }

    // * do - while loop
    // * oop will always be executed at least once,
    // * even if the condition is false
    var j = 0
    do {
        println(j)
        j++
    }
    while (j < 5)

    // * for loop in kotlin
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars)
    {
        println(x)
    }

    // * ranged base for loop
    // * 10 >= x >= 3
    for(x in 3..10)
    {
        println(x)
    }
    for (chars in 'a'..'x')
    {
        print(chars)
    }

}