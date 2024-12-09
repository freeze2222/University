package com.data.university.ui.screens.onBoardingScreen

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.data.university.R
import com.data.university.ui.theme.Grey
import com.data.university.ui.theme.Red
import com.data.university.utils.NavDestinations

@Composable
fun OnBoardingScreen(navController: NavHostController, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.Start
    ) {
        Image(
            painter = painterResource(R.drawable.image),
            contentDescription = null,
            modifier = Modifier
                .height(417.dp)
                .width(375.dp)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .background(Red)
                .padding(top = 30.dp), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Fırat Üniversitesi \n" + "Mobil Uygulamasına \n" + "Hoşgeldiniz!",
                fontFamily = FontFamily(Font(R.font.lato_bold)),
                fontSize = 34.sp,
                color = Color.White,
                lineHeight = 40.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(40.dp))
            Text(
                "Lorem ipsum dolor sit amet, consec\n" + "tetur adipiscing elit.",
                fontFamily = FontFamily(Font(R.font.lato_regular)),
                fontSize = 18.sp,
                lineHeight = 20.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(70.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(modifier = Modifier
                    .width(132.dp)
                    .height(54.dp)
                    .shadow(15.dp),
                    shape = RoundedCornerShape(
                        topStart = 30.dp, bottomStart = 30.dp, bottomEnd = 30.dp, topEnd = 0.dp
                    ),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    onClick = {
                        navController.navigate(NavDestinations.MAIN.name)
                    }) {
                    Text(
                        "Keşfet",
                        fontSize = 27.sp,
                        fontFamily = FontFamily(Font(R.font.lato_bold)),
                        color = Grey
                    )
                }
                Spacer(modifier = Modifier.width(80.dp))
                Image(
                    painter = painterResource(R.drawable.image2),
                    contentDescription = null,
                    modifier = Modifier
                        .width(70.dp)
                        .height(10.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun OnBoardingScreenPreview() {
    OnBoardingScreen(rememberNavController())
}