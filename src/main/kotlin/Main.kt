import java.text.DecimalFormat


fun main() {

    // User's total
    var total = 0F

    // Expenses
    val tax = .025
    val tip = .175
    val extraCharges = tax + tip


    do {

        // Getting input
        println("Enter the cost of an item. Type 0 to finish. :  ")
        val input = readLine()!!.toFloat()

        // Adding to total
        total += input


    } while (input != 0F)

    // Final total after expenses
    val finalTotal = total - ( total * extraCharges )
    println("After a 2.5% tax and a 17.5% tip, your total will be " + String.format("$%.2f", finalTotal) + ". Thanks!")

}

