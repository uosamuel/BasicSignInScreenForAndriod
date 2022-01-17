package com.example.signinscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.signinscreen.ui.theme.SigninscreenTheme

class anothersignin : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Simplebluesigninform()
        }
    }
}

var theusername = mutableStateOf("")
var theuserpass = mutableStateOf("")


@Composable
fun Simplebluesigninform() {
    val txt = remember { mutableStateOf(0)}
    val txtony = remember { mutableStateOf(0)}

    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.spacedBy(10.dp),
    horizontalAlignment = Alignment.CenterHorizontally) {


        Row(modifier = Modifier.fillMaxWidth().padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {

            Text(text = "Login",
                color = Color.Blue,
                fontSize = MaterialTheme.typography.h5.fontSize,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier
                .clickable(enabled = true, role = Role.Button
                ){
                    txt.value += 1
                }
                )
        }

        Row(modifier = Modifier.fillMaxWidth().padding(40.dp),
            horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Sign in", color = Color(0xFF022FB9),
                fontSize = MaterialTheme.typography.h1.fontSize,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif
        )
        }



        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight().clip(RoundedCornerShape(topStart = 90.dp, topEnd = 90.dp))
            .background(
                Brush.verticalGradient(
                colors = listOf(
                    Color(0xFF022FB9),
                    Color(0xFF34017C),
                ), startY = 0.5f
            ))
        ) {

            Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(50.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
            ) {

                Box() {

                    Column(verticalArrangement = Arrangement.spacedBy(0.5.dp)) {

                        OutlinedTextField(
                            value = theusername.value,
                            onValueChange = {
                                theusername.value = it
                            }, modifier = Modifier.fillMaxWidth().padding(10.dp).background(Color.Blue.copy(alpha = 0.0f)).clip(RoundedCornerShape(5.dp)),
                            label = { Text(text = "enter your username") },
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                textColor = Color.White,
                                focusedBorderColor = Color.White,
                                errorBorderColor = Color.Red,
                                unfocusedBorderColor = Color.LightGray,
                                focusedLabelColor = Color.White,
                                errorLabelColor = Color.Red,
                                unfocusedLabelColor = Color.LightGray,
                            )
                        )

                        OutlinedTextField(
                            value = theuserpass.value,
                            onValueChange = {
                                theuserpass.value = it
                            }, modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp)
                                .clip(RoundedCornerShape(5.dp))
                                .background(Color.Blue.copy(alpha = 0.0f)),
                            label = { Text(text = "enter your password") },
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                textColor = Color.White,
                                focusedBorderColor = Color.White,
                                errorBorderColor = Color.Red,
                                unfocusedBorderColor = Color.LightGray,
                                focusedLabelColor = Color.White,
                                errorLabelColor = Color.Red,
                                unfocusedLabelColor = Color.LightGray,
                            )
                        )

                        Button(
                            onClick = { /*TODO*/ }, shape = RoundedCornerShape(10.dp), modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            colors= ButtonDefaults.buttonColors(Color.White),
                            border = BorderStroke(color = Color.Gray, width = 1.dp)
                        ) {
                            Text(text = "Sign in", color = Color.Blue)
                        }

                    }

                }

                Text(text = "Forgot Password?", color = Color.White, modifier = Modifier
                    .clickable(
                        enabled = true,
                        role = Role.Button
                    ){
                        txtony.value += 1
                    })
            }

        }

    }

}



@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    Simplebluesigninform()
}