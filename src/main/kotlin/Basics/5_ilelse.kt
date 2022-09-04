package Basics

fun main()
{
    // * check value exists
    val nums = arrayOf(2, 4, 6, 8)
    if (2 in nums)
    {
        println("It exists!")
    }
    else
    {
        println("It does not exist.")
    }
}