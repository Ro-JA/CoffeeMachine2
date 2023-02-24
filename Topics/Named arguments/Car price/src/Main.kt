// complete this function, add default values


fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false) {
    var price = 0

    val priceNewCar = 20000

    val oldPrice = old * 2000

    val kilometersPrice = if (kilometers > 10000) kilometers / 10000 * 200 else 0

    val automaticPrice = if (automatic) 1500 else 0

    if (maximumSpeed < 120) {
        price = priceNewCar - oldPrice - kilometersPrice - automaticPrice - ((120 - maximumSpeed) * 100)
    } else {
        price = priceNewCar - oldPrice - kilometersPrice - automaticPrice + ((maximumSpeed - 120) * 100)
    }

    println(price)

}