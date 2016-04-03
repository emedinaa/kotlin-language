/**
 * Created by emedinaa on 02/04/16.
 */
data class Customer(val name:String, val email:String)

fun main(args: Array<String>) {
    val customer= Customer("Eduardo Medina","emedinaa@gmail.com")
    println(customer)
    println("Hello Kotlin")
}