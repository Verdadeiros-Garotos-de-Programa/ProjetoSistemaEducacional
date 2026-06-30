package usuario;


public class Usuario {
 
    private int id_login;
    private String usuario;
    private String cargo;
    
    public Usuario (int id_login, String usuario, String cargo) {
        this.id_login = id_login;
        this.usuario = usuario;
        this.cargo = cargo;
    }
    
    public int getId() {
        return id_login;
    }
    
    public void setId(int id_login) {
        this.id_login = id_login;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    } 
}