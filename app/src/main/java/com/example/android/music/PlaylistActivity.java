package com.example.android.music;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        ArrayList<MusicDetails> Music = new ArrayList<MusicDetails>();
        Music.add(new MusicDetails("one", "lutti"));
        Music.add(new MusicDetails("two", "otiiko"));
        Music.add(new MusicDetails("three", "tolookosu"));
        Music.add(new MusicDetails("four", "oyyisa"));
        Music.add(new MusicDetails("five", "massokka"));
        Music.add(new MusicDetails("six", "temmokka"));
        Music.add(new MusicDetails("seven", "kenekaku"));
        Music.add(new MusicDetails("eight", "kawinta"));
        Music.add(new MusicDetails("nine", "wo’e"));
        Music.add(new MusicDetails("ten", "na’aacha"));


        MusicDetailsAdapter adapter = new MusicDetailsAdapter(this, Music);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
