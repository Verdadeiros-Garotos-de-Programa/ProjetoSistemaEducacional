/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
     public static String URL =
            "jdbc:mysql://localhost:3306/sistema_escolar";
    public static String USUARIO="root";
    public static String SENHA="root";
    
    public static Connection conectar(){
        try{
            Connection conn =
                    DriverManager.getConnection(
                        URL,USUARIO,SENHA);
            System.out.println("Conectado");
            return conn;
        }catch(SQLException e){
            System.out.println("Erro na conexao: ");
            e.printStackTrace();
            return null;
        }
    }
}

    

