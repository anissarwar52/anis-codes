/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class CalculateAreas {
    
        // the required function
    static double[] func(GeometricShape[] shapes) {
        double[] Anis = new double[shapes.length];
        for(int i=0;i<shapes.length;i++) {
            if(shapes[i]!=null)
                Anis[i] = shapes[i].area();
        }
        return Anis;
    }
}
