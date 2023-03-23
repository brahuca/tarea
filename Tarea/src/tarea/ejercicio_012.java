
package tarea;

import java.util.Scanner;

public class ejercicio_012 {
     public static void main(String[] args) {
         Scanner variable = new Scanner(System.in);
      System.out.println("ingrese el lado 1");
      double a = (double)variable.nextInt();
      System.out.println("ingrese el lado 2");
      double b = (double)variable.nextInt();
      System.out.println("ingrese el lado 3");
      double c = (double)variable.nextInt();
      double d = (a + b + c) / 2.0D;
      double e = Math.sqrt(d * (d - a) * (d - b) * d * c);
      System.out.println(" el area del triangulo es " + e);
   }
}
