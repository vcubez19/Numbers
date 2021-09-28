import java.text.DecimalFormat


fun main() {

    var total = 0F
    val tax = .025
    val tip = .175
    val extraCharges = tax + tip


    do {

        println("Enter the cost of an item. Type 0 to finish. :  ")
        val input = readLine()!!.toFloat()
        total += input


    } while (input != 0F)
    val finalTotal = total - ( total * extraCharges )
    println("After a 2.5% tax and a 17.5% tip, your total will be " + String.format("$%.2f", finalTotal) + ". Thanks!")

}

