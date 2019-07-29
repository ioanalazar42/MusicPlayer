package com.example.android.musicplayer;

public class Song {
    private final String songName;
    private final String artistName;

    public Song(String requiredSongName, String requiredArtistName) {
        songName = requiredSongName;
        artistName = requiredArtistName;
    } // Song

    public String getSongName() {
        return songName;
    } // getSongName

    public String getArtistName() {
        return artistName;
    } // getArtistName
}
