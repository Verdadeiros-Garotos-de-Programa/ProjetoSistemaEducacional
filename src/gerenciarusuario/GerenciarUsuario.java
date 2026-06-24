package gerenciarusuario;

import conexao.Conexao;
import usuario.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GerenciarUsuario {
    
    public Usuario autenticar(String txtUsuario, String txtSenha) {
        String sql = "SELECT id_login, usuario, cargo FROM login WHERE usuario = ? AND senha = ?";
        
        try (Connection conn = Conexao.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
                    
                stmt.setString(1, txtUsuario);
                stmt.setString(2, txtSenha);
                
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        return new Usuario(rs.getInt("id_login"), rs.getString("usuario"), rs.getString("cargo"));
                    }
                }
        }
        catch (SQLException e) {
            System.err.println("Erro ao tentar autenticar no banco de dados.");
            e.printStackTrace();
        }
        return null;
    }
    public boolean cadastrarNovoUsuario(Usuario novoUsuario, String senhaDigitada) {
        String sql = "INSERT INTO usuarios (usuario, senha, cargo) VALUES (?, ?, ?)";
        
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, novoUsuario.getUsuario());
            stmt.setString(2, senhaDigitada);
            stmt.setString(3, novoUsuario.getCargo());
            
            int linhasAfetadas = stmt.executeUpdate();
            return linhasAfetadas > 0;    
        } 
        catch (SQLException e) {
            System.err.println("Erro ao tentar inserir novo usuário no banco de dados.");
            e.printStackTrace();
            return false;
        }
    }
}
