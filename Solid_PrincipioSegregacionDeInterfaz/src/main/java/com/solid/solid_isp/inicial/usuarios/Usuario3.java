
package com.solid.solid_isp.inicial.usuarios;


import com.solid.solid_isp.inicial.operaciones.Operaciones;



public class Usuario3 {
    private Operaciones operaciones;
    public Usuario3() {
        this.operaciones=new Operaciones();
        this.operaciones.operacionA();
        this.operaciones.operacionB();
        this.operaciones.operacionC();
    }
}
