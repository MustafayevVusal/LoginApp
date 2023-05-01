package com.vusal.testlogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vusal.testlogin.ui.theme.TestloginTheme
import com.vusal.testlogin.views.Login
import com.vusal.testlogin.views.Register
import com.vusal.testlogin.views.SplashScreen
import com.vusal.testlogin.views.views

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestloginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = views.Splash) {
                        composable(route = views.Splash) {
                            SplashScreen(navController = navController)
                        }

                        composable(route = views.Login) {
                            Login(navController = navController)
                        }

                        composable(route = views.Register) {
                            Register(navController = navController)
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun Navigation() {

 }