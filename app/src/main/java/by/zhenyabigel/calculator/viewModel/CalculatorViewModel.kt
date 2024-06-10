package by.zhenyabigel.calculator

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {
    var state by mutableStateOf(CalculatorState())
        private set
}