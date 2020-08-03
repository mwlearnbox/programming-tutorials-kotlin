fun main(){

    val title = "The Amaze Apples"

    /* Boolean Operators
        < Less than
        > Greater than
        <= Less than or equal to
        >= Greater than or equal to
        == Equal to
        != Not equal to
     */
/*
    val apples = 14
    println("apples > 20 ${apples > 20}")
    println("apples < 20 ${apples < 20}")
    println("apples <= 20 ${apples <= 20}")
    println("apples >= 20 ${apples >= 20}")
    println("apples == 20 ${apples == 20}")
    println("apples != 20 ${apples != 20}")
*/

    val sales= 40
    val cost = 50

    if(sales > cost){
        println("We made a profit of $${sales - cost}")
    }else{
        println("We made a loss of $${cost - sales}")
    }
}