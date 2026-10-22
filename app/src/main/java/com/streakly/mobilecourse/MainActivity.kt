package com.streakly.mobilecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.streakly.mobilecourse.assignment3.ComposeArticle
import com.streakly.mobilecourse.assignment4.TipTime
import com.streakly.mobilecourse.assignment4.project.ArtSpace
import com.streakly.mobilecourse.assignment5.courses.domain.model.Topic
import com.streakly.mobilecourse.assignment5.courses.presentation.CourseScreen
import com.streakly.mobilecourse.assignment5.courses.presentation.TopicCard
import com.streakly.mobilecourse.ui.theme.MobileCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MobileCourseTheme {
                CourseScreen()
            }
        }
    }
}
