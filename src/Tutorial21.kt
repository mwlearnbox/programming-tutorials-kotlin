fun main(){

    val title = "The Amaze Apples"
    val radius = 5
    val pi = 3.14

    //A = πr²
    val area = pi * radius * radius

    println("The area of the $title building is $area")

    when (area) {
        1000.0 -> {
            println("That is enormous")
        }
        500.0 -> {
            println("That is still way too big")
        }
        10.0 -> {
            println("That's an okay size")
        }
        else -> {
            println("That is way too small")
        }
    }
     /*
    when {
        area > 1000 -> {
            println("That is enormous")
        }
        area > 500 -> {
            println("That is still way too big")
        }
        area > 10 -> {
            println("That's an okay size")
        }
        else -> {
            println("That is way too small")
        }
    }*/

}