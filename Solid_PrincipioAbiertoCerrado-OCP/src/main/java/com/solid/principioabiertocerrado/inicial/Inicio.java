
package com.solid.principioabiertocerrado.inicial;


public class Inicio {
 
    public static void main(String[] args) {
        
        ProcesarInformacion procesarInformacion = new ProcesarInformacion();
        
        System.out.println("**************************************************"); 
        
        System.out.println("Texto en " + procesarInformacion.toXML("texto"));
        System.out.println("Texto en " + procesarInformacion.toJSON("texto"));
        System.out.println("Texto en " + procesarInformacion.toBase64("texto"));
        
        System.out.println("**************************************************"); 
    }
    
}

