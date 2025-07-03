package com.amary.poke.droid.data.mapper

import com.amary.poke.droid.data.remote.response.DetailResponse
import com.amary.poke.droid.domain.model.DetailModel
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper(
    uses = [
        AbilitiesMapper::class,
        AbilityMapper::class,
        AnimatedMapper::class,
        BlackWhiteMapper::class,
        CriesMapper::class,
        CrystalMapper::class,
        DiamondPearlMapper::class,
        DreamWorldMapper::class,
        EmeraldMapper::class,
        FireredLeafgreenMapper::class,
        FormMapper::class,
        GoldMapper::class,
        HeartgoldSoulsilverMapper::class,
        HeldItemMapper::class,
        HomeMapper::class,
        IconsMapper::class,
        ItemMapper::class,
        MoveLearnMethodMapper::class,
        MoveMapper::class,
        MovesMapper::class,
        OfficialArtworkMapper::class,
        OmegarubyAlphasapphireMapper::class,
        OtherMapper::class,
        PlatinumMapper::class,
        RedBlueMapper::class,
        RubySapphireMapper::class,
        ShowdownMapper::class,
        SilverMapper::class,
        SpeciesMapper::class,
        SpritesMapper::class,
        StatMapper::class,
        StatsMapper::class,
        TypeMapper::class,
        TypesMapper::class,
        UltraSunUltraMoonMapper::class,
        VersionDetailMapper::class,
        VersionGroupMapper::class,
        VersionGroupDetailMapper::class,
        YellowMapper::class
    ]
)
interface DetailMapper{
   fun toModel(response: DetailResponse): DetailModel

   companion object {
       val INSTANCE: DetailMapper = Mappers.getMapper(DetailMapper::class.java)
   }
}