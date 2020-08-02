fun main(){
    val title = "The Amaze Apples"
    val open = false

    if (open == false) {
        println("$title is closed!")
    }else{
        println("$title is opened!")
    }

    if(open == true){
        println("$title closes at 12:00pm")
    }else{
        println("$title opens at 11:45am")
    }
}