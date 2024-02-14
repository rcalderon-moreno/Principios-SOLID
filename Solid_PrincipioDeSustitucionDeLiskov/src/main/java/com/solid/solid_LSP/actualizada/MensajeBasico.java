
package com.solid.solid_LSP.actualizada;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public abstract class MensajeBasico {
        private String mensaje;
        private Date fechaHora;        
        
        public abstract void enviarMensajeAuditoria();        
        
        public String getMensaje() {
            return mensaje;
        }
        public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
            this.fechaHora= new Date();
        }
        public String MensajeFormateado(){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");        
            return dateFormat.format(fechaHora); 
        }
}

