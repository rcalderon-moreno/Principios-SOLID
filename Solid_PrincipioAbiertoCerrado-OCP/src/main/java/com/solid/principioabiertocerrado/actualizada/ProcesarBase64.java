
package com.solid.principioabiertocerrado.actualizada;

public class ProcesarBase64 implements ProcesarDatos{
    
    private String texto;
    
    public ProcesarBase64(String texto) {
        this.texto=texto;
    }
    
    @Override
    public String procesar() {
        return("Base64 " + texto );
    }    
}


 