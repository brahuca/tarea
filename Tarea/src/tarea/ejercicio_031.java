
package tarea;

import java.util.Scanner;


public class ejercicio_031 {
     public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double a,b;
     System.out.println("ingrese un numero");
      a= variable.nextDouble(); 
      b=a;
      for (int i = 0; i < 3; i++) {  
       System.out.println("ingrese un numero");
      a= variable.nextDouble(); 
  if(a>b){
      b=a;  
          }
     }
      System.out.println("el numero mayor es "+b);
}
}