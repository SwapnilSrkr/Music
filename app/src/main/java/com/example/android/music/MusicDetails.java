package com.example.android.music;

public class MusicDetails {
    private String mSongName;
    private String mArtistName;

    public MusicDetails(String SongName, String ArtistName){
        mSongName = SongName;
        mArtistName = ArtistName;
    }
    public String getSongName() {
        return mSongName;
    }
    public String getArtistName() {
        return mArtistName;
    }
}
