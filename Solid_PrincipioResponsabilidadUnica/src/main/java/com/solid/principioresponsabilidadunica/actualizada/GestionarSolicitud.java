
package com.solid.principioresponsabilidadunica.actualizada;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionarSolicitud {
    
    private BaseDeDatos accesoBaseDeDatos;

    public GestionarSolicitud(BaseDeDatos accesoBaseDeDatos){
        this.accesoBaseDeDatos=accesoBaseDeDatos;
        this.accesoBaseDeDatos.obtenerConexionBaseDeDatos();
    }
            
    public void gestionar(String usuario, String id, String email) throws SQLException 
    {
        
        String solicitud="";        
        String estadoSolicitud="";
        ResultSet resultSet;
        
        resultSet=this.accesoBaseDeDatos.ejecutarConsultaSQL(usuario, id);
        
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
