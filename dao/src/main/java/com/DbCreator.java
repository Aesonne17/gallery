package com;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Class for creation db on server's start
 * Created by Aesonne on 15.05.2017
 */
public class DbCreator {

    /**
     * Creates schema for db and load demo data
     * TODO: need logging
     */
    public void createDb() {
        Connection connection = null;
        try {
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/empDS");
            connection = ds.getConnection();
            executeScript("db-scheme.sql", connection);
            executeScript("demo-data.sql", connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Load script from jar's resources to string and execute it
     * @param fileName   script file name
     * @param connection connection to db
     * TODO: need logging
     */
    private void executeScript(String fileName, Connection connection) {
        try {
            URL url = getClass().getClassLoader().getResource(fileName);
            if (url == null) {
                return;
            }
            // read the founded resource
            URI uri = url.toURI();
            Map<String, String> env = new HashMap<>();
            env.put("create", "true");
            FileSystem zipfs = FileSystems.newFileSystem(uri, env);
            String query = new String(Files.readAllBytes(Paths.get(uri)));
            zipfs.close();
            // execute script
            PreparedStatement ps = connection.prepareStatement(query);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
