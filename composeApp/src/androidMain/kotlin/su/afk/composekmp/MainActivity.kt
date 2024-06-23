package su.afk.composekmp

import App
import BatteryManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App(
                // remember что бы не создавать ссылку при каждой перекомпановки
                batteryManager = remember {
                    BatteryManager(applicationContext)
                }
            )
        }
    }
}
