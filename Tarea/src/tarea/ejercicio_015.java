
package tarea;

import java.util.Scanner;

public class ejercicio_015 {
     public static void main(String[] args) {
         Scanner variable = new Scanner(System.in);
         
        double n,a=0;
      System.out.println("ingrese el sueldo:");
      n = variable.nextDouble();
      if(n<1000){
          a=n*0.15;
          n=a+n;
          System.out.println("el nuevo sueldo es de: "+n);  
        }
  
   }
}
