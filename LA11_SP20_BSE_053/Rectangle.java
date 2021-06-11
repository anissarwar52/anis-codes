/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Rectangle implements GeometricShape{
    
    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    public void setLength(double l){
        this.length = l;
    }

    public void setWidth(double w){
        this.width = w;
    }

    public double area(){
        return length * width;
    }


}
