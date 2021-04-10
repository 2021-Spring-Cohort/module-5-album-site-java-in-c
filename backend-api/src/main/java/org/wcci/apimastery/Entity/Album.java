package org.wcci.apimastery.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Album {


    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String albumCoverUrl;
    private String recordLabel;
    private int rating;
    @OneToMany(mappedBy = "album")
    private Collection<Song> songs;
    @ManyToMany(mappedBy = "albums")
    private Collection<Artist> artists;
    @ElementCollection
    private Collection<Comment> comments;


    public Album(String name, String albumCoverUrl, String recordLabel, int rating) {
        this.name = name;
        this.recordLabel = recordLabel;
        this.rating = rating;
        this.albumCoverUrl = albumCoverUrl;
        this.songs = new ArrayList<>();
        this.artists = new ArrayList<>();
        this.comments = new ArrayList<>();
    }
    public void addComment(Comment newComment) {
        comments.add(newComment);
    }
    public Album() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getAlbumCoverUrl() {
        return albumCoverUrl;
    }

    public Collection<Song> getSongs() {
        return songs;
    }

    public Collection<Artist> getArtists() {
        return artists;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public int getRating() {
        return rating;
    }

    public Collection<Comment> getComments() {
        return comments;
    }
}
