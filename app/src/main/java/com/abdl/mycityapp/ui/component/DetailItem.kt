package com.abdl.mycityapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abdl.mycityapp.R
import com.abdl.mycityapp.data.ListItemData
import com.abdl.mycityapp.data.Restoran

@Composable
fun DetailItem(detail: ListItemData, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.weight(0.9f),
        ) {
            Image(
                painter = painterResource(id = detail.imageResId),
                contentDescription = detail.titleResId.toString(),
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
            )
            Text(
                text = stringResource(id = detail.titleResId),
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Divider(
                modifier = Modifier.padding(vertical = 4.dp),
                thickness = 2.dp,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.2f)
            )
            Text(
                text = stringResource(id = detail.descriptionResId!!),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(horizontal = 16.dp),
                textAlign = TextAlign.Justify
            )
        }
        Column(
            modifier = Modifier.weight(0.1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {  }, modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp), shape = RoundedCornerShape(4.dp)) {
                Column {
                    Text(text = "Direction")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailItemPreview() {
    DetailItem(
        detail = Restoran(
            titleResId = R.string.restoran4_nama,
            descriptionResId = R.string.restoran4_deskripsi,
            imageResId = R.drawable.restoran4
        )
    )
}