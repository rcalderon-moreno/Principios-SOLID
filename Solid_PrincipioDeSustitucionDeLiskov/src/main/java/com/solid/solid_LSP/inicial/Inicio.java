
package com.solid.solid_LSP.inicial;


public class Inicio {
    public static void main(String d[]){
        
        MensajeTextoLog mensajeTexto=new MensajeTextoLog();        
        mensajeTexto.setMensaje("mensaje a archivo de texto");
        
        MensajeBaseDatos mensajeBD=new MensajeBaseDatos();
        mensajeBD.setMensaje("mensaje a base de datos");
        
        Inicio.guardarMensajeLogTexto(mensajeTexto);
        
        Inicio.guardarMensajeBaseDatos(mensajeBD);       
        
    }   
    public static void guardarMensajeLogTexto(MensajeTextoLog mensaje){         
        mensaje.escribirMensajeLog();
    }
    public static void guardarMensajeBaseDatos(MensajeBaseDatos mensaje){        
        mensaje.escribirMensajeBaseDatos();
    }
}

