package Basics

fun main()
{
    // * use of break
    for (nums in 5..15) {
        if (nums == 10) {
            break
        }
        println(nums)
    }

    // * use of continue
    for (num in 4..16) {
        if (num == 10) {
            continue
        }
        println(num)
    }
}


