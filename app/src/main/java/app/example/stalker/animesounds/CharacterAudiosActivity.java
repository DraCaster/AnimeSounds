package app.example.stalker.animesounds;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class CharacterAudiosActivity extends AppCompatActivity {
    ListView audios_list_view;
    List<Audio> audios_list = new ArrayList<>();
    MediaPlayer media_player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_audios);

        audios_list_view = findViewById(R.id.list_view_audio_data);

        AnimeCharacter anime_character = (AnimeCharacter) getIntent().getSerializableExtra("ANIME_CHARACTER");
        audios_list = anime_character.getAudios();
        audios_list_view.setAdapter(new AudioAdapter(this, audios_list));

        audios_list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(media_player != null){
                    media_player.release();
                }
                Audio audio = audios_list.get(position);
                int audio_id = audio.getAudio_id();
                media_player = MediaPlayer.create(CharacterAudiosActivity.this, audio_id);
                media_player.start();
            }
        });

        audios_list_view.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
                                           int pos, long id) {
                Audio audio = audios_list.get(pos);
                int audio_id = audio.getAudio_id();
                String audio_name = audio.getAudio_name()+".mp3";
//              TODO Auto-generated method stub
//                Toast.makeText(getApplicationContext(), "You will be able to share audios in " +
//                        "the next update, sorry user chan!", Toast.LENGTH_LONG).show();
//
//                Intent compartirAudio = new Intent(Intent.ACTION_SEND);
//                compartirAudio.setPackage("com.whatsapp");
//                compartirAudio.setType("audio/*");
//                compartirAudio.putExtra(Intent.EXTRA_STREAM,
//                        Uri.parse("android.resource://" + getApplicationContext().getPackageName() + "/raw/" + audio_id)); //Error on getPackageName()
//                startActivity(Intent.createChooser(compartirAudio, "Compartir vía"));

//                compartirAudio.setType("audio/mp3");
//                compartirAudio.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
//                compartirAudio.putExtra(Intent.EXTRA_STREAM, Uri.parse("android.resource://com.example.stalker.animesounds/raw/"+audio_id));
//                try{
//                    startActivity(Intent.createChooser(compartirAudio, "Share Sound File"));
//                } catch (android.content.ActivityNotFoundException ex) {
//                    Toast.makeText(getApplicationContext(), "Hubo un error", Toast.LENGTH_LONG).show();
//                }

                sendWhatsAppAudio(audio_id, audio_name);

                return true;
            }
        });

    }
    private void releaseMediaPlayer() {
        if (media_player!= null) {
            if(media_player.isPlaying()) {
                media_player.stop();
            }
            media_player.release();
            media_player = null;
        }
    }

    @Override
    public void onBackPressed() {
        releaseMediaPlayer();
        finish();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        releaseMediaPlayer();
        finish();
    }

    private void sendWhatsAppAudio(int audio_id, String audio_name){
        try {
            //Copy file to external ExternalStorage.
            String mediaPath = copyFiletoExternalStorage(audio_id, audio_name);

            Intent shareMedia = new Intent(Intent.ACTION_SEND);
            //set WhatsApp application.
            shareMedia.setPackage("com.whatsapp");
            shareMedia.setType("audio/*");
            //set path of media file in ExternalStorage.
            shareMedia.putExtra(Intent.EXTRA_STREAM, Uri.parse(mediaPath));
            startActivity(Intent.createChooser(shareMedia, "Compartir archivo"));
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Whatsapp no se encuentra instalado", Toast.LENGTH_LONG).show();
        }
    }

    private String copyFiletoExternalStorage(int resourceId, String resourceName){
        //PONER UN TRY CATCH!
        String pathSDCard = Environment.getExternalStorageDirectory() + "/Android/data/" + resourceName;
        try{
            InputStream in = getResources().openRawResource(resourceId);
            FileOutputStream out = null;
            out = new FileOutputStream(pathSDCard);
            byte[] buff = new byte[1024];
            int read = 0;
            try {
                while ((read = in.read(buff)) > 0) {
                    out.write(buff, 0, read);
                }
            } finally {
                in.close();
                out.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  pathSDCard;
    }



}
