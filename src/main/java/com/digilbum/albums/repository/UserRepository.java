package com.digilbum.albums.repository;

import com.digilbum.albums.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}