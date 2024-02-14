
package com.solid.solid_principiodesustituciondeliskov;


public class Punto3D extends Punto{    
    protected double z;

    public Punto3D(double x, double y) {
        super(x, y);        
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    
    
    
    @Override
    public double modulo(){    
        return -1.0;
    }

    @Override
    public String toString() {
        return  super.toString() + "Punto3D{" + "z=" + z + '}';
    }
    
    
}
