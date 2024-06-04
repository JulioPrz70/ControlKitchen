package ControlKitchen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver"; //DRIVER QUE SE EMPLEA
    private static final String user = "root"; //NOMBRE DE USUARIO PARA CONEXION
    private static final String password = ""; //CONTRASEÑA
    private static final String url = "jdbc:mysql://localhost:3306/biblioteca"; //NOMBRE DE LA BASE DE DATOS
   
   //METODO CONEXION
    public Conexion() {
        conn = null;
        try{
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, password);
            if(conn != null){
                //System.out.println("Conexion Establecida");
            }
            
        } catch (ClassNotFoundException | SQLException e){
            System.out.println ("Error al conectar" + e);
            
        }
    }
    //este metodo nos retorna la conexion
    public Connection getConection(){
        return conn;
    }
    //con este metodo nos desconectamos de la base de datos
    public void desconectar(){
        conn = null;
        if(conn == null){
            System.out.println("Conexion terminada...");
        }
    }
}