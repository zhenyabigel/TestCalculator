package by.zhenyabigel.calculator

sealed class CalculatorOperation (val symbol:String) {
    object Add:CalculatorOperation("+")
    object Subtraction:CalculatorOperation("-")
    object Multiply:CalculatorOperation("x")
    object Divide:CalculatorOperation("/")
    object Percent:CalculatorOperation("%")


}