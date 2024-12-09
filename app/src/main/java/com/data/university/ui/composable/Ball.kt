package com.data.university.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.data.university.R
import com.data.university.ui.theme.Red

@Composable
fun Ball(image: Painter) {
    Column(modifier = Modifier.size(100.dp)) {
        IconButton(modifier = Modifier
            .size(100.dp)
            .clip(CircleShape)
            .paint(
                painter = painterResource(R.drawable.image4),
                contentScale = ContentScale.FillBounds
            ),
            onClick = {
                //None
            }) {
            Icon(
                painter = image,
                modifier = Modifier.offset(x = 2.dp).size(40.dp),
                contentDescription = null,
                tint = Red
            )
        }
    }
}


@Preview
@Composable
private fun BallPreview() {
    Ball(painterResource(R.drawable.image7))
}