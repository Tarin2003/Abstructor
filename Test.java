
package abstructor;


public class Test implements Interface,Interface2 {
   
    @Override
         public int sum(int a,int b){
            return a+b;
         }
    @Override
   public int sub (int a, int b){
       return a-b;
   }
   
    @Override
   public int mult(int a, int b){
       return a*b;  
   }
    @Override
    public int div(int a, int b){
        
      return a/b; 
        
    }
    public static void main(String[] args) {
        Test ob = new Test();
        System.out.println(ob.sum(20, 10)); 
        System.out.println(ob.sub(20, 10)); 
        System.out.println(ob.mult(20, 10)); 
        System.out.println(ob.div(20, 10)); 
        
        
       
    }
    
}
