package com.example.finalscreenshottaskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.finalscreenshottaskmanager.ui.theme.FinalScreenshotTaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinalScreenshotTaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FinalScreenshotTaskManagerApp()
                }
            }
        }
    }
}

@Composable
fun AllTasksDonePage(
    image: Painter,
    statusText: String,
    congrats: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = statusText,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = congrats,
            fontSize = 16.sp
        )
    }
}


@Composable
fun FinalScreenshotTaskManagerApp(modifier: Modifier = Modifier) {
    AllTasksDonePage(
        image = painterResource(R.drawable.ic_task_completed),
        statusText = stringResource(R.string.all_tasks_completed),
        congrats = stringResource(R.string.nice_work),
        modifier
            .fillMaxSize()
    )
}

@Preview(showBackground = true)
@Composable
fun FinalScreenshotTaskManagerAppPreview() {
    FinalScreenshotTaskManagerApp()
}
