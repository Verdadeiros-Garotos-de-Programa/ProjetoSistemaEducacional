package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static final String URL = "jdbc:mysql://localhost:3306/db_gestao_escolar";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } 
        catch (ClassNotFoundException e) {
            throw new SQLException("Driver MySQL não encontrato!", e);
        }
    }          
}
