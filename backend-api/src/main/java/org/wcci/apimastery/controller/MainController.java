package org.wcci.apimastery.controller;

import org.springframework.web.bind.annotation.*;
import org.wcci.apimastery.Entity.Album;
import org.wcci.apimastery.Entity.Comment;
import org.wcci.apimastery.Entity.Song;
import org.wcci.apimastery.Service.AlbumStorage;
import org.wcci.apimastery.Service.SongStorage;

@RestController
public class MainController {
    private final AlbumStorage albumStorage;
    private final SongStorage songStorage;

    public MainController(AlbumStorage albumStorage, SongStorage songStorage) {
        this.albumStorage = albumStorage;
        this.songStorage = songStorage;
    }

    @PostMapping("/api/song/{id}/comment")
    public Iterable<Album> addReviewForSongs(@RequestBody Comment comments, @PathVariable long id) {
        Song song = songStorage.retrieveSongById(id);
        Comment comment = new Comment(comments.getBody(), comments.getName());
        song.addComment(comment);
        songStorage.saveSong(song);
        return albumStorage.getAllAlbums();
    }


    @GetMapping("/api/albums")
    public Iterable<Album> showAllTheAlbums(){
        return albumStorage.getAllAlbums();
    }
    @DeleteMapping("/api/albums/{id}")
    public void deleteAlbum(@PathVariable long id){
        albumStorage.deleteAlbumById(id);
    }

    @PostMapping("/api/albums/{id}/comment")
    public Iterable<Album> addComment(@RequestBody Comment comment, @PathVariable long id) {
        Album album = albumStorage.retrieveAlbumById(id);
        Comment newComment = new Comment(comment.getBody(),comment.getName());
        album.addComment(newComment);
        albumStorage.saveAlbum(album);

        return albumStorage.getAllAlbums();
    }

    @PostMapping("/api/albums")
    public void addAlbum(@RequestBody Album album){
        albumStorage.saveAlbum(album);
    }
    @PatchMapping("/api/albums/{id}/songs")
    public void addSong(@RequestBody Song song, @PathVariable long id){
        Album album = albumStorage.retrieveAlbumById(id);
        Song songToAdd = new Song(song.getName(), song.getLyrics(), album, song.getRating(), song.getDuration());
        songStorage.saveSong(songToAdd);
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
