
package com.solid.solid_LSP.actualizada;


public class MensajeTextoLog extends MensajeBasico {
    public void enviarMensajeAuditoria(){
            System.out.println("Escribiendo mensaje: "+ super.MensajeFormateado() +", en el Log del sistema");
    };
}
