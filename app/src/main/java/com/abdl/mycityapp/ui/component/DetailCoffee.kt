package com.abdl.mycityapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccessTime
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abdl.mycityapp.R
import com.abdl.mycityapp.data.CoffeeShop

@Composable
fun DetailCoffee(detailCoffeeShop: CoffeeShop, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = detailCoffeeShop.imageResId),
                contentDescription = detailCoffeeShop.titleResId.toString(),
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .padding(8.dp)
                    .clip(MaterialTheme.shapes.small)
            )
            Text(
                text = stringResource(id = detailCoffeeShop.titleResId),
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(vertical = 24.dp)
            )
            CoffeeSpec(
                painter = rememberVectorPainter(image = Icons.Rounded.LocationOn),
                text = stringResource(id = detailCoffeeShop.addressResId)
            )
            Spacer(modifier = Modifier.height(8.dp))
            CoffeeSpec(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = R.drawable.ig),
                text = stringResource(id = detailCoffeeShop.instagramResId)
            )
            Spacer(modifier = Modifier.height(8.dp))
            CoffeeSpec(
                modifier = Modifier.size(24.dp),
                painter = rememberVectorPainter(image = Icons.Rounded.AccessTime),
                text = stringResource(id = detailCoffeeShop.operationalHoursResId)
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
fun DetailCoffeePreview() {
    DetailCoffee(
        detailCoffeeShop = CoffeeShop(
            titleResId = R.string.judul_onedis_coffee,
            addressResId = R.string.alamat_onedis_coffee,
            instagramResId = R.string.instagram_onedis_coffee,
            operationalHoursResId = R.string.jam_operasional_onedis_coffee,
            imageResId = R.drawable.onedis
        )
    )
}