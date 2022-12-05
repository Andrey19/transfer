fun main(args: Array<String>) {
    val amount: Int = 4900
    var minCommision: Int = 35
    val commission: Double = 0.0075

    var result = amount * commission
    if(result < minCommision) result = minCommision.toDouble()
    println("Комиссия за перевод  составит : " + result + " рублей ")
}