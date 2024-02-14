
package com.solid.principioabiertocerrado.actualizada;


public class ProcesarXML implements ProcesarDatos {
    
    private String texto;
    
    public ProcesarXML(String texto) {
        this.texto=texto;
    }
    
    @Override
    public String procesar() {
        return("XML " + texto );
    }    
}


