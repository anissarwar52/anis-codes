/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Runner_Anis_Lab11 {
    
    public static void main(String[] args){
                GeometricShape[] shapes = new GeometricShape[3];

        shapes[0] = new Triangle(4.4, 4.6);
        shapes[1] = new Circle(10);
        shapes[2] = new Rectangle(5.2, 8.3);


        System.out.println("Area of Triangle, Circle and Rectangle respectively are: ");
        double areas[] = CalculateAreas.func(shapes);
        for(double x: areas) {
            System.out.println(x);
        }
    }
}
