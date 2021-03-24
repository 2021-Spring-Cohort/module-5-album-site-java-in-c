package org.wcci.apimastery.controller;

import org.springframework.web.bind.annotation.*;
import org.wcci.apimastery.Entity.Album;
import org.wcci.apimastery.Entity.Song;
import org.wcci.apimastery.Service.AlbumStorage;
import org.wcci.apimastery.Service.SongStorage;

@RestController
public class MainController {
    private AlbumStorage albumStorage;
    private SongStorage songStorage;

    public MainController(AlbumStorage albumStorage) {
        this.albumStorage = albumStorage;
    }

    @GetMapping("/api/albums")
    public Iterable<Album> showAllTheAlbums(){
        return albumStorage.getAllAlbums();
    }
    @DeleteMapping("/api/albums/{id}")
    public void deleteAlbum(@PathVariable long id){
        albumStorage.deleteAlbumById(id);
    }
    @PostMapping("/api/albums")
    public void addAlbum(@RequestBody Album album){
        albumStorage.saveAlbum(album);
    }
    @PostMapping("/api/songs")
    public void addSong(@RequestBody Song song){
        songStorage.saveSong(song);
    }
    @DeleteMapping("/api/songs/{id}")
    public void deleteSong(@PathVariable long id){
        songStorage.deleteSongById(id);
    }
    @PutMapping("/api/albums/{id}")
    public void editAlbums(@PathVariable long id, @RequestBody Album album){
        if (0 != album.getId() && album.getId()==id){
            albumStorage.saveAlbum(album);
        }
    }

}
