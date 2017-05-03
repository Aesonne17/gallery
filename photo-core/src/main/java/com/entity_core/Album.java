package com.entity_core;

import java.math.BigInteger;
import java.util.List;

/**
 * Entity for album containing photos, other albums and additional information about the album
 * Created by Aesonne on 02.05.2017
 */
public class Album {

    /**
     * Identifier
     */
    private BigInteger id;

    /**
     * Identifiers of photos belonging to the album
     */
    private List<BigInteger> photoIds;

    /**
     * Identifiers of albums inside to the album
     */
    private List<BigInteger> albumsIds;

    /**
     * Description for album
     */
    private String description;

    public Album(BigInteger id, List<BigInteger> photoIds, List<BigInteger> albumsId, String description) {
        this.id = id;
        this.photoIds = photoIds;
        this.albumsIds = albumsId;
        this.description = description;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public List<BigInteger> getPhotoIds() {
        return photoIds;
    }

    public void setPhotoIds(List<BigInteger> photoIds) {
        this.photoIds = photoIds;
    }

    public List<BigInteger> getAlbumsIds() {
        return albumsIds;
    }

    public void setAlbumsIds(List<BigInteger> albumsIds) {
        this.albumsIds = albumsIds;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
