
package com.solid.solid_LSP.inicial;


public class MensajeBaseDatos extends MensajeBasico {
    public void escribirMensajeBaseDatos(){
        System.out.println("Escribiendo mensaje: "+ super.MensajeFormateado() 
                +", en la Base de Datos.");
    }    
}

