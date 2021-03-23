package org.wcci.apimastery.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Song {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String lyrics;
    @ManyToOne
    private Album album;
    @ManyToMany
    private Collection<Artist> artists;

    protected Song() {

    }
    public Song(String name, String lyrics, Album album) {
        this.name = name;
        this.lyrics = lyrics;
        this.album = album;
        artists = new ArrayList<>();
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLyrics() {
        return lyrics;
    }

    public Album getAlbum() {
        return album;
    }

    public Collection<Artist> getArtists() {
        return artists;
    }
}