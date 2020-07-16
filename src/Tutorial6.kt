fun main(){

    var title = "The Amaza Apples"
    var amount_of_apples = 25.0
    var price = 15

    println(title)

    print("Selling @ $")
    println(price)

    print("Amount Apples In Stock: ")
    println(amount_of_apples)

    println("Sale Made!!! Decrementing")
    var sold = 7
    amount_of_apples = amount_of_apples - sold

    println("Gained Made!!! Incrementing")
    var gained = 7
    amount_of_apples = amount_of_apples + gained


    print("Amount Apples In Stock: ")
    println(amount_of_apples)


    amount_of_apples -= sold
    amount_of_apples += gained


    amount_of_apples--
    print("Amount Apples In Stock (Lost): ")
    println(amount_of_apples)


    amount_of_apples++
    print("Amount Apples In Stock (Gained): ")
    println(amount_of_apples)


}