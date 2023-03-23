
package tarea;

import java.util.Scanner;

public class ejercicio_011 {
     public static void main(String[] args) {
         Scanner variable = new Scanner(System.in);
      System.out.println("ingrese el numero de dias");
      double a = (double)variable.nextInt();
      double b = a * 86400.0D;
      System.out.println(" el numero de segundos en los dias ingresados es " + b);
   }
}
