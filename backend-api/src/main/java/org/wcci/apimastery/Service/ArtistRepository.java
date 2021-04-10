package org.wcci.apimastery.Service;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.Entity.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long> {

}
