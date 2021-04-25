package org.wcci.apimastery.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wcci.apimastery.Entity.Song;

@Service
public class SongStorage {
    @Autowired
    public SongRepository songRepository;

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

