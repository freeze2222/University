package com.data.university.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.data.university.R
import com.data.university.ui.theme.Red
import com.data.university.utils.EventData

@Composable
fun EventCard(data: EventData, modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .height(108.dp)
            .width(258.dp)
            .clip(RoundedCornerShape(20.dp))
            .paint(painterResource(data.backgroundImage), contentScale = ContentScale.FillBounds)
            .paint(painterResource(R.drawable.image12), contentScale = ContentScale.FillBounds)
            .padding(10.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.End) {
            Text(
                data.title,
                color = Color.White,
                fontFamily = FontFamily(Font(R.font.lato_bold)),
                fontSize = 19.sp
            )
            Spacer(modifier = Modifier.height(20.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                IconButton(
                    onClick = {}, modifier = Modifier
                        .offset(x = -7.dp)
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                ) {
                    Icon(
                        contentDescription = null,
                        modifier = Modifier.size(35.dp),
                        painter = painterResource(R.drawable.image14),
                        tint = Red
                    )
                }
                Spacer(modifier = Modifier.width(127.dp))
                Text(
                    data.date,
                    color = Color.White,
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.lato_bold))
                )
            }
        }
    }
}

@Preview
@Composable
private fun CardPreview() {
    EventCard(
        EventData(
            R.drawable.image13,
            "18.01.2022",
            "2022 TÜBA Uluslararası \n" + "Akademi Ödülleri Çağrısı"
        )
    )
}