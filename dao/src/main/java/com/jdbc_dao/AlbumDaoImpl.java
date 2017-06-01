package com.jdbc_dao;

import com.entity_core.Album;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * JDBC-implementation dao-interface for albums
 * Created by Aesonne on 15.05.2017
 */
public class AlbumDaoImpl implements IAlbumDao {

    /**
     * Request to receive all albums
     * TODO: for one user
     */
    private static final String GET_ALBUMS = "SELECT * FROM albums";

    @Override
    public List<Album> getAlbums() {
        List<Album> albums = new ArrayList<>();
        try {
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/empDS");
            Connection connection = ds.getConnection();
            PreparedStatement ps = connection.prepareStatement(GET_ALBUMS);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Album album = new Album(rs.getLong("id"), rs.getLong("parentId"),
                        rs.getString("description"));
                albums.add(album);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return albums;
    }

}
