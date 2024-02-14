
package com.solid.principioresponsabilidadunica.actualizada;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BaseDeDatos {
     private String driver;
    private String url;
    private String user;
    private String passwd;
    private ResultSet resultSet;
    private Statement statement;
    private Connection conexion;   
    private PreparedStatement preparedStatement;

    public BaseDeDatos() throws SQLException, ClassNotFoundException {
        this.driver = "com.mysql.jdbc.Driver";
        this.url = "jdbc:mysql://localhost:3306/database";
        this.user = "usuario";
        this.passwd = "+Passswd+";          
        conexion = DriverManager.getConnection(url, user, passwd);
        statement=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion = DriverManager.getConnection(url, user, passwd);
        statement=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        
        
    }
    
    public Connection obtenerConexionBaseDeDatos(){
    
        return conexion;
    }
    
    public ResultSet ejecutarConsultaSQL(String usuario, String id) throws SQLException{
        
        String sql="select estado from solicitudes where usuario=? and id=?";
        
        this.preparedStatement=this.conexion.prepareStatement(sql);        
        this.preparedStatement.setString(1, usuario);
        this.preparedStatement.setString(2, id);
        
        
        return this.resultSet = this.preparedStatement.executeQuery();
        
        
        
    }
        
}
