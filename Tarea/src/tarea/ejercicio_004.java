
package tarea;

import java.util.Scanner;

public class ejercicio_004 {
     public static void main(String[] args) {
         Scanner variable = new Scanner(System.in);
      System.out.println("ingrese un numero");
      int a = variable.nextInt();
      if (a > 0) {
         double b = Math.pow((double)a, 2.0D);
         double c = Math.pow((double)a, 3.0D);
         System.out.println("el cuadrado del numero es " + b + " el cubo del numero es " + c);
      } else {
         System.out.println("el numero no es positivo");
      }

   }
}
