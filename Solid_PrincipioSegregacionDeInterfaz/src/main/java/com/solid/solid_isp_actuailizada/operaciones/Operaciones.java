
package com.solid.solid_isp_actuailizada.operaciones;


public class Operaciones implements Operacion1,Operacion2,Operacion3 {

    @Override
    public void operacionA() {
         System.out.println("Ejecutando Operación A.");    
    }

    @Override
    public void operacionB() {
        System.out.println("Ejecutando Operación B.")  ; 
    }

    @Override
    public void operacionC() {
      System.out.println("Ejecutando Operación C."); 
    }
    
}
