package com.abdl.mycityapp.data

import com.abdl.mycityapp.R

object DataSource {
    // Sample data instantiation
    val tourismSpots = listOf(
        DestinasiWisata(R.string.title_cibulan, R.string.desc_cibulan, R.drawable.cibulan),
        DestinasiWisata(R.string.title_cicerem, R.string.desc_cicerem, R.drawable.talagabiru),
        DestinasiWisata(R.string.title_palutungan, R.string.desc_palutungan, R.drawable.curugputri),
        DestinasiWisata(R.string.title_kebunraya, R.string.desc_kebunraya, R.drawable.kebunraya),
        DestinasiWisata(R.string.title_sukageuri, R.string.desc_sukageuri, R.drawable.sukageri),
        DestinasiWisata(R.string.title_landung, R.string.desc_landung, R.drawable.curuglandung),
        DestinasiWisata(R.string.title_sangkan, R.string.desc_sangkan, R.drawable.sangkanpark),
        DestinasiWisata(R.string.title_ciremai, R.string.desc_ciremai, R.drawable.gunungciremai),
        DestinasiWisata(R.string.title_remis, R.string.desc_remis, R.drawable.talagaremis),
        DestinasiWisata(R.string.title_panembongan, R.string.desc_panembongan, R.drawable.panembongan),
        DestinasiWisata(R.string.title_woodland, R.string.desc_woodland, R.drawable.woodland),
        DestinasiWisata(R.string.title_jalaksana, R.string.desc_jalaksana, R.drawable.cibulan)
    )

    val restaurants = listOf(
        Restoran(R.string.restoran1_nama, R.string.restoran1_deskripsi, R.drawable.restoran1),
        Restoran(R.string.restoran2_nama, R.string.restoran2_deskripsi, R.drawable.restoran2),
        Restoran(R.string.restoran3_nama, R.string.restoran3_deskripsi, R.drawable.restoran3),
        Restoran(R.string.restoran4_nama, R.string.restoran4_deskripsi, R.drawable.restoran4),
        Restoran(R.string.restoran5_nama, R.string.restoran5_deskripsi, R.drawable.restoran5),
        Restoran(R.string.restoran6_nama, R.string.restoran6_deskripsi, R.drawable.restoran6),
        Restoran(R.string.restoran7_nama, R.string.restoran7_deskripsi, R.drawable.restoran7),
        Restoran(R.string.restoran8_nama, R.string.restoran8_deskripsi, R.drawable.restoran8),
        Restoran(R.string.restoran9_nama, R.string.restoran9_deskripsi, R.drawable.restoran9),
        Restoran(R.string.restoran10_nama, R.string.restoran10_deskripsi, R.drawable.restoran10),
    )

    val coffeeShops = listOf(
        CoffeeShop(
            R.string.judul_kedai_artha,
            R.string.alamat_kedai_artha,
            R.string.instagram_kedai_artha,
            R.string.jam_operasional_kedai_artha,
            R.drawable.kedai_artha
        ),
        CoffeeShop(
            R.string.judul_domo_coffee_and_space,
            R.string.alamat_domo_coffee_and_space,
            R.string.instagram_domo_coffee_and_space,
            R.string.jam_operasional_domo_coffee_and_space,
            R.drawable.domo
        ),
        CoffeeShop(
            R.string.judul_kopi_pono,
            R.string.alamat_kopi_pono,
            R.string.instagram_kopi_pono,
            R.string.jam_operasional_kopi_pono,
            R.drawable.pono
        ),
        CoffeeShop(
            R.string.judul_otaku_coffee_and_roastery,
            R.string.alamat_otaku_coffee_and_roastery,
            R.string.instagram_otaku_coffee_and_roastery,
            R.string.jam_operasional_otaku_coffee_and_roastery,
            R.drawable.otaku
        ),
        CoffeeShop(
            R.string.judul_onedis_coffee,
            R.string.alamat_onedis_coffee,
            R.string.instagram_onedis_coffee,
            R.string.jam_operasional_onedis_coffee,
            R.drawable.onedis
        ),
        CoffeeShop(
            R.string.judul_sisijalankopi,
            R.string.alamat_sisijalankopi,
            R.string.instagram_sisijalankopi,
            R.string.jam_operasional_sisijalankopi,
            R.drawable.sisijalankopi
        ),
        CoffeeShop(
            R.string.judul_mokopi_co_kuningan,
            R.string.alamat_mokopi_co_kuningan,
            R.string.instagram_mokopi_co_kuningan,
            R.string.jam_operasional_mokopi_co_kuningan,
            R.drawable.mokopi
        ),
        CoffeeShop(
            R.string.judul_evolution_s_coffee,
            R.string.alamat_evolution_s_coffee,
            R.string.instagram_evolution_s_coffee,
            R.string.jam_operasional_evolution_s_coffee,
            R.drawable.evolution
        ),
        CoffeeShop(
            R.string.judul_eternite_space,
            R.string.alamat_eternite_space,
            R.string.instagram_eternite_space,
            R.string.jam_operasional_eternite_space,
            R.drawable.eternite
        ),
        CoffeeShop(
            R.string.judul_kopi_iu,
            R.string.alamat_kopi_iu,
            R.string.instagram_kopi_iu,
            R.string.jam_operasional_kopi_iu,
            R.drawable.iu
        )
    )

    val localProducts = listOf(
        MakananKhas(R.string.opak_bakar_title, R.string.opak_bakar_desc, R.drawable.opakbakar),
        MakananKhas(R.string.kwecang_title, R.string.kwecang_desc, R.drawable.kwecang),
        MakananKhas(R.string.lepet_title, R.string.lepet_desc, R.drawable.lepet),
        MakananKhas(R.string.tahu_lamping_title, R.string.tahu_lamping_desc, R.drawable.tahulamping),
        MakananKhas(R.string.jeniper_title, R.string.jeniper_desc, R.drawable.jenniper),
        MakananKhas(R.string.kopi_luwak_linggarjati_title, R.string.kopi_luwak_linggarjati_desc, R.drawable.kopiluwak),
        MakananKhas(R.string.batik_kuningan_title, R.string.batik_kuningan_desc, R.drawable.batik),
        MakananKhas(R.string.sirup_tjampolay_title, R.string.sirup_tjampolay_desc, R.drawable.sirup_tjampolay),
    )

    val categories = listOf(
        Category(R.string.coffee_shop, R.drawable.catcoffeeshop),
        Category(R.string.makanan_khas, R.drawable.catlocalproduct),
        Category(R.string.restoran, R.drawable.catrestaurant),
        Category(R.string.destinasi_wisata, R.drawable.catspots)
    )
}

interface ListItemData {
    val imageResId: Int
    val titleResId: Int
    val descriptionResId: Int?
}