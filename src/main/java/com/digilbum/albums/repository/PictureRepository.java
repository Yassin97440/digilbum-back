package com.digilbum.albums.repository;

import com.digilbum.albums.models.Picture;
import org.springframework.data.repository.CrudRepository;

public interface PictureRepository extends CrudRepository<Picture, Integer> {
}