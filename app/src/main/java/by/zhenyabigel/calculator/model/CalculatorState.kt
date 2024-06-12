package by.zhenyabigel.calculator.model

import by.zhenyabigel.calculator.model.CalculatorOperation

data class CalculatorState(
    val firstNumber: String = "",
    val secondNumber: String= "",
    val result: String = "",
    val operation: CalculatorOperation? = null,
    val isClearBtn: Boolean = false
)
