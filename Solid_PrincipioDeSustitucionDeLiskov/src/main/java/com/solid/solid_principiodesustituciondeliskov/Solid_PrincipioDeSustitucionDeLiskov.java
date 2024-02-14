

package com.solid.solid_principiodesustituciondeliskov;


public class Solid_PrincipioDeSustitucionDeLiskov {

    public static void main(String[] args) {
        
        Punto punto = obtenerPunto();        
        System.out.println("Valor módulo " + punto.modulo());
        System.out.println("Información: " + punto.toString());
        
    }
    
    public static Punto obtenerPunto() {
    
       // Punto punto =new Punto(1.0,1.0);
        
        
        Punto3D punto =new Punto3D(1.0,1.0);
        punto.setZ(1.0);
        
        return punto;
    
    }
    
}
