/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Circle implements GeometricShape {
        private double radius;


    public Circle(){
    }

    public Circle(double r)
    {
        this.radius = r;
    }

    public void setRadius(double r){
        radius = r;
    }

    public double getRadius(){
        return radius;
    }


    public double area()
    {
        return radius * radius * Math.PI;
    }

}
