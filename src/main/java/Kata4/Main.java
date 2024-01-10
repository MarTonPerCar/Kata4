package Kata4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main (String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:chinook.db")){
            SqliteTrackLoader Tabla = new SqliteTrackLoader(connection);
            for (Track track : Tabla.loadsql()) {
                System.out.println(track);
            }
        }
    }
}
