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
            is CalculatorAction.Clear -> performDeletion()
            is CalculatorAction.Operation -> putOperation(action.operation)
            is CalculatorAction.Calculate -> performCalculation()
            is CalculatorAction.ChangeOfSing -> performChangeOfSing()
            is CalculatorAction.Percent -> convertToPercentage()
        }
    }

    private fun convertToPercentage() {
        if(state.operation == null){
            state = state.copy(
                firstNumber = (state.firstNumber.toDoubleOrNull()?.div(100)).toString()
            )
            return
        }
        state = state.copy(
            secondNumber = (state.secondNumber.toDoubleOrNull()?.div(100)).toString()
        )
    }

    private fun performChangeOfSing() {
        if(state.operation == null){
            state = if (state.firstNumber.contains("-")) {
                state.copy(firstNumber = state.firstNumber.removePrefix("-"))
            } else{
                state.copy(
                    firstNumber = "-"+ state.firstNumber
                )
            }
            return
        }
        state = if (state.secondNumber.contains("-")) {
            state.copy(secondNumber = state.secondNumber.removePrefix("-"))
        } else{
            state.copy(
                secondNumber = "-"+ state.secondNumber
            )
        }

    }

    private fun performDeletion() {
        if (state.isClearBtn){

            when{
                state.secondNumber.isNotBlank() -> state = state.copy(
                    secondNumber = ""
                )
                state.operation != null -> state = state.copy(
                    operation = null
                )
                state.firstNumber.isNotBlank() -> state = state.copy(
                    firstNumber = ""
                )
            }

            state = state.copy(isClearBtn = false)
            return
        }
        else {
            state = CalculatorState()
        }

    }

    private fun performCalculation() {
        state = state.copy(isClearBtn = false)

        val firstNumber = state.firstNumber.toDoubleOrNull()
        val secondNumber = state.secondNumber.toDoubleOrNull()
        if(firstNumber != null && secondNumber!= null){
            val result = when(state.operation){
                is CalculatorOperation.Add -> firstNumber + secondNumber
                is CalculatorOperation.Divide -> firstNumber / secondNumber
                is CalculatorOperation.Subtraction -> firstNumber - secondNumber
                is CalculatorOperation.Multiply -> firstNumber * secondNumber
                null -> return
            }
            state = state.copy(
                result = result.toString().take(15)
            )
        }

    }

    private fun  putOperation(operation: CalculatorOperation) {
        if(state.result.isNotBlank()){
            state = state.copy(
                firstNumber = state.result,
                result = "",
                secondNumber = ""
            )
        }
        if(state.firstNumber.isNotBlank()){
            state = state.copy(operation = operation)
        }
    }

    private fun putDecimal() {
        state = state.copy(isClearBtn = true)
        if(state.operation == null && !state.firstNumber.contains(".")
            && state.firstNumber.isNotBlank()
            ) {
            state = state.copy(firstNumber = state.firstNumber +".")
            return
        }
        if(!state.firstNumber.contains(".") && state.secondNumber.isNotBlank()) {
            state = state.copy(
                firstNumber = state.secondNumber +"."
            )
        }

    }


    private fun putNumber(number: Int) {
        state = state.copy(isClearBtn = true)
        if(state.operation == null){
            if (state.firstNumber.length >= MAX_NUM_LENGTH){
                return
            }
            state = state.copy(
                firstNumber = state.firstNumber + number
            )
            return
        }
        if (state.secondNumber.length >= MAX_NUM_LENGTH){
            return
        }

        state = state.copy(
            secondNumber = state.secondNumber + number
        )
    }
    companion object{
        private const val MAX_NUM_LENGTH = 8
    }
}