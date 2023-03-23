
package tarea;

import java.util.Scanner;

public class ejercicio_010 {
     public static void main(String[] args) {
         Scanner variable = new Scanner(System.in);
      System.out.println("ingrese el radio");
      double a = (double)variable.nextInt();
      System.out.println("ingrese el volumen");
      double b = (double)variable.nextInt();
      double c = 3.141592653589793D * Math.pow(a, 2.0D) * b;
      double d = 6.283185307179586D * a * b;
      System.out.println(" el volumen es  " + c);
      System.out.println(" el area es  " + d);
   }
}
