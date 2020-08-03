fun main(){
    val title = "The Amaze Apples High shool"

    val grade = 95

    if(grade >= 50 && grade < 60){
        println("Made it! Barely.")
    }else if(grade > 60 && grade < 80){
        println("Average!")
    }else if(grade > 80 && grade < 100){
        println("Very Good!")
        if(grade == 95){
            println("Excellent!")
        }
    }else if(grade == 100){
        println("Perfect! Score!")
    }else{
        println("You have really failed.")
    }
}