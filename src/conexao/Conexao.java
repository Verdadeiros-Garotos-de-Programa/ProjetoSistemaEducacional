package conexao;

<<<<<<< HEAD
=======
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
>>>>>>> 39e77be27c605ce9cdf9cc167e0a75d1c305e705

public class Conexao {

        }
    
<<<<<<< HEAD

    

=======
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
>>>>>>> 39e77be27c605ce9cdf9cc167e0a75d1c305e705
