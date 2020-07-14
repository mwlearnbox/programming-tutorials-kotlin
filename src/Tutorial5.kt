fun main() {

    println("Hello World")

    val title = "The Amaze Apples"
    val amount = 20
    val price = 5.95f
    val discount = 0.4f
    val open = false
    val colorOfTheCompany = "Red"
    val location = "The Alley Way"

    println(title)
    println(colorOfTheCompany)
    println(location)
    println(amount)
    println(price)
    println(discount)
    println(open)

    val costOfProduction = 1.0f
    val crates = 10
    val applesPerCrate = amount / crates
    println(applesPerCrate)

    var profit = price - costOfProduction
    profit *= amount
    println(profit)

    val bossSalaryPercentage = 0.9f
    val bossSalary = profit * bossSalaryPercentage
    println(bossSalary)

    val moneyLeft = profit - bossSalary
    println(moneyLeft)

    val numberOfEmployee = 4
    println(moneyLeft / numberOfEmployee)

}