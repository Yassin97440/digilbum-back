package com.digilbum.albums.services;

import com.digilbum.albums.models.Album;
import com.digilbum.albums.repository.AlbumRepository;
import com.digilbum.albums.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/picture")
public class PictureService {
    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    PictureRepository pictureRepository;

    @GetMapping("/hello")
    public @ResponseBody String helloWorld(){
        return "bouloubaka";
    }
    @CrossOrigin
    @PostMapping("/new")                      //@RequestParam List<File> pictures
    public @ResponseBody String addNewPicture( @RequestParam  AlbumJson data /*, @RequestParam(value = "startDate") LocalDate startDate      ,
                                               @RequestParam(value = "endDate") LocalDate endDate *//*@RequestParam Album album*/) {
//        System.out.println(album.getName()); "on instancie un album" +
        System.out.println( data.toString());
//        Album newAlbums = new Album();
//        newAlbums.setName(albumName);
//        newAlbums.setStartDate(startDate);
//        newAlbums.setEndDate(endDate);
        System.out.println("on va save notre album");
//        albumRepository.save(newAlbums);
//        for (File picture: pictures) {
//
//        }

        return "bouloubakashnikis";

    }
}
