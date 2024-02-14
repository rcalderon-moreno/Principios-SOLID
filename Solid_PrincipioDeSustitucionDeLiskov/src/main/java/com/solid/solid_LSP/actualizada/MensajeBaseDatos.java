
package com.solid.solid_LSP.actualizada;


public class MensajeBaseDatos extends MensajeBasico {
    public void enviarMensajeAuditoria(){
            System.out.println("Escribiendo mensaje: "+ super.MensajeFormateado() +", en la Base de Datos.");
    };
    
}
