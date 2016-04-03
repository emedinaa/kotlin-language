/**
 * Created by emedinaa on 02/04/16.
 */
fun main(args: Array<String>) {
    val countriesCities= listOf(Pair("Peru","Lima"),
            Pair("Colombia","Bogota"),Pair("Eduardo", "Quito"))

    for((country,city)in countriesCities)
    {
        println("Country: ${country} - City: ${city}")
    }

}