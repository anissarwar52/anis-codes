/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Triangle implements GeometricShape {
        private double base;
    private double height;

    public Triangle(){

    }
    public Triangle(double b, double h){
        this.base = b;
        this.height = h;
    }


    public double getBase(){
        return base;
    }
    public void setBase(double b){
        base = b;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double h){
        height = h;
    }


    public double area(){
        return 0.5 * base * height;
    }

}
