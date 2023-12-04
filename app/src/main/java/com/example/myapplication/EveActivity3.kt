package com.example.myapplication

import android.content.ClipData
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class EveActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            sneakers()

        }
    }
}

@Composable
fun sneakers() {
    LazyColumn {
        item {
            Column(modifier = Modifier
                .fillMaxWidth()) {
                Box {
                    Image(painter = painterResource(id = R.drawable.airjordan),
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(400.dp),
                        contentDescription = null)
                }
            }

            Spacer(modifier = Modifier.height(10.dp) )

            Row(modifier = Modifier
                .padding(10.dp)
                .background(color = Color.White)){
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.LightGray),
                    border = BorderStroke(1.dp, Color.Blue),
                    shape = CircleShape
                ) {
                    Text("4.0",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)
                }

                Spacer(modifier = Modifier.width(10.dp))

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.LightGray),
                    border = BorderStroke(1.dp, Color.Blue),
                    shape = CircleShape
                ) {
                    Text("4.5",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)
                }

                Spacer(modifier = Modifier.width(10.dp))

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.LightGray),
                    border = BorderStroke(1.dp, Color.Blue),
                    shape = CircleShape
                ) {
                    Text("5.0",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)
                }

                Spacer(modifier = Modifier.width(10.dp))

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.LightGray),
                    border = BorderStroke(1.dp, Color.Blue),
                    shape = CircleShape
                ) {
                    Text("5.5",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)
                }

                Spacer(modifier = Modifier.width(10.dp))

                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.LightGray),
                    border = BorderStroke(1.dp, Color.Blue),
                    shape = CircleShape
                ) {
                    Text(
                        "6.0",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }

            }

            Spacer(modifier = Modifier.height(10.dp) )

            Row(modifier = Modifier
                .padding(10.dp)
                .background(color = Color.White)) {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.LightGray),
                    border = BorderStroke(1.dp, Color.Blue),
                    shape = CircleShape
                ) {
                    Text(
                        "6.5",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.LightGray),
                    border = BorderStroke(1.dp, Color.Blue),
                    shape = CircleShape
                ) {
                    Text(
                        "7.0",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.LightGray),
                    border = BorderStroke(1.dp, Color.Blue),
                    shape = CircleShape
                ) {
                    Text(
                        "7.5",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.LightGray),
                    border = BorderStroke(1.dp, Color.Blue),
                    shape = CircleShape
                ) {
                    Text(
                        "8.0",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.LightGray),
                    border = BorderStroke(1.dp, Color.Blue),
                    shape = CircleShape
                ) {
                    Text(
                        "8.5",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }

            }

            Spacer(modifier = Modifier.height(200.dp) )

            Column {
                Row(modifier = Modifier
                    .padding(10.dp)
                    .background(color = Color.Gray)) {
                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        border = BorderStroke(1.dp, Color.Transparent)
                    ) {
                        Image(painter = painterResource(id = R.drawable.menu_icon) ,
                            contentDescription = null)
                    }

                    Spacer(modifier = Modifier.width(100.dp) )

                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        border = BorderStroke(1.dp, Color.Transparent)
                    ) {
                        Image(painter = painterResource(id = R.drawable.home_icon) ,
                            contentDescription = null)
                    }

                }

            }
        }
    }

}



@Preview(showBackground = true)
@Composable
fun sneakersPreview() {
    sneakers()
}
