package org.wcci.apimastery.Service;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.Entity.Song;

public interface SongRepository extends CrudRepository<Song, Long> {

}
