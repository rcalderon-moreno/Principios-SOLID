
package com.solid.solid_isp.inicial.usuarios;

import com.solid.solid_isp.inicial.operaciones.Operaciones;

public class Usuario2 {
    private Operaciones operaciones;
    public Usuario2() {
        this.operaciones=new Operaciones();
        this.operaciones.operacionB();
    }
}
