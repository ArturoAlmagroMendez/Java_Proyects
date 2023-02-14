package org.example;
import java.sql.Connection;
public class Main {
    public static void main(String[] args) {

        ConexionBd connection = new ConexionBd();

        try(Connection cnx = connection.get_connection()) {

        }catch(Exception e) {
            System.out.println(e);
        }
    }
}