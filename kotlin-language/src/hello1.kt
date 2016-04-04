/**
 * Created by emedinaa on 02/04/16.
 */
fun main(args: Array<String>) {
    val numbers= arrayListOf(1,2,3,4,5,6)

    //println(numbers.filter{it %2==0})
    println("Even numbers are ${ numbers.filter{ it % 2 == 0} }")
}