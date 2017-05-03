package com.entity_core;

import java.math.BigInteger;
import java.util.List;

/**
 * Entity for photo, contains all the necessary information in addition to the image itself
 * Created by Aesonne on 02.05.2017
 */
public class Photo {

    /**
     * Identifier
     */
    private BigInteger id;

    /**
     * List of albums to which the photo belongs
     */
    private List<BigInteger> albumIds;

    /**
     * Comment to photo
     */
    private String comment;

    /**
     * Image
     */
    private byte[] img;

    public Photo(BigInteger id, List<BigInteger> albumIds, String comment, byte[] img) {
        this.id = id;
        this.albumIds = albumIds;
        this.comment = comment;
        this.img = img;
    }

    /**
     * Image
     */
    private byte[] image;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public List<BigInteger> getAlbumIds() {
        return albumIds;
    }

    public void setAlbumIds(List<BigInteger> albumIds) {
        this.albumIds = albumIds;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

}
