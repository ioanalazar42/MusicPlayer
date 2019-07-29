
       /* View songView = convertView;
        if (songView == null) {
            songView = LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.details_window, parent, false);
        }

        TextView artistNameTextView = (TextView) songView.findViewById(R.id.artistName_text_view);

        TextView songNameTextView = (TextView) songView.findViewById(R.id.artistName_text_view);

        artistNameTextView.setText(song.getArtistName());

        songNameTextView.setText(song.getSongName());

        return songView;*/
package com.example.android.musicplayer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SongDetailsDisplay extends AppCompatActivity {

    public TextView songNameTextView, artistTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_window);

        //RelativeLayout songLayout = (RelativeLayout) findViewById(R.id.song_layout);
        Bundle bundle = getIntent().getExtras();
        // Find the TextView in the list_item.xml layout with the ID
        songNameTextView = (TextView) findViewById(R.id.songName_text_view);
        // Get the song name from the current Song object and
        // set this text on the name TextView
        songNameTextView.setText(bundle.getString("SongName"));

        // Find the TextView in the list_item.xml layout with the ID
        artistTextView = (TextView) findViewById(R.id.artistName_text_view);
        // Get the artist name from the current Song object and
        // set this text on the number TextView
        artistTextView.setText(bundle.getString("SongName"));
    }
}
