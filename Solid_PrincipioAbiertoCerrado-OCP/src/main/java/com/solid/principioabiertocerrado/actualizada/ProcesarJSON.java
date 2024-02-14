
package com.solid.principioabiertocerrado.actualizada;

public class ProcesarJSON implements ProcesarDatos {
    
    private String texto;
    
    public ProcesarJSON(String texto) {
        this.texto=texto;
    }
    
    @Override
    public String procesar() {
        return("JSON " + texto );
    }    
}


