package com.laioffer.spotify

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.laioffer.spotify.ui.theme.SpotifyTheme

// customized extend AppCompatActivity
class MainActivity : AppCompatActivity() {
    private val TAG = "lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "We are at onCreate()")
        setContent {
            SpotifyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "We are at onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "We are at onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "We are at onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "We are at onStop()")
    }

    override fun onDestroy() {
        Log.d(TAG, "We are at onDestroy()")
        super.onDestroy()
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true, widthDp = 412, heightDp = 732)
@Composable
fun DefaultPreview() {
    SpotifyTheme {
        Surface {
            Greeting("Android")
        }
    }
}