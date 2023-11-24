package com.abdl.mycityapp.data

import androidx.annotation.StringRes

data class Category(
    override val titleResId: Int,
    override val imageResId: Int,
    override val descriptionResId: Int? = null
) : ListItemData
