
package com.solid.principioresponsabilidadunica.inicial;


import java.sql.SQLException;


public class Solid_PrincipioResponsabilidadUnica {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        System.out.println("Inicio!");
        
        GestionarSolicitud  gestionarSolicitud=new GestionarSolicitud();
        
        gestionarSolicitud.gestionar("roger","1", "rcalderonmoreno@unillanos.edu.co");
        
        System.out.println("Fin!");
    }
}
