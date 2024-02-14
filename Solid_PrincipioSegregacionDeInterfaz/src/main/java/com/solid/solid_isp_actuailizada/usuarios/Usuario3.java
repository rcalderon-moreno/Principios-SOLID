
package com.solid.solid_isp_actuailizada.usuarios;

import com.solid.solid_isp_actuailizada.operaciones.Operacion3;
import com.solid.solid_isp_actuailizada.operaciones.Operaciones;





public class Usuario3 {
    private Operacion3 operaciones;
    public Usuario3() {
        this.operaciones=new Operaciones();
        this.operaciones.operacionA();
        this.operaciones.operacionB();
        this.operaciones.operacionC();
    }
}
