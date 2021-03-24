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


    public Album(String name, String albumCoverUrl) {
        this.name = name;
        this.albumCoverUrl = albumCoverUrl;
        this.songs = new ArrayList<>();
        this.artists = new ArrayList<>();
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
}
