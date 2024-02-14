
package com.solid.solid_principioinversiondependencia.actualizada;

import com.solid.solid_principioinversiondependencia.actualizada.documentos.Documento;
import com.solid.solid_principioinversiondependencia.actualizada.documentos.*;



public class Inicio {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Documento documento=generarDocumentos();
                
        documento.dibujar();
        documento.imprimir();
        
        
    }
    
    public static Documento generarDocumentos(){
        Documento documento;
        
//      documento=new DocumentoTexto();        
//      documento.setContenido("...texto...");
        documento=new DocumentoHtmlImp();            
        documento.setContenido("<HMTL></HMTL>");
//      documento=new DocumentoPdfImp();           
//      documento.setContenido("...PDF...PDF...PDF...");
        return documento;
    } 
    
}
