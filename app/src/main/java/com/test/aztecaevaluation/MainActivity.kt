package com.test.aztecaevaluation

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.test.aztecaevaluation.data.models.Show
import com.test.aztecaevaluation.presentation.DetailsRegister
import com.test.aztecaevaluation.ui.theme.AztecaEvaluationTheme

class MainActivity : ComponentActivity() {

    private val viewModel = DetailsRegister().provide()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AztecaEvaluationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ShowList(
                        viewModel.data.value,
                        modifier = Modifier.padding(innerPadding),
                        onClick = { })
                    Log.i(Companion.TAG, "onCreate: created")

                }
            }
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AztecaEvaluationTheme {
        Greeting("Android")
    }
}


@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun ShowList(shows: List<Show>, modifier: Modifier = Modifier, onClick: () -> Unit) {
    val context = LocalContext.current
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        items(items = shows) { item ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp)
                    .clickable {
//                        onClick()
                        Toast.makeText(context, "Work in progress...!", Toast.LENGTH_SHORT).show()
                    },

                elevation = CardDefaults.cardElevation(6.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Row(
                    modifier = Modifier.padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Espacio para Glide
                    GlideImage(
                        model = item.image?.medium,
                        contentDescription = "Imagen de ${item.name}",
                        modifier = Modifier
                            .size(80.dp)
                            .clip(RoundedCornerShape(6.dp)),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(24.dp))

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                    ) {
                        Text(
                            text = item.name ?: "Movie Name Not Found",
                            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold), // El Título
                            color = Color.Black
                        )

                        Divider(modifier = Modifier.padding(top = 8.dp))

                        Text(
                            text = item.summary ?: "Movie Description Not Found",
                            style = MaterialTheme.typography.bodySmall, // La Descripción
                            maxLines = 2,
                            color = Color.Blue

                        )

                    }
                }
            }
        }
    }
}