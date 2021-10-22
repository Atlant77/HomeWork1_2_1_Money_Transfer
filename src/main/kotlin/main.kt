fun main(){
    val amount = 1_150_068 //сумма перевода в коп.
    var comissionOfTransfer: Int = (amount * 0.0075).toInt()
    if (comissionOfTransfer <= 3_500){
        comissionOfTransfer = 3_500
    }
    println("Сумма перевода ${amount/100} руб. ${amount%100} коп., " +
            "комиссия за перевод ${comissionOfTransfer/100} руб. ${comissionOfTransfer%100} коп.")
}