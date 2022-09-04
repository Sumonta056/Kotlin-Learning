package class_Object

class className {
    // * property
    var accountNo:Int = 10  // * type 1
    var name = ""           // * type 2 variable calling
    private var amount = 0f // * private variable
                            // * float for f

    // * function of class
    // * use of this cause same renaming
    fun deposit(accountNo:Int, name:String, amount: Float)
    {
        this.name = name
        this.accountNo = accountNo
        this.amount = amount

        println("Account $accountNo : $name has $amount taka" )
    }
}

fun main()
{
    // * object create
    var obj1 = className();

    // * access object element
    // * for floating have to use 100.00f
    obj1.deposit(56 , "Mridul" , 100.00f)

}