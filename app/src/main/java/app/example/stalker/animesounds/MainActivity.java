package app.example.stalker.animesounds;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Typeface font;
    ListView character_list;
    ImageView app_cover;
    List<Audio> audios_aqua = new ArrayList<>();
    List<Audio> audios_asuka = new ArrayList<>();
    List<Audio> audios_ayumu = new ArrayList<>();
    List<Audio> audios_chiaki = new ArrayList<>();
    List<Audio> audios_chino = new ArrayList<>();
    List<Audio> audios_dio = new ArrayList<>();
    List<Audio> audios_kakyoin = new ArrayList<>();
    List<Audio> audios_kanna = new ArrayList<>();
    List<Audio> audios_karen = new ArrayList<>();
    List<Audio> audios_kenshiro = new ArrayList<>();
    List<Audio> audios_kizuna = new ArrayList<>();
    List<Audio> audios_mayuri = new ArrayList<>();
    List<Audio> audios_megumin = new ArrayList<>();
    List<Audio> audios_nero = new ArrayList<>();
    List<Audio> audios_nico = new ArrayList<>();
    List<Audio> audios_platelet = new ArrayList<>();
    List<Audio> audios_sagiri = new ArrayList<>();
    List<Audio> audios_yui = new ArrayList<>();
    List<Audio> audios_yuzuko = new ArrayList<>();

    //AUDIOS AQUA
    Audio aqua_konosuba = new Audio("Konosuba", R.raw.aqua_konosuba);
    Audio aqua_cry = new Audio("Crying...", R.raw.aqua_cry);

    //AUDIOS ASUKA
    Audio asuka_anta_baka = new Audio("Anta Baka!", R.raw.asuka_anta_baka);

    //AUDIOS AYUMU
    Audio ayumu_oh_mai_gah = new Audio("Oh mai gah!", R.raw.ayumu_ohmaiga);

    //AUDIOS CHIAKI
    Audio chiaki_desu = new Audio("Desu Desu", R.raw.chiaki_desu_desu);

    //AUDIOS CHINO
    Audio chino_cafe_latte = new Audio("Cafe latte", R.raw.chino_cafe_late);
    Audio chino_cafe_moccapuchino = new Audio("Cafe latte, cafe mocha..!", R.raw.chino_cafe_late_cafe_motta_capuchino);

    //AUDIOS DIO
    Audio dio_muda = new Audio("MUDA MUDA MUDA!", R.raw.dio_muda);
    Audio dio_wryyy = new Audio("WRYYYYY!!", R.raw.dio_wryyy);
    Audio dio_goodbye = new Audio("Good Bye jojo!!", R.raw.dio_goodbye_jojo);
    Audio dio_wry_wry_wryyy = new Audio("WRY WRY WRYYYY!!", R.raw.dio_wry_wry_wryyy);

    //AUDIOS KAKYOIN
    Audio kakyoin_laugh = new Audio("EPIC LAUGH", R.raw.kakyoin_laugh);
    Audio kakyoin_cherry = new Audio("LEROLEROLERO", R.raw.kakyoin_cherry);
    Audio kakyoin_thank_you = new Audio("Thank you", R.raw.kakyoin_thank_you);


    //AUDIOS KANNA (Kobayashi-san Chi no Maid Dragon):
    Audio kanna_ame_ame_ame = new Audio("ame ame ame", R.raw.kanna_ame_ame_ame);
    Audio kanna_kawaii = new Audio("Aahhhhh", R.raw.kanna_kawaii);

    //AUDIOS KAREN (Kiniro Mosaic):
    Audio karen_ayaya = new Audio("Ayaya!", R.raw.karen_ayaya);
    Audio karen_noooo = new Audio("Nooooooo!", R.raw.karen_noooo);

    //AUDIOS KIZUNA
    Audio kenshiro_atatat = new Audio("ATATATATATAT!", R.raw.kenshiro_atatat);
    Audio kenshiro_omaewa = new Audio("Omawa mou shindeiru", R.raw.kenshiro_omae);
    Audio kenshiro_nani = new Audio("NANI?!", R.raw.kenshiro_nani);

    //AUDIOS KIZUNA
    Audio kizuna_fck_you = new Audio("F*ck you!", R.raw.kizuna_fck_you);
    Audio kizuna_fck_you_2 = new Audio("FAK YOU!", R.raw.kizuna_fck_you_2);
    Audio kizuna_oh_mai_got = new Audio("Oh MAI GOT!", R.raw.kizuna_oh_mai_got);
    Audio kizuna_justice = new Audio("YEEE JUUUSTICE!", R.raw.kizuna_justice);
    Audio kizuna_singing = new Audio("Singing", R.raw.kizuna_singing);
    Audio kizuna_zaka = new Audio( "zakazaka 1", R.raw.kizuna_zakazaka);
    Audio kizuna_zaka2 = new Audio("zakazaka 2", R.raw.kizuna_zakazaka2);
    Audio kizuna_zaka3 = new Audio("zakazaka 3", R.raw.kizuna_zakazaka3);
    Audio kizuna_zaka4 = new Audio("zakazaka 4", R.raw.kizuna_zakazaka4);
    Audio kizuna_zaka5 = new Audio("zakazaka 5", R.raw.kizuna_zakazaka5);

    //AUIDOS MAYURI
    Audio mayuri_tuturu = new Audio("Tuturu", R.raw.mayuri_tuturu);
    Audio mayuri_tuturu_okarin = new Audio("Tuturu Okarin", R.raw.mayuri_tuturu_okarin);
    Audio mayuri_song = new Audio("Song", R.raw.mayuri_song);

    //AUDIOS MEGUMIN (KONOSUBA):
    Audio megumin_explosion = new Audio("Exploooosion!", R.raw.megumin_explosion);
    Audio megumin_chunchunmaru = new Audio("Chunchunmaru", R.raw.megumin_chunchunmaru);
    Audio megumin_my_eye = new Audio("Ahh! My eye!", R.raw.megumin_my_eye);
    Audio megumin_my_name = new Audio("My name is Megumin!", R.raw.megumin_my_name);
    Audio megumin_yamero = new Audio("Yame yamero!!", R.raw.megumin_yamero);
    Audio megumin_ha_daiku = new Audio("Ha.. saikou.. desu.", R.raw.megumin_ha_saikou_desu);
    Audio megumin_bakuretsu = new Audio("Bakuretsu Bakuretsu la la la", R.raw.megumin_bakuretsu);

    //AUDIOS NERO
    Audio nero_padoru = new Audio("Merry Christmas ", R.raw.nero_padoru);

    //AUDIOS NICO
    Audio nico_nico_ni = new Audio("Nico Nico ni!", R.raw.nico_nico_ni);

    //AUDIOS PLATELET (HATARAKU SAIBU):
    Audio platalet_anone = new Audio("Anone Anone", R.raw.platelet_anone);

    //AUDIOS SAGIRI
    Audio sagiri_baka = new Audio("Bakaaa!!!", R.raw.sagiri_baka);

    //AUDIOS YUI (K-ON):
    Audio yui_chakachan = new Audio("ChakaChan!", R.raw.yui_chakachan);
    Audio yui_kon = new Audio("K-on", R.raw.yui_kon);

    //AUDIOS YUZUKO
    Audio yuzuko_september = new Audio("SEPTEMBER!!!", R.raw.yuzuko_september);
    Audio yuzuko_december = new Audio("DECEMBER!!!", R.raw.yuzuko_december);

    AnimeCharacter aqua = new AnimeCharacter("Aqua", "Konosuba", "drawable://" + R.drawable.img_aqua);
    AnimeCharacter asuka = new AnimeCharacter("Asuka", "Evangelion", "drawable://" + R.drawable.img_asuka);
    AnimeCharacter ayumu = new AnimeCharacter("Ayumu Kazuga", "Azumanga Daioh", "drawable://" + R.drawable.img_ayumu);
    AnimeCharacter chiaki = new AnimeCharacter("Chiaki", "GAMERS!", "drawable://" + R.drawable.img_chiaki);
    AnimeCharacter chino = new AnimeCharacter("Chino Kafuu", "Gochuumon","drawable://" + R.drawable.img_chino);
    AnimeCharacter dio = new AnimeCharacter("Dio Brando", "Jojo's", "drawable://" + R.drawable.img_dio);
    AnimeCharacter kakyoin = new AnimeCharacter("Kakyoin", "JoJo's", "drawable://" + R.drawable.img_kakyoin);
    AnimeCharacter kanna = new AnimeCharacter("Kanna", "Maid Dragon", "drawable://" + R.drawable.img_kanna);
    AnimeCharacter karen = new AnimeCharacter("Karen", "Kiniro Mosaic", "drawable://" + R.drawable.img_karen);
    AnimeCharacter kenshiro = new AnimeCharacter("Kenshiro", "Hokuto no Ken", "drawable://" + R.drawable.img_kenshiro);
    AnimeCharacter kizuna = new AnimeCharacter("Kizuna A.I.", "Youtube", "drawable://" + R.drawable.img_kizuna);
    AnimeCharacter mayuri = new AnimeCharacter("Mayuri", "Steins;Gate", "drawable://" + R.drawable.img_mayuri);
    AnimeCharacter megumin = new AnimeCharacter("Megumin", "Konosuba", "drawable://" + R.drawable.img_megumin);
    AnimeCharacter nero = new AnimeCharacter("Nero", "Fate/Extra","drawable://" + R.drawable.img_nero);
    AnimeCharacter nico = new AnimeCharacter("Nico Yazawa", "Love Live!", "drawable://" + R.drawable.img_nico);
    AnimeCharacter platelet = new AnimeCharacter("Platelet", "Hataraku Saibou", "drawable://" + R.drawable.img_platelet);
    AnimeCharacter sagiri = new AnimeCharacter("Sagiri", "EroManga-sensei", "drawable://" + R.drawable.img_sagiri);
    AnimeCharacter yui = new AnimeCharacter("Yui", "K-ON", "drawable://" + R.drawable.img_yui);
    AnimeCharacter yuzuko = new AnimeCharacter("Yuzuko", "Yuyushiki", "drawable://" + R.drawable.img_yuzuko);
    List<AnimeCharacter> anime_characters_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (audios_megumin.isEmpty()) {
            fill_audios_list();
        }
        if (anime_characters_list.isEmpty()) {
            fill_anime_character_list();
        }

        app_cover = findViewById(R.id.app_cover);
        app_cover.setImageResource(R.drawable.app_main_cover);
        character_list = findViewById(R.id.list_view_main_characters);
        character_list.setAdapter(new CharacterListAdapter(this, R.layout.main_list_item, anime_characters_list));

        character_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {

                AnimeCharacter anime_character = anime_characters_list.get(position);
                Intent intent = new Intent(getBaseContext(), CharacterAudiosActivity.class);
                intent.putExtra("ANIME_CHARACTER", anime_character);
                startActivity(intent);
            }
    });

    }

    private void fill_audios_list() {
        audios_aqua.add(aqua_konosuba);
        audios_aqua.add(aqua_cry);
        audios_asuka.add(asuka_anta_baka);
        audios_ayumu.add(ayumu_oh_mai_gah);
        audios_chiaki.add(chiaki_desu);
        audios_chino.add(chino_cafe_latte);
        audios_chino.add(chino_cafe_moccapuchino);
        audios_dio.add(dio_muda);
        audios_dio.add(dio_goodbye);
        audios_dio.add(dio_wry_wry_wryyy);
        audios_dio.add(dio_wryyy);
        audios_kakyoin.add(kakyoin_laugh);
        audios_kakyoin.add(kakyoin_cherry);
        audios_kakyoin.add(kakyoin_thank_you);
        audios_kanna.add(kanna_ame_ame_ame);
        audios_kanna.add(kanna_kawaii);
        audios_karen.add(karen_ayaya);
        audios_karen.add(karen_noooo);
        audios_kenshiro.add(kenshiro_atatat);
        audios_kenshiro.add(kenshiro_omaewa);
        audios_kenshiro.add(kenshiro_nani);
        audios_kizuna.add(kizuna_fck_you);
        audios_kizuna.add(kizuna_fck_you_2);
        audios_kizuna.add(kizuna_oh_mai_got);
        audios_kizuna.add(kizuna_justice);
        audios_kizuna.add(kizuna_singing);
        audios_kizuna.add(kizuna_zaka);
        audios_kizuna.add(kizuna_zaka2);
        audios_kizuna.add(kizuna_zaka3);
        audios_kizuna.add(kizuna_zaka4);
        audios_kizuna.add(kizuna_zaka5);
        audios_mayuri.add(mayuri_tuturu);
        audios_mayuri.add(mayuri_tuturu_okarin);
        audios_mayuri.add(mayuri_song);
        audios_megumin.add(megumin_my_name);
        audios_megumin.add(megumin_explosion);
        audios_megumin.add(megumin_chunchunmaru);
        audios_megumin.add(megumin_my_eye);
        audios_megumin.add(megumin_yamero);
        audios_megumin.add(megumin_ha_daiku);
        audios_megumin.add(megumin_bakuretsu);
        audios_nero.add(nero_padoru);
        audios_nico.add(nico_nico_ni);
        audios_platelet.add(platalet_anone);
        audios_sagiri.add(sagiri_baka);
        audios_yui.add(yui_chakachan);
        audios_yui.add(yui_kon);
        audios_yuzuko.add(yuzuko_september);
        audios_yuzuko.add(yuzuko_december);

        //SET AUDIOS
        aqua.setAudios(audios_aqua);
        asuka.setAudios(audios_asuka);
        ayumu.setAudios(audios_ayumu);
        chiaki.setAudios(audios_chiaki);
        chino.setAudios(audios_chino);
        dio.setAudios(audios_dio);
        kakyoin.setAudios(audios_kakyoin);
        kanna.setAudios(audios_kanna);
        karen.setAudios(audios_karen);
        kenshiro.setAudios(audios_kenshiro);
        kizuna.setAudios(audios_kizuna);
        mayuri.setAudios(audios_mayuri);
        megumin.setAudios(audios_megumin);
        nero.setAudios(audios_nero);
        nico.setAudios(audios_nico);
        platelet.setAudios(audios_platelet);
        sagiri.setAudios(audios_sagiri);
        yui.setAudios(audios_yui);
        yuzuko.setAudios(audios_yuzuko);

    }

    private void fill_anime_character_list() {

        anime_characters_list.clear();

        //Remember to add all the new characters!
        anime_characters_list.add(aqua);
        anime_characters_list.add(asuka);
        anime_characters_list.add(ayumu);
        anime_characters_list.add(chiaki);
        anime_characters_list.add(chino);
        anime_characters_list.add(dio);
        anime_characters_list.add(kakyoin);
        anime_characters_list.add(kanna);
        anime_characters_list.add(karen);
        anime_characters_list.add(kenshiro);
        anime_characters_list.add(kizuna);
        anime_characters_list.add(mayuri);
        anime_characters_list.add(megumin);
        anime_characters_list.add(nero);
        anime_characters_list.add(nico);
        anime_characters_list.add(platelet);
        anime_characters_list.add(sagiri);
        anime_characters_list.add(yui);
        anime_characters_list.add(yuzuko);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        try {
            trimCache(this);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void trimCache(Context context) {
        try {
            File dir = context.getCacheDir();
            if (dir != null && dir.isDirectory()) {
                deleteDir(dir);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static boolean deleteDir(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }

        // The directory is now empty so delete it
        return dir.delete();
    }

}

