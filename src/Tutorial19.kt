fun main(){

    val title = "The Amaze Apples High shool"

    val grade = 39

    // Logical Operators
    // && - AND
    // || - OR

    if(grade >= 50 && grade < 60){
        println("Made it! Barely.")
    }else if(grade > 60 && grade < 80){
        println("Average!")
    }else if(grade > 80 && grade < 100){
        println("Very Good!")
    }else if(grade == 100){
        println("Perfect! Score!")
    }else if(grade < 40 || grade < 30){
        println("You have failed.")
    }else{
        println("You have really failed.")
    }

}