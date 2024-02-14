
package com.solid.solid_principioinversiondependencia.inicial;

import com.solid.solid_principioinversiondependencia.inicial.documentos.Documento;


public class Inicio {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Documento documento=new Documento();
        
        documento.setContenido("...texto...");
        documento.dibujar();
        documento.imprimir();
                
    }
    
}
