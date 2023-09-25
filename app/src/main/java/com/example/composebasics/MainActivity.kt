package com.example.composebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composebasics.ui.GymsScreen
import com.example.composebasics.ui.theme.GymsAroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GymsAroundTheme {
                GymsScreen()
            }
        }

    }
}
/**
 *                                     Compose Basics
 *
 *
//@Preview(showBackground = true)
//@Composable
//fun MyText() {
//    Text(
//        text = "Elephant can sense storms",
//        style = TextStyle(
//            color = Color.Red,
//            fontSize = 24.sp,
//            fontStyle = FontStyle.Italic,
//            fontFamily = FontFamily.SansSerif,
//            textAlign = TextAlign.Center
//        ),
//        maxLines = 2
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun MyButton() {
//    var isEnabled by remember { mutableStateOf(true) }
//    Button(
//        onClick = { isEnabled = false },
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Black,
//            contentColor = Color.White,
//            disabledContainerColor = Color.LightGray
//        ),
//        enabled = isEnabled
//    ) {
//        Text(text = if (isEnabled) "Click Me" else "I'm disabled!")
//    }
//}
//
//@Preview(showBackground = true)
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun MyTextField() {
//    var emailAddress by remember { mutableStateOf("") }
//    TextField(
//        value = emailAddress,
//        onValueChange = {
//            emailAddress = it
//        }, label = {
//            "Email Address"
//        }
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun MyImage() {
//    Image(
//        painter = painterResource(id = R.drawable.jetpack_compose_icon),
//        contentDescription = "Jetpack Compose Drawable"
//    )
//}

 */