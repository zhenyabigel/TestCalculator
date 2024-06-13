package by.zhenyabigel.calculator.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import by.zhenyabigel.calculator.model.CalculatorAction
import by.zhenyabigel.calculator.model.CalculatorOperation
import by.zhenyabigel.calculator.model.CalculatorState
import by.zhenyabigel.calculator.ui.theme.LightGray
import by.zhenyabigel.calculator.ui.theme.LightGreen
import by.zhenyabigel.calculator.ui.theme.LightRed

@Composable
fun Calculator (
    state: CalculatorState,
    buttonSpacing: Dp,
    modifier: Modifier = Modifier,
    onAction: (CalculatorAction) -> Unit
){
    Box (modifier = modifier){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(text = state.firstNumber + " " + (state.operation?.symbol ?: "") +" " + state.secondNumber,
                textAlign = TextAlign.End,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp),
                fontSize = 60.sp,
                fontWeight = FontWeight.W300,
                maxLines = 1)

            Text(text = state.result,
                textAlign = TextAlign.End,
                color = LightGray,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 36.dp),
                fontSize = 60.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1)
            Divider(color = LightGray, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)){
                CalculatorButton(
                    symbol = if (!state.isClearBtn) "AC" else "C",
                    textColor = Color.Black,
                    modifier = Modifier
                        .background(LightRed)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Clear)
                    })
                CalculatorButton(
                    symbol = "+/-",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.ChangeOfSing)
                    })
                CalculatorButton(
                    symbol = "%",
                    textColor = LightGreen,
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Percent)

                    })
                CalculatorButton(
                    symbol = "÷",
                    textColor = LightGreen,
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                    })
            }

            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)){
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(7))
                    })
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(8))
                    })
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(9))
                    })
                CalculatorButton(
                    symbol = "×",
                    textColor = LightGreen,
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                    })
            }

            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)){
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(4))
                    })
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(5))
                    })
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(6))
                    })
                CalculatorButton(
                    symbol = "−",
                    textColor = LightGreen,
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Subtraction))
                    })
            }

            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)){
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(1))
                    })
                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(2))
                    })
                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(3))
                    })
                CalculatorButton(
                    symbol = "+",
                    textColor = LightGreen,
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                    })
            }

            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)){
                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(0))
                    })
                CalculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    })
                CalculatorButton(
                    symbol = "=",
                    textColor = Color.Black,
                    modifier = Modifier
                        .background(LightGreen)
                        .aspectRatio(2f)
                        .weight(2f)
                        .padding(end = 20.dp),
                    onClick = {
                        onAction(CalculatorAction.Calculate)
                    })
            }


        }

    }
}