package com.rest;

import com.entity_core.Album;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Web service for working with albums
 * Created by Aesonne on 02.05.2017
 * TODO: just a stub
 */
@RestController
public class AlbumService {

    /**
     * Service for uploading album by identifier
     * @param id album identifier
     * @return album
     */
    @RequestMapping("/album")
    public Album getAlbumById(@RequestParam(value="id", defaultValue="1") String id) {
        return new Album(new BigInteger(id), new ArrayList<BigInteger>(), new ArrayList<BigInteger>(), "zzz");
    }

    /**
     * Service for uploading album's list
     * @return album list
     */
    @RequestMapping("/albums")
    public List<Album> getAlbumsList() {
        List<Album> result = new ArrayList<Album>();
        result.add(new Album(BigInteger.ONE, new ArrayList<BigInteger>(), new ArrayList<BigInteger>(), "zzz"));
        result.add(new Album(BigInteger.TEN, new ArrayList<BigInteger>(), new ArrayList<BigInteger>(), "nnn"));
        return result;
    }

}
