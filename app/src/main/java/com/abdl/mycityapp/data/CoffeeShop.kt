package com.abdl.mycityapp.data

data class CoffeeShop(
    override val titleResId: Int,
    val addressResId: Int,
    val instagramResId: Int,
    val operationalHoursResId: Int,
    override val imageResId: Int,
    override val descriptionResId: Int? = null
) : ListItemData