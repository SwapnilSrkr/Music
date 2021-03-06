package com.example.android.music;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicDetailsAdapter extends ArrayAdapter<MusicDetails> {

    public MusicDetailsAdapter(Activity context, ArrayList<MusicDetails> Music) {
        super(context, 0, Music);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        MusicDetails local_word = getItem(position);
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        songTextView.setText(local_word.getSongName());
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(local_word.getArtistName());
        return listItemView;
    }
}
