package io.github.ovso.activityfinish

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.addCallback
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import io.github.ovso.activityfinish.ui.theme.ActivityFinishTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        onBackPressedDispatcher.addCallback {
//            finish()
//        }
        setContent {
            ActivityFinishTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column {
                        Text(text = "메인 화면")
                        Button(onClick = {
                            startActivity(
                                Intent().setAction("A")
                            )
                        }) {
                            Text(text = "A 화면으로 이동")
                        }
                    }
                }
            }
        }
    }
}
