package database;

import java.io.File;
import java.io.FileNotFoundException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by luiscosta on 3/29/17.
 */
public class PeerMetadata {

    private Connection conn;
    private String dbPath;


    /**
     * Constructor
     *
     */
    public PeerMetadata (String name, String folder) throws FileNotFoundException{

        File dbDir = new File(folder);

        if(dbDir.isDirectory() && dbDir.exists()) { //confirms the database directory exists
            if(folder.charAt(folder.length() - 1 ) == '/') { //checks if the directory ends in /
                this.dbPath = folder + name;

            }
            else {
                this.dbPath = folder + '/' + name; //if not adds it in the end of the folder pah
            }

        }

        //Connection

        try {
            Class.forName("org.sqlite.JDBC");
            this.conn = DriverManager.getConnection("jdbc:sqlite:" + this.dbPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
