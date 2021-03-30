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
    public int rating;
    @JsonIgnore
    @ManyToOne
    private Album album;
    @ManyToMany
    private Collection<Artist> artists;
    @ElementCollection
    private Collection<Comment> comments;

    protected Song() {

    }
    public Song(String name, String lyrics, int rating, Album album) {
        this.name = name;
        this.lyrics = lyrics;
//        this.rating = rating;
        this.album = album;
        artists = new ArrayList<>();
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
    }
    public void addComment(Comment newComment) {
        if (comments == null) {
            comments = new ArrayList<>();
        }
        comments.add(newComment);
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
