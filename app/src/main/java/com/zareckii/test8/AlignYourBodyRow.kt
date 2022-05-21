package com.zareckii.test8

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.tooling.preview.Preview
import com.zareckii.test8.ui.theme.Test8Theme

data class User(@DrawableRes val drawable: Int, @StringRes val text: Int)

val alignYourBodyData = listOf(
    User(R.drawable.ab1_inversions, R.string.ab1_inversions),
    User(R.drawable.ab1_inversions, R.string.ab1_inversions),
    User(R.drawable.ab1_inversions, R.string.ab1_inversions),
    User(R.drawable.ab1_inversions, R.string.ab1_inversions),
    User(R.drawable.ab1_inversions, R.string.ab1_inversions),
    User(R.drawable.ab1_inversions, R.string.ab1_inversions),
    User(R.drawable.ab1_inversions, R.string.ab1_inversions),
    User(R.drawable.ab1_inversions, R.string.ab1_inversions),
    User(R.drawable.ab1_inversions, R.string.ab1_inversions),
    User(R.drawable.ab1_inversions, R.string.ab1_inversions),
    User(R.drawable.ab1_inversions, R.string.ab1_inversions),
    User(R.drawable.ab1_inversions, R.string.ab1_inversions),
    User(R.drawable.ab1_inversions, R.string.ab1_inversions)
)

@SuppressLint("ResourceType")
@Composable
fun AlignYourBodyRow(
    modifier: Modifier = Modifier
) {

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ) {
        items(alignYourBodyData) { item ->
            AlignYourBodyElement(item.drawable, item.text, modifier)
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun DefaultPreviewBod1y() {
    Test8Theme {
        AlignYourBodyRow(
//            modifier = Modifier.padding(8.dp)
        )
    }
}