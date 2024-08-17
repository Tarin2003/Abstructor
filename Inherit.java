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
public class Inherit implements Interface,Interface2 {
    double a,b,c;
    Inherit(double a, double b){
        this.a = a;
        this.b = b;
        
    }
@Override
public void display(){
    System.out.println("Ummehuny");
     c =0.5 *a*b;
    System.out.println(c);
    c = 3.1416*a*a;
        System.out.println(c);
    
    
    



}
public void display2(){
    System.out.println("name");
    
}

    
}
