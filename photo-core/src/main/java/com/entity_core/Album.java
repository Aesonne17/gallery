package com.entity_core;

/**
 * Entity for album with all information about the album
 * Created by Aesonne on 02.05.2017
 */
public class Album {

    /**
     * Identifier
     */
    private Long id;

    /**
     * Identifier of parent album
     */
    private Long parentId;

    /**
     * Description for album
     */
    private String description;

    public Album(Long id, Long parentId, String description) {
        this.id = id;
        this.parentId = parentId;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
