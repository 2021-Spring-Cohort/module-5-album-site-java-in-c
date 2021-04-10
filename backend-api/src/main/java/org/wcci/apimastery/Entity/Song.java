package org.wcci.apimastery.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    private int rating;
    private String duration;
    @JsonIgnore
    @ManyToOne
    private Album album;
    @ManyToMany
    private Collection<Artist> artists;
    @ElementCollection
    private Collection<Comment> comments;

    protected Song() {

    }

    public int getRating() {
        return rating;
    }

    public String getDuration() {
        return duration;
    }

    public Collection<Comment> getComments() {
        return comments;
    }

    public Song(String name, String lyrics, Album album, int rating, String duration) {
        this.name = name;
        this.lyrics = lyrics;
        this.album = album;
        this.rating = rating;
        this.duration = duration;
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
