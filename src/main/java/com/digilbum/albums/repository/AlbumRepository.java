package com.digilbum.albums.repository;

import com.digilbum.albums.models.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Integer> {
}