fun main(){

    //make a var because we are going to be changing the variable
    var x = 10

    //decrement by one
    x--

    //increment by two
    x+=2

    //What x is now
    println("x = $x")

    //incrementing
    x = 10
    println("Pre Incrementing ${++x}")
    x = 10
    println("Post Incrementing ${x++}")

    //What x is now
    println("x = $x")

    //incrementing
    x = 10
    println("Pre Decrementing ${--x}")
    x = 10
    println("Post Decrementing ${x--}")

    //What x is now
    println("x = $x")
}