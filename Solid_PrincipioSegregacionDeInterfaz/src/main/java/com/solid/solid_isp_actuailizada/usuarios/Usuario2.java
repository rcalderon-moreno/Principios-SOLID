
package com.solid.solid_isp_actuailizada.usuarios;



import com.solid.solid_isp_actuailizada.operaciones.Operacion2;
import com.solid.solid_isp_actuailizada.operaciones.Operaciones;

public class Usuario2 {
    private Operacion2 operaciones;
    public Usuario2() {
        this.operaciones=new Operaciones();
        this.operaciones.operacionB();
    }
}
