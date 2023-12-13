package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Chester()


        }
    }
}

@Composable
fun Chester(){
    LazyColumn(){
        item{
            Column(modifier=Modifier.fillMaxWidth().padding(10.dp)) {
                Box{
                    Image(painter = painterResource(id = R.drawable.schlogo),
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp),
                        contentDescription = null)
                    }
                }

            Spacer(modifier = Modifier.height(20.dp) )

            Row( modifier = Modifier.padding(start=20.dp, end=20.dp)){
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Yellow),
                    border = BorderStroke(1.dp, Color.White),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.book_icon ) ,
                        contentDescription = null)
                }

                Spacer(modifier = Modifier.width(30.dp))

                        Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Yellow),
                    border = BorderStroke(1.dp, Color.White),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.page_icon ) ,
                        contentDescription = null)
                }

                Spacer(modifier = Modifier.width(30.dp))

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Yellow),
                    border = BorderStroke(1.dp, Color.White),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.academics ) ,
                        contentDescription = null)
                }
            }

            Spacer(modifier = Modifier.height(5.dp) )

            Row(modifier = Modifier.padding(start=25.dp, end=20.dp)) {
                Text("School Info",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Black)

                Spacer(modifier = Modifier.width(50.dp))

                Text("Student Info",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Black)

                Spacer(modifier = Modifier.width(53.dp))

                Text("Academics",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Black)
            }

            Spacer(modifier = Modifier.height(20.dp) )

            Row( modifier = Modifier.padding(start=20.dp, end=20.dp)){
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Yellow),
                    border = BorderStroke(1.dp, Color.White),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.attendance ) ,
                        contentDescription = null)
                }

                Spacer(modifier = Modifier.width(30.dp))

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Yellow),
                    border = BorderStroke(1.dp, Color.White),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.activity_icon ) ,
                        contentDescription = null)
                }

                Spacer(modifier = Modifier.width(30.dp))

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Yellow),
                    border = BorderStroke(1.dp, Color.White),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.bus ) ,
                        contentDescription = null)
                }
            }

            Spacer(modifier = Modifier.height(5.dp) )

            Row(modifier = Modifier.padding(start=23.dp, end=20.dp)) {
                Text("Attendance",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Black)

                Spacer(modifier = Modifier.width(60.dp))

                Text("Activities",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Black)

                Spacer(modifier = Modifier.width(65.dp))

                Text("Transport",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Black)
            }

            Spacer(modifier = Modifier.height(20.dp) )

            Row( modifier = Modifier.padding(start=20.dp, end=20.dp)){
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Yellow),
                    border = BorderStroke(1.dp, Color.White),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.fees_icon ) ,
                        contentDescription = null)
                }

                Spacer(modifier = Modifier.width(30.dp))

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Yellow),
                    border = BorderStroke(1.dp, Color.White),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.shopping_icon ) ,
                        contentDescription = null)
                }

                Spacer(modifier = Modifier.width(30.dp))

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.Yellow),
                    border = BorderStroke(1.dp, Color.White),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.records_icon ) ,
                        contentDescription = null)
                }
            }


        }
    }

}



@Preview(showBackground = true)
@Composable
fun ChesterPreview(){
    Chester()
}
