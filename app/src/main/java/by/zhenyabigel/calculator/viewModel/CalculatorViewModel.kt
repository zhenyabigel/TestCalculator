package by.zhenyabigel.calculator.viewModel

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import by.zhenyabigel.calculator.model.CalculatorAction
import by.zhenyabigel.calculator.model.CalculatorOperation
import by.zhenyabigel.calculator.model.CalculatorState

class CalculatorViewModel: ViewModel() {
    var state by mutableStateOf(CalculatorState())
        private set

    fun onAction(action: CalculatorAction){
        when(action){
            is CalculatorAction.Number -> putNumber(action.number)
            is CalculatorAction.Decimal -> putDecimal()
            is CalculatorAction.Clear -> state = CalculatorState()
            is CalculatorAction.Operation -> putOperation(action.operation)
            is CalculatorAction.Calculate -> performCalculation()
        }
    }

    private fun performCalculation() {
        TODO("Not yet implemented")
    }

    private fun putOperation(operation: CalculatorOperation) {
        TODO("Not yet implemented")
    }

    private fun putDecimal() {
        TODO("Not yet implemented")
    }

    private fun putNumber(number: Int) {
        TODO("Not yet implemented")
    }
}