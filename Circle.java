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
public class Circle extends Abstructor{

   Circle(double a){
      super(a,a);
    }
   @Override
   void display(){
       double t = a*a;
         System.out.println("Circle = "+t);
   }
    
}
