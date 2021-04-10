package org.wcci.apimastery.Service;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.Entity.Artist;

@Service
public class ArtistStorage {


    private ArtistRepository artistRepo;

    public ArtistStorage(ArtistRepository artistRepo) {
        this.artistRepo = artistRepo;
    }


    public void saveArtist(Artist artist) {
        artistRepo.save(artist);
    }

    public void deleteArtistById(long id) {
        artistRepo.deleteById(id);
    }

    public Iterable<Artist> getAllArtists() {
        return artistRepo.findAll();
    }

    public Artist retrieveArtistById(long id) {
        return artistRepo.findById(id).get();
    }
}
