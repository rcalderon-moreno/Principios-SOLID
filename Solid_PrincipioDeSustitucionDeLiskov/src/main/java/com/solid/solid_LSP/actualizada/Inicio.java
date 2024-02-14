
package com.solid.solid_LSP.actualizada;


public class Inicio {

    public static void main(String d[]){
        
        MensajeBasico mensaje=new MensajeTextoLog();        
        mensaje.setMensaje("mensaje a archivo de texto");
        Inicio.guardarMensaje(mensaje);
        
        mensaje=new MensajeBaseDatos();
        mensaje.setMensaje("mensaje a base de datos");
        Inicio.guardarMensaje(mensaje);
    }    
    
    public static void guardarMensaje(MensajeBasico mensaje){
        mensaje.enviarMensajeAuditoria();
    }    
}


