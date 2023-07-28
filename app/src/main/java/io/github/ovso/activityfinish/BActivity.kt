package io.github.ovso.activityfinish

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import io.github.ovso.activityfinish.ui.theme.ActivityFinishTheme
import kotlin.system.exitProcess

class BActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActivityFinishTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column {
                        Text(text = "B 화면")
                        Button(
                            onClick = {
//                                exitProcess(0)
//                                finishAffinity()
//                                exitProcess(0)
//                                Runtime.getRuntime().exit(0)
                                android.os.Process.killProcess(android.os.Process.myPid())
                            }
                        ) {
                            Text(text = "앱 종료")
                        }
                    }
                }
            }
        }
    }
}
