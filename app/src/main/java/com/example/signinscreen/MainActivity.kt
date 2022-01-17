package com.example.signinscreen

import android.R.attr.label
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.signinscreen.ui.theme.SigninscreenTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Simplebluesigninform()
        }
    }
}

var userName = mutableStateOf("")
var userPass = mutableStateOf("")


@Composable
fun Mysignin() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
    ) {

        Box(
            modifier = Modifier
                .fillMaxHeight(0.91f)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.myimage1),
                contentDescription = "The Background",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize(),
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 1f
                        )
                    )
            )

            Column(
                modifier = Modifier.padding(30.dp)
            ) {
                Text(
                    text = "Sign in",
                    fontSize = MaterialTheme.typography.h1.fontSize,
                    color = Color.White,
                )

                OutlinedTextField(
                    value = userName.value, onValueChange = {
                        userName.value = it
                    },
                    modifier = Modifier
                        .padding(top = 0.dp)
                        .fillMaxWidth()
                        .background(Color.White.copy(alpha = 0.0f)),
                    label = {Text("Username")},
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.White,
                        unfocusedBorderColor = Color.Green,
                        textColor = Color.White,
                        focusedLabelColor = Color.White,
                        unfocusedLabelColor = Color.White,)
                )
                OutlinedTextField(
                    value = userPass.value,
                    onValueChange = {
                        userPass.value = it
                    },
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .fillMaxWidth()
                        .background(Color.White.copy(alpha = 0.0f)),
                            label = {Text("Password")},
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.White,
                        unfocusedBorderColor = Color.Green,
                        textColor = Color.White,
                        focusedLabelColor = Color.White,
                        unfocusedLabelColor = Color.White, )
                )
            }

        }
        Button(
            onClick = { }, shape = RoundedCornerShape(0.dp), modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color(0xFF60269e))
        ) {
            Text(text = "Submit")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SigninscreenTheme {
        Mysignin()
    }
}