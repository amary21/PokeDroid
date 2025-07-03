package com.amary.poke.droid.domain.model



data class HeldItemModel(
    val item: ItemModel = ItemModel(),
    val versionDetails: List<VersionDetailModel> = emptyList()
)