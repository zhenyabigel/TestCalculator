package by.zhenyabigel.calculator.model

import by.zhenyabigel.calculator.model.CalculatorOperation

data class CalculatorState(
    val firstNumber: String = "1",
    val secondNumber: String= "2",
    val result: String= "3",
    val operation: CalculatorOperation? = null
)
