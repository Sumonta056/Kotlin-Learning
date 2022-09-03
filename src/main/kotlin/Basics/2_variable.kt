package Basics


    fun main()
    {
        // * variable types
        val myNum = 5             // Int
        val myDoubleNum = 5.99    // Double
        val myLetter = 'D'        // Char
        val myBoolean = true      // Boolean
        val myText = "Hello"      // String

        // you can specify variable type
        val myNum1: Int = 5                // Int
        val myDoubleNum1: Double = 5.99    // Double
        val myLetter1: Char = 'D'          // Char
        val myBoolean1: Boolean = true     // Boolean
        val myText1: String = "Hello"      // String

        // * type 1
        val num = 20
        val name1 = "Mridul"

        println(name1 + num)

        // * you cannot do this
        // * you must have assign value with variable, and you can change it later
        /*
        var test
        test = 2
         */

        // * For  reassign must use "var" instead of "val"
        var test = "John"
        test = "Resign = Ali"

        val test2 = test

        println(test)
        println(test2)

        // * Type 2
        val name: String = "John" // String
        val birthyear: Int = 1975 // Int

        println(name)
        println(birthyear)

        // * val = if you never want to modify the value
        // * var = if you want to modify the value in future
    }
