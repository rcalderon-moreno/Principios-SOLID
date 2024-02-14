package com.solid.solid_isp.inicial.usuarios;

import com.solid.solid_isp.inicial.operaciones.Operaciones;

public class Usuario1 {
    private Operaciones operaciones;
    public Usuario1() {
        this.operaciones=new Operaciones();
        this.operaciones.operacionA();
    }
    
}
