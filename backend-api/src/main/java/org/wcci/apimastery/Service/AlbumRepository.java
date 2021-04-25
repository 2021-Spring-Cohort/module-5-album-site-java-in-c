package org.wcci.apimastery.Service;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.Entity.Album;

public interface AlbumRepository extends CrudRepository<Album, Long> {


}