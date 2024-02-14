package com.solid.principioresponsabilidadunica.inicial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class GestionarSolicitud {
    
    public void conectarBaseDeDatos() throws SQLException{
//        this.driver = "com.mysql.jdbc.Driver";
//        this.url = "jdbc:mysql://localhost:3306/database";
//        this.user = "usuario";
//        this.passwd = "passswd";        
//        conexion = DriverManager.getConnection(url, user, passwd);
//        statement=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    }
    
    public void gestionar(String usuario, String id, String email) throws SQLException, ClassNotFoundException {
        
        String driver;
        String url;
        String user;
        String passwd;
        ResultSet resultSet;
        Statement statement;
        Connection conexion;   
        PreparedStatement preparedStatement;
        
        String solicitud="";        
        String estadoSolicitud="";
                
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/database";
        user = "usuario";
        passwd = "+Passswd+";        
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion = DriverManager.getConnection(url, user, passwd);
        statement=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        String sql="select estado from solicitudes where usuario='"+ usuario +"' and id="+id;

        preparedStatement=conexion.prepareStatement(sql);        
        resultSet= preparedStatement.executeQuery();

        while(resultSet.next())        
             solicitud=resultSet.getString("estado");

        estadoSolicitud = switch (solicitud) {
            case "inicial" -> "Solicitud recibida en espera de iniciar procesamiento.";
            case "procesamiento" -> "Solicitud en estado de procesamiento.";
            case "finalizada" -> "Solicitud en estado de procesamiento.";                
            default -> "Solicitud no encontrada.";
        };
        
        this.enviarEmail(usuario, email, estadoSolicitud);
    }
    
    public void enviarEmail(String usuario,String email,String respuesta){
        System.out.println("Enviando mensaje a " + email + " con respuesta = " + respuesta);
    }
    public void validarSolicitud(){}
    public void notificarEstado(){}
}
