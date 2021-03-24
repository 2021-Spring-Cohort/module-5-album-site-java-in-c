package org.wcci.apimastery.Service;

import org.wcci.apimastery.Entity.Song;


public class SongStorage {
    private SongRepository songRepository;

    public SongStorage(SongRepository songRepository) {
        this.songRepository = songRepository;
    }
    public void saveSong(Song song) {
        songRepository.save(song);
    }
    public void deleteSongById(long id) {
        songRepository.deleteById(id);
    }
    public Iterable<Song> getAllSong() {
        return songRepository.findAll();
    }
    public Song retrieveSongById(long id) {
        return songRepository.findById(id).get();
    }
}
