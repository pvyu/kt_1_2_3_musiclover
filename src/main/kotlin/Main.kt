fun main() {
    val sumFor_100_rub : Int = 1001
    val sumFor_5_percent : Int = 10_001
    val isMusiclover : Boolean = false;

    val amount : Int = 100
    var total : Int = 0
    var discount : Int = 0

    total = when {
                (amount >= sumFor_5_percent) -> (amount * 0.95).toInt()
                (amount >= sumFor_100_rub) -> amount - 100
                else -> amount
            }
    if (isMusiclover) {
        total = (total * 0.99).toInt()
    }
    discount = amount - total

    println("Сумма покупки $amount")
    println("Сумма скидки $discount")
    println("К оплате $total")
}