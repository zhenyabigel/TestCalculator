package by.zhenyabigel.calculator

import by.zhenyabigel.calculator.model.CalculatorOperation

data class CalculatorState(
    val firstNumber: String = "",
    val secondNumber: String= "",
    val operation: CalculatorOperation? = null
)
