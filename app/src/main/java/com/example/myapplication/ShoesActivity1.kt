package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class EveActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Alien()

        }
    }
}

@Composable
fun Alien(){

    LazyColumn(){
        item {
            Column(modifier = Modifier.fillMaxWidth()) {

                Box(modifier = Modifier.fillMaxSize() ){
                    Image(painter = painterResource(id = R.drawable.airjordan ),
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.fillMaxWidth(),
                        contentDescription = null)
                }
            }

            Spacer(modifier = Modifier.height(10.dp) )

            Column(modifier = Modifier
                .fillMaxSize()
                .background(brush = Brush.horizontalGradient(listOf(Color.Blue, Color.Green, Color.Cyan))),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center)
            {
                Text("Leap to Comfort",
                    fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 40.sp,
                    color = Color(0xff2A8922),
                    textAlign = TextAlign.Center)

                Spacer(modifier = Modifier.height(5.dp) )

                Text("With Comfort",
                    fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 40.sp,
                    color = Color.Blue,
                    textAlign = TextAlign.Center)

                Spacer(modifier = Modifier.height(15.dp) )

                Text("Get 20% off your first purchase!!!",
                    fontFamily = androidx.compose.ui.text.font.FontFamily.SansSerif,
                    fontWeight = FontWeight.Light,
                    color = Color.Magenta,
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp)
            }

            Spacer(modifier = Modifier.height(40.dp) )

            val jk = LocalContext.current

            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally){
                Button(onClick = { jk.startActivity(Intent(jk, MainActivity2::class.java)) },
                    colors = ButtonDefaults.buttonColors(Color.White),
                    border = BorderStroke(1.dp, Color.Cyan),
                    shape = AbsoluteRoundedCornerShape(5.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.arrowicon) ,
                        contentDescription = null )
                    Text("Explore",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)

                }

            }

           // val uu = AnnotatedString("Open Login")
          //  val ii = LocalContext.current

          //  ClickableText(text = uu, onClick = {

           //     ii.startActivity(Intent(ii, EveActivity2::class.java))

         //   } )

           




        }
    }



}










@Preview(showBackground = true)
@Composable
fun AlienPreview(){
    Alien()
}
