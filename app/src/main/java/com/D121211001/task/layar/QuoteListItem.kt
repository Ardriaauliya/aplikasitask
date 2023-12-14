package com.D121211001.task.layar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun QuoteListItem() {
    Card(
        elevation = 4.dp,
        modifier = Modifier
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Image(
                imageVector = Icons.Default.FormatQuote,
                contentDescription = "Quote",
                modifier = Modifier
                    .size(48.dp)
                    .background(Color.Black)
                    .padding(4.dp)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Column(modifier = Modifier.weight(1F)) {
                Text(
                    text = "Time is the most valuable thing a man can spend.",
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                )
                Box(
                    modifier = Modifier
                        .background(Color(0xFEEEEEE))
                        .fillMaxWidth(0.4f)
                        .height(1.dp)
                )
                Text(
                    text = "Theophrastus",
                    style = MaterialTheme.typography.body2,
                    fontWeight = FontWeight.Thin,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun QuoteDetail() {
    // Detail implementation, if needed
}
