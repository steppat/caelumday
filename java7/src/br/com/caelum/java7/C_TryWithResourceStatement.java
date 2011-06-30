package br.com.caelum.java7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicReference;


public class C_TryWithResourceStatement {

    public static void main(String[] args) {

        //pre java7
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/db");
            System.out.println("usa a conexao");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally{
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
        
        
        //Java7 com AutoCloseable
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db")){
            System.out.println("usa a conexao");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
       
        //mostra try apenas
    }


}
