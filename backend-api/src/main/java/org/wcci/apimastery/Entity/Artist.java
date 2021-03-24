package org.wcci.apimastery.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Artist {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    @JsonIgnore
    @ManyToMany
    private Collection<Album> albums;
    @ManyToMany(mappedBy = "artists")
    @JsonIgnore
    private Collection<Song> songs;

    public Artist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
        this.albums = new ArrayList<>();
    }

    protected Artist(){}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Album> getAlbums() {
        return albums;
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public Collection<Song> getSongs() {
        return songs;
    }
}
