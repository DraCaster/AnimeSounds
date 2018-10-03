package app.example.stalker.animesounds;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AudioAdapter extends BaseAdapter {

    private static LayoutInflater inflater = null;
    Context context;
    List<Audio> anime_character_audios_list;

    public AudioAdapter(Context context, List anime_character_audios_list){
        this.context = context;
        this.anime_character_audios_list = anime_character_audios_list;
        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View view = inflater.inflate(R.layout.audio_player, null);

        TextView audio_name = view.findViewById(R.id.audio_name);
        audio_name.setText(anime_character_audios_list.get(position).getAudio_name());

        return view;

    }

    @Override
    public int getCount() {
        return anime_character_audios_list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}
