package br.com.ama.cgd.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {

    private static final String DRIVER = "PostgreSQL AMA";
    private static final String URL = "jdbc:postgresql://dumbo.db.elephantsql.com:5432/djtemsqn";
    private static final String USER = "djtemsqn";
    private static final String PASS = "WmPv-bZJMDP91seVEvWPEMJZ_F04Llmt";

    public Connection getConnection() {
        Connection con = null;
        try {
            //            String URL = "jdbc:postgresql://localhost:5432/AMA";
            //            String USER = "postgres";
            //            String PASS = "admin";
            con = DriverManager.getConnection(URL, USER, PASS);                        
        } catch (SQLException e) {
            System.out.print("Erro na criacao de conexao: " + e.getMessage());
        }
        return con;
    }
    
}