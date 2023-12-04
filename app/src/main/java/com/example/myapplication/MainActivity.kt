package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.ModifierLocal
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()


        }



    }
}

@Composable
fun Text() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top) {
        Text("Hello World",
            fontSize = 30.sp,
            color = Color.Blue,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline)

        Spacer(modifier = Modifier.height(20.dp))

        val uu = AnnotatedString("Open Login")
    val ii = LocalContext.current

    ClickableText(text = uu, onClick = {

        ii.startActivity(Intent(ii, EveActivity2::class.java))

    } )


        Text("Welcome to Android",
            fontSize = 25.sp,
            color = Color.Red,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(40.dp))

        Text("Evelyne",
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Right,
            color = Color.Black,
            fontSize = 50.sp,
            modifier = Modifier.padding(start = 30.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Divider()

        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Text("Text 1",
                fontSize = 50.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Red)

            Spacer(modifier = Modifier.width(50.dp))

            androidx.compose.material3.Text(text = "Text 2",
                fontSize = 50.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Blue)
        }

        Spacer(modifier = Modifier.height(30.dp))

       Row(modifier = Modifier.padding(start = 20.dp)) {
           Button(onClick = { /*TODO*/ },
               shape = RectangleShape,
               colors = ButtonDefaults.buttonColors(Color.Black)) {
               Text(text = "Next",
                   fontSize = 20.sp)
           }
           Spacer(modifier = Modifier.width(20.dp))

           Button(onClick = { /*TODO*/ },
               colors = ButtonDefaults.buttonColors(Color.Blue),
               shape = RoundedCornerShape(5.dp)
           ) {
               Text(text = "Home",
                   fontSize = 20.sp)
           }

           Spacer(modifier = Modifier.width(20.dp))

           Button(onClick = { /*TODO*/ },
               shape = RoundedCornerShape(5.dp),
               border = BorderStroke(width = 2.dp, Color.Red)
           ) {
               Text("Form",
                   fontSize = 20.sp,
                   color = Color.Cyan)
           }



       }
        Image(painterResource(id = R.drawable.button),
            contentDescription = "mushrooms" )

        Spacer(modifier = Modifier.height(20.dp) )

        Image(painterResource(id = R.drawable.chai),
            contentDescription = "Chai image",
            modifier = Modifier.size(90.dp))

        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan))
        {
                Image(painterResource(id =R.drawable.carticon ),
                    contentDescription = null )
           Text( "Add to cart",
               fontSize = 20.sp,
               modifier = Modifier.padding(start = 10.dp),
               color = Color.Black)
        }

        Spacer(modifier = Modifier.height(20.dp))

        val jj = LocalContext.current

        Button(onClick = {
                         jj.startActivity(Intent(jj, EveActivity::class.java))
                         },
            shape = RectangleShape,
            border = BorderStroke(2.dp, color = Color.Red),
            colors = ButtonDefaults.buttonColors(Color.White))
        {
            Image(painterResource(id = R.drawable.signupicon ),
                    contentDescription = null )
            Text(text = "Sign up",
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 5.dp),
                color = Color.Black)
        }



    }
}

@Preview(showBackground = true)
@Composable
fun TextPreview(){
    Text()
}
