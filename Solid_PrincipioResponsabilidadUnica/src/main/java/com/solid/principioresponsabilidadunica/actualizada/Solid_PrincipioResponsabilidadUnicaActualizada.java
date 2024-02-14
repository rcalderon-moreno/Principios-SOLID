
package com.solid.principioresponsabilidadunica.actualizada;

import java.sql.SQLException;


public class Solid_PrincipioResponsabilidadUnicaActualizada {

    
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        BaseDeDatos conectarBaseDeDatos= new BaseDeDatos();
        
        System.out.println("Inicio!");        
        
        GestionarSolicitud gestionarSolicitud=new GestionarSolicitud(conectarBaseDeDatos);
        
        gestionarSolicitud.gestionar("roger","1", "rcalderonmoreno@unillanos.edu.co");
        
        System.out.println("Fin!");
    }
}
