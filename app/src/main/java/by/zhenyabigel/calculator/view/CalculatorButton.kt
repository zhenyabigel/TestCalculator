package by.zhenyabigel.calculator.view

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*

@Composable
fun CalculatorButton (
    symbol:String,
    textColor: Color = Color.White,
    modifier: Modifier,
    onClick:() -> Unit
){

    Box( contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RoundedCornerShape(11.dp))
            .clickable {onClick()}
            .then(modifier)
    ){
        Text(
            text = symbol,
            fontSize = 40.sp,
            color = textColor,
            fontWeight = FontWeight.W400
        )
    }
}