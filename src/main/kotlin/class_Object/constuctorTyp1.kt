package class_Object

// * primary constructor
// * must use var careful
class constuctorTyp1(var nam1:String , var age:Int) {

    fun print()
    {
        println("$nam1 $age")
    }
}

fun main(args: Array<String>)
{
    // * consuctor and object calling
    var obj = constuctorTyp1("Mridul",22)

    obj.print()

}