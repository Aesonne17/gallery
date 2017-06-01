package com.rest;

import com.entity_core.Album;
import com.jdbc_dao.AlbumDaoImpl;
import com.jdbc_dao.IAlbumDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping(value = "/album", method = RequestMethod.GET)
    public Album getAlbumById(@RequestParam(value="id", defaultValue="1") String id) {
        return new Album(new Long(id), 0l, "zzz");
    }

    /**
     * Service for uploading album's list
     * @return album list
     */
    @RequestMapping(value = "/albums", method = RequestMethod.GET)
    public List<Album> getAlbumsList() {
        IAlbumDao dao = new AlbumDaoImpl();
        return dao.getAlbums();
    }

}
