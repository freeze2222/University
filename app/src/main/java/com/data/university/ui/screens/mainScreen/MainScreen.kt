package com.data.university.ui.screens.mainScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.data.university.R
import com.data.university.ui.composable.Ball
import com.data.university.ui.composable.EventCard
import com.data.university.ui.theme.Grey
import com.data.university.ui.theme.Grey2
import com.data.university.ui.theme.Red
import com.data.university.utils.EventData

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = {
                    //TODO nav
                }) {
                    Icon(
                        painter = painterResource(R.drawable.image3),
                        contentDescription = null,
                        modifier = Modifier
                            .width(47.dp)
                            .height(57.dp),
                        tint = Red
                    )
                }
                Spacer(Modifier.width(50.dp))
                Text(
                    "Fırat Üniversitesi",
                    color = Red,
                    fontSize = 30.sp,
                    fontFamily = FontFamily(Font(R.font.lato_bold))
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 40.dp, end = 20.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Ball(painterResource(R.drawable.image7))
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Yemekhane",
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.lato_bold)),
                            color = Grey,
                            textAlign = TextAlign.Center
                        )
                    }
                    Spacer(Modifier.width(20.dp))
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Ball(painterResource(R.drawable.image6))
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Bakiye Yükle",
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.lato_bold)),
                            color = Grey,
                            textAlign = TextAlign.Center
                        )
                    }
                    Spacer(Modifier.width(20.dp))
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Ball(painterResource(R.drawable.image8))
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Ders Programı",
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.lato_bold)),
                            color = Grey,
                            textAlign = TextAlign.Center
                        )
                    }
                    Modifier.width(20.dp)
                }
                Spacer(modifier = Modifier.height(30.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Ball(painterResource(R.drawable.image10))
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Takvim",
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.lato_bold)),
                            color = Grey,
                            textAlign = TextAlign.Center
                        )
                    }
                    Spacer(Modifier.width(20.dp))
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Ball(painterResource(R.drawable.image5))
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Akademisyenler",
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.lato_bold)),
                            color = Grey,
                            textAlign = TextAlign.Center
                        )
                    }
                    Spacer(Modifier.width(20.dp))
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Ball(painterResource(R.drawable.image9))
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "İletişim",
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.lato_bold)),
                            color = Grey,
                            textAlign = TextAlign.Center
                        )
                    }
                    Spacer(Modifier.width(20.dp))
                }
                Spacer(modifier = Modifier.height(60.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "DUYURULAR",
                        fontFamily = FontFamily(Font(R.font.lato_bold)),
                        fontSize = 22.sp,
                        color = Grey
                    )
                    Spacer(modifier = Modifier.width(70.dp))
                    Column {
                        Text(
                            "Tümünü Göster",
                            fontFamily = FontFamily(Font(R.font.lato_bold)),
                            fontSize = 15.sp,
                            color = Grey2
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Image(
                            painter = painterResource(R.drawable.image11),
                            contentDescription = null,
                            modifier = Modifier
                                .width(100.dp)
                                .height(2.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                val data = listOf(
                    EventData(
                        R.drawable.image13,
                        "18.01.2022",
                        "2022 TÜBA Uluslararası \n" + "Akademi Ödülleri Çağrısı"
                    ), EventData(
                        R.drawable.image13,
                        "18.01.2022",
                        "2022 TÜBA Uluslararası \n" + "Akademi Ödülleri Çağrısı"
                    )
                )
                LazyRow {
                    items(data) { value ->
                        EventCard(value)
                        Spacer(modifier = Modifier.width(20.dp))
                    }
                }
                Spacer(modifier = Modifier.height(60.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "HABERLER",
                        fontFamily = FontFamily(Font(R.font.lato_bold)),
                        fontSize = 22.sp,
                        color = Grey
                    )
                    Spacer(modifier = Modifier.width(92.dp))
                    Column {
                        Text(
                            "Tümünü Göster",
                            fontFamily = FontFamily(Font(R.font.lato_bold)),
                            fontSize = 15.sp,
                            color = Grey2
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Image(
                            painter = painterResource(R.drawable.image11),
                            contentDescription = null,
                            modifier = Modifier
                                .width(100.dp)
                                .height(2.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                LazyRow {
                    items(data) { value ->
                        EventCard(value)
                        Spacer(modifier = Modifier.width(20.dp))
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun MainPreview() {
    MainScreen()
}