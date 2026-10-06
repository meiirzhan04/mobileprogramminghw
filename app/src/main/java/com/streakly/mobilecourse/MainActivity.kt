package com.streakly.mobilecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.streakly.mobilecourse.ui.theme.MobileCourseTheme
import com.streakly.mobilecourse.ui.theme.TaskTwoScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MobileCourseTheme {
                /*HomeScreen()*/
                TaskTwoScreen()
            }
        }
    }
}
