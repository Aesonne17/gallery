package com.rest;

import com.DbCreator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Spring configuration for web services
 * Created by Aesonne on 03.05.2017
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // TODO: change to correct boot way
        DbCreator dbCreator = new DbCreator();
        dbCreator.createDb();
        return builder.sources(Application.class);
    }

}
