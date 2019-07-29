package com.example.android.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an arraylist of songs
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("All Star", "Smash Mouth"));
        songs.add(new Song("Don't Stop Me Now", "Queen"));
        songs.add(new Song("More Than a Feeling", "Boston"));
        songs.add(new Song("Smoke On The Water", "Deep Purple"));
        songs.add(new Song("Thunderstruck", "AC/DC"));
        songs.add(new Song("Brown Eyed Girl", "Van Morrison"));
        songs.add(new Song("Whole Lotta Love", "Led Zeppelin"));
        songs.add(new Song("We Built This City", "Starship"));
        songs.add(new Song("I Want To Break Free", "Queen"));
        songs.add(new Song("Purple Rain", "Prince"));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent songsIntent = new Intent(MainActivity.this,
                        SongDetailsDisplay.class);
                songsIntent.putExtra("SongName", listView.getItemAtPosition(position).toString());
                startActivity(songsIntent);
            }
        });

    } // onCreate
}
