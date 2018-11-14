package com.example.android.music;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        ArrayList<MusicDetails> Music = new ArrayList<MusicDetails>();
        Music.add(new MusicDetails("Song Name 1", "Artist 1"));
        Music.add(new MusicDetails("Song Name 2", "Artist 2"));
        Music.add(new MusicDetails("Song Name 3", "Artist 3"));
        Music.add(new MusicDetails("Song Name 4", "Artist 4"));
        Music.add(new MusicDetails("Song Name 5", "Artist 5"));
        MusicDetailsAdapter adapter = new MusicDetailsAdapter(this, Music);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
