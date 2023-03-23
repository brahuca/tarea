
package tarea;

import java.util.Scanner;

public class ejercicio_006 {
      public static void main(String[] args) {
          Scanner variable = new Scanner(System.in);
      System.out.println("ingrese el costo del articulo");
      int a = variable.nextInt();
      System.out.println("ingrese el dinero entregado");
      int b = variable.nextInt();
      int c = a - b;
      System.out.println("la cantidad que se debe devolver es de " + c);
   }
}
