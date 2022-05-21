package com.zareckii.test8

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zareckii.test8.ui.theme.FavoriteCollectionCard
import com.zareckii.test8.ui.theme.Test8Theme

data class Test(@DrawableRes val drawable: Int, @StringRes val text: Int)

val favoriteCollectionsData = listOf(
    Test(R.drawable.nature, R.string.ab1_inversions),
    Test(R.drawable.nature, R.string.ab1_inversions),
    Test(R.drawable.nature, R.string.ab1_inversions),
    Test(R.drawable.nature, R.string.ab1_inversions),
    Test(R.drawable.nature, R.string.ab1_inversions),
    Test(R.drawable.nature, R.string.ab1_inversions),
    Test(R.drawable.nature, R.string.ab1_inversions),
    Test(R.drawable.nature, R.string.ab1_inversions),
    Test(R.drawable.nature, R.string.ab1_inversions),
    Test(R.drawable.nature, R.string.ab1_inversions),
    Test(R.drawable.nature, R.string.ab1_inversions),
    Test(R.drawable.nature, R.string.ab1_inversions),
    Test(R.drawable.nature, R.string.ab1_inversions)
)

@Composable
fun FavoriteCollectionsGrid(
    modifier: Modifier = Modifier
) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier.height(120.dp)
    ) {
        items(favoriteCollectionsData) { item ->
            FavoriteCollectionCard(
                drawable = item.drawable,
                text = item.text,
                modifier = Modifier.height(56.dp)
            )
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun DefaultPreviewBody2() {
    Test8Theme {
        FavoriteCollectionsGrid(
//            modifier = Modifier.padding(8.dp)
        )
    }
}