
package com.solid.solid_principiodesustituciondeliskov;


public class Punto {
    
    protected double x;
    protected double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
    
    public double modulo(){
    
        return 0.0;
    }

    @Override
    public String toString() {
        return "Punto2D{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
}
