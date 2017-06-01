package com.rest;

import com.entity_core.Photo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Web service for working with photos
 * Created by Aesonne on 02.05.2017
 * TODO: just a stub
 */
@RestController
public class PhotoService {

    /**
     * Service for uploading photo by identifier
     * @param id album identifier
     * @return album
     */
    @RequestMapping(value = "/photo", method = RequestMethod.GET)
    public Photo getPhotoById(@RequestParam(value="id", defaultValue="1") String id) {
        return new Photo(new Long(id), 0l, "xxx", "".getBytes());
    }

}
