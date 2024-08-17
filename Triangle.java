/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstructor;

/**
 *
 * @author Hp
 */
public class Triangle extends Abstructor {

    /**
     *
     */

     
 Triangle(double a, double b){
      super(a,b);
    }
        
  
 

    @Override
    void display() {
         double t = 0.5*a*b;
         System.out.println("Triangle = "+t);
        
    }
    
}
