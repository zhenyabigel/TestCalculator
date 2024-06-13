package by.zhenyabigel.calculator.model

sealed class CalculatorAction {
    data class Number(val number: Int): CalculatorAction()
    object Clear: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
    object Percent: CalculatorAction()
    object ChangeOfSing: CalculatorAction()

    data class Operation(val operation: CalculatorOperation): CalculatorAction()

}