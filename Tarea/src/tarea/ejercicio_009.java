
package tarea;

import java.util.Scanner;

public class ejercicio_009 {
     public static void main(String[] args) {
         Scanner variable = new Scanner(System.in);
      System.out.println("ingrese la cantidad de gasolina en galones");
      double a = (double)variable.nextInt();
      double b = a * 3.785D;
      double c = b * 4.5D;
      System.out.println("el precio que se debe pagar es de " + c);
   }
}
