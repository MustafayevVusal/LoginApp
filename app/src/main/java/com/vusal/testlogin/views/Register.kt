package com.vusal.testlogin.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.vusal.testlogin.R
import com.vusal.testlogin.ui.theme.Shapes


@Composable
fun Register(navController: NavController) {

    Column (
        modifier = Modifier
            .background(Color.White)
            .padding(24.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = null,
                modifier = Modifier
                    .height(140.dp)
                    .width(150.dp)
            )
        }
//        Spacer(modifier = Modifier.padding(.dp))
        Row {
            Text(
                text = "Create an account",
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp,
                color = Color.Black
            )
//            Text(
//                text = "\uD83D\uDC4B",
//                style = TextStyle(fontSize = 24.sp),
//                modifier = Modifier.padding(end = 16.dp)
//            )
        }
        Text(
            text = "Connect with your friends today!",
            style = TextStyle(fontSize = 14.sp), color = Color.Gray
        )
        Spacer(modifier = Modifier.padding(20.dp))
        Text(
            text = "Email Address",
            style = TextStyle(fontSize = 14.sp), color = Color(0xFF00004D)
        )

        Spacer(modifier = Modifier.padding(2.dp))
        var email by remember { mutableStateOf("") }
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text(text = "Enter your email",) },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .clip(shape = RoundedCornerShape(5.dp))
                .background(color = Color(0xFFFFFFFF))
                .border(width = 2.dp, color = Color(0xFFC6C6C6))
        )
        //////////////////////////////////////////
        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            text = "Phone Number",
            style = TextStyle(fontSize = 14.sp), color = Color(0xFF00004D)
        )
//        Spacer(modifier = Modifier.padding(2.dp))
        var phoneNumber  by remember { mutableStateOf("") }
        OutlinedTextField(
            value = phoneNumber,
            onValueChange = { phoneNumber = it },
            label = { Text("+388")  },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Phone),
            modifier = Modifier
                .fillMaxWidth(1f)
                .height(52.dp)
                .clip(shape = RoundedCornerShape(5.dp))
                .background(color = Color(0xFFFFFFFF))
        )
        //////////////////////////////////////////
        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            text = "Password",
            style = TextStyle(fontSize = 14.sp), color = Color(0xFF00004D)
        )

        Spacer(modifier = Modifier.padding(2.dp))
        var password by remember { mutableStateOf("") }
        var passwordVisibility by remember { mutableStateOf(false) }
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text(text = "Please Enter Your Password") },
            trailingIcon = {
                IconButton(onClick = {
                    passwordVisibility = !passwordVisibility
                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_remove_red_eye_24),
                        contentDescription = null)}},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            singleLine = true,
            visualTransformation = if (passwordVisibility) VisualTransformation.None
            else PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth(1f)
                .height(53.dp)
                .clip(shape = RoundedCornerShape(5.dp))
                .background(color = Color(0xFFFFFFFF))
                .border(width = 2.dp, color = Color(0xFFC6C6C6))
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val isChecked = remember { mutableStateOf(false) }
            Checkbox(
                checked = true, onCheckedChange = {  },
                modifier = Modifier.clip(shape = Shapes.medium)
            )
            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    text = "Remember Me",
                    color = Color(0xFF000C14),
                    fontSize = 14.sp
                )
            }
            Spacer(modifier = Modifier.padding(18.dp))
            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    text = "Forgot Password",
                    color = Color(0xFFFB344F),
                    fontSize = 14.sp
                )
            }
        }
        Spacer(modifier = Modifier.padding(20.dp))
        Button(
            onClick = { /*TODO*/ }, modifier = Modifier
                .fillMaxWidth()
                .height(40.dp),
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color(0xFF351A96),
                contentColor = Color.White
            )
        ) {
            Text(
                text = "Login",
                fontSize = 17.sp
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                color = Color.Gray,
                thickness = 1.dp
            )
            Text(
                text = "Or With",
                modifier = Modifier.padding(10.dp),
                color = Color.Black
            )

            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                color = Color.Gray,
                thickness = 1.dp
            )
        }
        Spacer(modifier = Modifier.width(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                elevation = ButtonDefaults.elevation(defaultElevation = 0.dp),
                contentPadding = PaddingValues(horizontal = 26.dp, vertical = 5.dp)
            ) {
                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.github),
                        contentDescription = "Github Logo",
                        modifier = Modifier.size(20.dp),
                        tint = Color.Unspecified
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "GitHub",)
                }
            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                elevation = ButtonDefaults.elevation(defaultElevation = 0.dp),
                contentPadding = PaddingValues(horizontal = 26.dp, vertical = 5.dp)
            ) {
                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.gitlab),
                        contentDescription = "Gitlab Logo",
                        modifier = Modifier.size(20.dp),
                        tint = Color.Unspecified
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(text = "GitHub",)
                }
            }
        }
        Spacer(modifier = Modifier.padding(12.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Already have an account ?", fontSize = 14.sp)
            TextButton(onClick = { navController.navigate(views.Login) {
                popUpTo(views.Login) {
                    inclusive = true }}
            }) {
                Text(text = "Login", fontSize = 14.sp)
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun RegisterPreview() {
    Register(navController = rememberNavController())
}