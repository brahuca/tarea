
package patrones_diseño;

public class single1 {
 
    private static single1 log;
    private single1(){
        
        
     }
   public static single1 getIntance(){
   if(log ==null ){
       log =new single1();
       
   }
   return log;
   }
   public void mensaje(String A){
   System.out.println(A);
   }
}
    
