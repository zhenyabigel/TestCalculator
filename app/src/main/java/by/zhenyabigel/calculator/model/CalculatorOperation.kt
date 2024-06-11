package by.zhenyabigel.calculator.model

sealed class CalculatorOperation (val symbol:String) {
    object Add: CalculatorOperation("+")
    object Subtraction: CalculatorOperation("-")
    object Multiply: CalculatorOperation("x")
    object Divide: CalculatorOperation("/")
    object Percent: CalculatorOperation("%")
    object ChangeOfSing: CalculatorOperation("+/-")


}