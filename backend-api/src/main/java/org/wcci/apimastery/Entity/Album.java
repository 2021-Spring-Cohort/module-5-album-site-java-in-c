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
    @OneToMany(mappedBy = "album")
    private Collection<Song> songs;
    @ManyToMany(mappedBy = "albums")
    private Collection<Artist> artists;
    @ElementCollection
    private Collection<Comment> comments;


    public Album(String name, String albumCoverUrl) {
        this.name = name;
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

    public Collection<Comment> getComments() {
        return comments;
    }
}
