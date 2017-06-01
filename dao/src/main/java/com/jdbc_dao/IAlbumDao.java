package com.jdbc_dao;

import com.entity_core.Album;

import java.util.List;

/**
 * Interface for working with albums in db
 * Created by Aesonne on 18.05.2017
 */
public interface IAlbumDao {

    /**
     * Load list of albums from db
     * @return albums
     */
    public List<Album> getAlbums();

}
