package com.entity_core;

/**
 * Entity for photo, contains all the necessary information in addition to the image itself
 * Created by Aesonne on 02.05.2017
 */
public class Photo {

    /**
     * Identifier
     */
    private Long id;

    /**
     * Album to which the photo belongs
     */
    private Long albumId;

    /**
     * Comment to photo
     */
    private String comment;

    /**
     * Image
     * TODO: decide the storage format
     */
    private byte[] img;

    public Photo(Long id, Long albumId, String comment, byte[] img) {
        this.id = id;
        this.albumId = albumId;
        this.comment = comment;
        this.img = img;
    }

    /**
     * Image
     */
    private byte[] image;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
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
