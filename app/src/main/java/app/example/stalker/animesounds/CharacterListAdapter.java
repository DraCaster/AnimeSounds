package app.example.stalker.animesounds;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.lang.reflect.Type;
import java.util.List;

public class CharacterListAdapter extends ArrayAdapter<AnimeCharacter> {
    Typeface tf;

    private static final String TAG = "AnimeCharacterAdapter";
    private Context context;
    private int mResource;

    static class ViewHolder {
        TextView character_name;
        TextView character_anime;
        ImageView img;
    }

    public CharacterListAdapter(@NonNull Context context, int resource, @NonNull List<AnimeCharacter> objects) {
        super(context, resource, objects);
        this.context = context;
        mResource = resource;
        setup_image_loader();

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String character_name = getItem(position).getCharacter_name();
        String character_anime = getItem(position).getCharacter_anime();
        String img_url = getItem(position).getCharacter_img();



        ViewHolder view_holder;
        view_holder = new ViewHolder();

        if (convertView == null) {
            LayoutInflater layout_inflater = LayoutInflater.from(context);
            convertView = layout_inflater.inflate(mResource, parent, false);
            view_holder.character_name = convertView.findViewById(R.id.txt_character_name);
            view_holder.character_anime = convertView.findViewById(R.id.txt_anime_name);
            view_holder.img = convertView.findViewById(R.id.character_img);

            tf = Typeface.createFromAsset(context.getAssets(), "fonts/al_kisah.ttf");
//            TextView character_name_text = convertView.findViewById(R.id.txt_character_name);
            TextView anime_name_text = convertView.findViewById(R.id.txt_anime_name);
            convertView.setTag(view_holder);
//            character_name_text.setTypeface(tf);
            anime_name_text.setTypeface(tf);

        } else {
            view_holder = (ViewHolder) convertView.getTag();
        }

        int default_img = context.getResources().getIdentifier("@drawable/img_default", null, context.getPackageName());

        ImageLoader imageLoader = ImageLoader.getInstance();

        DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true)
                .cacheOnDisc(true).resetViewBeforeLoading(true)
                .showImageForEmptyUri(default_img)
                .showImageOnFail(default_img)
                .showImageOnLoading(default_img).build();

        imageLoader.displayImage(img_url, view_holder.img, options);

        view_holder.character_name.setText(character_name);
        view_holder.character_anime.setText(character_anime);



//        ImageLoader.getInstance().clearMemoryCache();
//        ImageLoader.getInstance().clearDiskCache();
        return convertView;
    }

    private void setup_image_loader() {
        // UNIVERSAL IMAGE LOADER SETUP
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .cacheOnDisc(true).cacheInMemory(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300)).build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                context)
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .discCacheSize(100 * 1024 * 1024).build();


        ImageLoader.getInstance().init(config);
        // END - UNIVERSAL IMAGE LOADER SETUP
    }

}
