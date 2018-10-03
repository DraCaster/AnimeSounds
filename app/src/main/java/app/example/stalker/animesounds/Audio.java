package app.example.stalker.animesounds;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Audio implements Serializable{

    private String audio_name;
    private int audio_id;

    public Audio(String audio_name, int audio_id){
        this.audio_name = audio_name;
        this.audio_id = audio_id;
    }

//    protected Audio(Parcel in) {
//        audio_name = in.readString();
//        audio_id = in.readInt();
//    }

//    public static final Creator<Audio> CREATOR = new Creator<Audio>() {
//        @Override
//        public Audio createFromParcel(Parcel in) {
//            return new Audio(in);
//        }
//
//        @Override
//        public Audio[] newArray(int size) {
//            return new Audio[size];
//        }
//    };

    public String getAudio_name() {
        return audio_name;
    }

    public void setAudio_name(String audio_name) {
        this.audio_name = audio_name;
    }

    public int getAudio_id() {
        return audio_id;
    }

    public void setAudio_id(int audio_id) {
        this.audio_id = audio_id;
    }

//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(audio_name);
//        dest.writeInt(audio_id);
//    }
}
