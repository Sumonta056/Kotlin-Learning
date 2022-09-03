package Basics

fun main()
{
    var name = "Sumonta"
    var name2: String = "Saha"

    // * modify using var
    name2 = "Mridul"

    // * access element of string
    println(name[0])
    println(name[1])

    // * string length
    println(name.length)

    // upper case and lower case
    println(name.toUpperCase())
    println(name.toLowerCase())

    // * check equal
    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)

    // * find string in a string
    var txt = "Please locate where 'locate' occurs!"
    println(txt.indexOf("locate"))  // Outputs 7
    println(txt.indexOf("adi"))  // Outputs -1 if not found

    // * String concatenation
    var firstName = "John"
    var lastName = "Doe"
    println(firstName + " " + lastName)

    var firstName1 = "John "
    var lastName1 = "Doe"
    println(firstName1.plus(lastName1))


    // * string Interpolation or template'
    // * unique feature
    var firstName3 = "John"
    var lastName3 = "Doe"
    println("My name is $firstName3 $lastName3")


}