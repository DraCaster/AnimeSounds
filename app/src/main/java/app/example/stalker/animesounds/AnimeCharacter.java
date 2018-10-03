package app.example.stalker.animesounds;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AnimeCharacter implements Serializable{
    private String character_name;
    private String character_anime;
    private String character_img;
    private List<Audio> audios;

    AnimeCharacter(String character_name, String character_anime, String character_img){
        this.character_name = character_name;
        this.character_anime = character_anime;
        this.character_img = character_img;
        this.audios = null;
    }

//    protected AnimeCharacter(Parcel in) {
//        character_name = in.readString();
//        character_anime = in.readString();
//        img_data = in.readInt();
//        audios = in.createTypedArrayList(Audio.CREATOR);
//    }

//    public static final Creator<AnimeCharacter> CREATOR = new Creator<AnimeCharacter>() {
//        @Override
//        public AnimeCharacter createFromParcel(Parcel in) {
//            return new AnimeCharacter(in);
//        }
//
//        @Override
//        public AnimeCharacter[] newArray(int size) {
//            return new AnimeCharacter[size];
//        }
//    };

    public String getCharacter_name() {
        return character_name;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }

    public String getCharacter_anime() {
        return character_anime;
    }

    public String getCharacter_img() {
        return character_img;
    }

    public void setCharacter_img(String character_img) {
        this.character_img = character_img;
    }

    public List<Audio> getAudios() {
        return audios;
    }

    public void setAudios(List<Audio> audios) {
        this.audios = audios;
    }


//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(character_name);
//        dest.writeString(character_anime);
//        dest.writeInt(img_data);
//        dest.writeTypedList(audios);
//    }
}

