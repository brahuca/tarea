
package tarea;

import java.util.Scanner;

 
public class ejercicio_044 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double a,b,c;
        
           System.out.println("ingrese tres numeros");
        a = variable.nextDouble(); 
        b = variable.nextDouble(); 
        c = variable.nextDouble(); 
      if(a != b && a!=c && b!=c ){
          if(a>b && a < c  || a<b && a>c ){
          System.out.println("el numero medio es "+a);
          }else{
         if(b>a && b < c  || b<a && b>c ){
             System.out.println("el numero medio es "+b);
         } else{
          System.out.println("el numero medio es "+c);
         }
          }
          
      }else{System.out.println("los numeros no son diferentes");}
        
 
          
        

}
}
