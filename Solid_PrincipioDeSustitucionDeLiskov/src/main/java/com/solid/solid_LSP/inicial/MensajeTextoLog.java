
package com.solid.solid_LSP.inicial;

public class MensajeTextoLog extends MensajeBasico {
    public void escribirMensajeLog(){
        System.out.println("Escribiendo mensaje: "+ super.MensajeFormateado() 
                            +", en el Log del sistema.");
    }
}
