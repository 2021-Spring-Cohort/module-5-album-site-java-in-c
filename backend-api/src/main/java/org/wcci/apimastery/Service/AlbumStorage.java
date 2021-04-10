package org.wcci.apimastery.Service;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.Entity.Album;

@Service
public class AlbumStorage {



    private AlbumRepository albumRepo;

    public AlbumStorage(AlbumRepository albumRepo) {
        this.albumRepo = albumRepo;
    }


    public void saveAlbum(Album album) {
        albumRepo.save(album);
    }

    public void deleteAlbumById(long id) {
        albumRepo.deleteById(id);
    }

    public Iterable<Album> getAllAlbums() {
        return albumRepo.findAll();
    }

    public Album retrieveAlbumById(long id) { return albumRepo.findById(id).get();
}
}

