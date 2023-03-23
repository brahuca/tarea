
package tarea;

import java.util.Scanner;

public class ejercicio_027 {
     public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double b=0,c,a=0;
             System.out.println("ingrese la cantidad de numeros");
      b= variable.nextDouble(); 

      for (int i = 0; i < b; i++) {
             System.out.println("ingrese un numero");
      c= variable.nextDouble(); 
     if(c==0){
     a=a+1;}
         }
      System.out.println("la cantidad de veces que se repite el 0 es "+a);
      
     }
}
