
package com.solid.principioabiertocerrado.actualizada;

public class Inicio {
   
    public static void main(String[] args) {
   
        System.out.println("**************************************************");         
        Inicio.mostrarInforamcion(Inicio.fabricaObjetos());         
        System.out.println("**************************************************"); 
    }
    
    public static void mostrarInforamcion(ProcesarDatos procesardatos){
        
        System.out.println( "Texto en " + procesardatos.procesar() );
    }     
    /*
    El objeto que requerimos lo podemos indicar a través de un archivo de texto,
    puede ser un properties o json, por lo cual, no hay que recompilar la aplicación
    para hacer los cambios.
    */        
    public static ProcesarDatos fabricaObjetos(){          
        
        return new ProcesarBase64("texto");
    }
}
