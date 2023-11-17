package com.example.ucp2.ui.theme.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.ucp2.R

@Composable
fun FormatDataForm(
    namamhs: String,
    nim: String,
    konsentrasi: String,
    judul: String,
) {
    Text(
        text = stringResource(R.string.namamhs),
    )
    Text(namamhs)
    Divider()
    Spacer(modifier = Modifier.padding(8.dp))


    Text(
        text = stringResource(R.string.nim),
    )
    Text(nim)
    Divider()
    Spacer(modifier = Modifier.padding(10.dp))


    Text(
        text = stringResource(R.string.konsentrasi),
    )
    Text(konsentrasi)
    Divider()

    Text(
        text = stringResource(R.string.judul),
    )
    Text(judul)
    Divider()
}