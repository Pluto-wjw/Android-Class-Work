package com.example.myapplicationww

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CreditCard(
    cardNumber: String,
    cardHolderName: String,
    cardExpiry:String
){
    Card(
        modifier = Modifier
            .height(height = 200.dp)
            .fillMaxWidth()
            .padding(all = 10.dp),
        elevation = CardDefaults.elevatedCardElevation()
    ) {
        Image(
            painter = painterResource(id = R.drawable.wemeet_image_20240604095634058),
            contentDescription = "Visa logo",
            modifier = Modifier
                .height(height = 38.dp)
                .padding(all = 6.dp),
            alignment = Alignment.TopStart)
        Text(
            modifier = Modifier.padding(start = 8.dp),
            text = "Credit card",
            style = MaterialTheme.typography.labelSmall
        )
        Image(
            painter = painterResource(id = R.drawable.wemeet_image_20240604095623639),
            contentDescription = "Visa logo",
            modifier = Modifier
                .height(height = 50.dp)
                .padding(all = 6.dp),
            alignment = Alignment.TopStart
        )
        Text(
            modifier = Modifier
                .padding(start = 10.dp)
                .fillMaxWidth(),
            text = cardNumber,
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            modifier = Modifier
                .padding(end = 10.dp)
                .fillMaxWidth(),
            text = "Expiry Date:$cardExpiry",
            textAlign = TextAlign.End,
            style = MaterialTheme.typography.labelSmall,
        )
        Text(
            modifier = Modifier
                .padding(start = 10.dp),
            text = cardHolderName,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.SemiBold
        )
    }
}
@Preview
@Composable
fun CreditCardPreview(){
    CreditCard(
        cardExpiry = "2026-04-14",
        cardHolderName = "Test User",
        cardNumber = "XXXX-XXXX-XXXX-XXXX"
    )
}