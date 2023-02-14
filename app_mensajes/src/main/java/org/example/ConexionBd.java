package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBd {
    public Connection get_connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3310/mensajes_app","root","");
            if(connection != null){
                System.out.println("Conexión establecida");            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return connection;

    }
}
