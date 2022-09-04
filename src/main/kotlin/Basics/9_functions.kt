package Basics

// * normal function
fun myFunction0()
{
    println("Working")
}

// * single parameter function
fun myFunction1(fname: String)
{
    println("$fname Doe")
}

// * double parameter function
fun myFunction2(fname: String, age: Int) {
    println(fname + " is " + age)
}
/*
fun myFunction3(fname , age)
{
    cannot do this
    must have to specify variable
}
*/

// * return type function
fun sum(x: Int): Int {
    return (x + 5)
}

// * sorter syntax for return value
fun myFunction5(x: Int, y: Int) = x + y


fun main()
{
    myFunction0()
    myFunction1("John")
    myFunction2("Mridul" , 22)
    // * myFunction3("mridul" , 90)

    var result = sum(5)
    println(result)

    var result1 = myFunction5(5,8)
    println(result1)

}