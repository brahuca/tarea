
package tarea;

import java.util.Scanner;

public class ejercicio_013 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
      System.out.println("coordenada x1");
      double x1 = (double)variable.nextInt();
      System.out.println("coordenada y1");
      double y1 = (double)variable.nextInt();
      System.out.println("coordenada x2");
      double x2 = (double)variable.nextInt();
      System.out.println("coordenada y2");
      double y2 = (double)variable.nextInt();
      double a = Math.sqrt(Math.pow(x1 - x2, 2.0D) + Math.pow(y1 - y2, 2.0D));
      System.out.println(" la diferencia entre las 2 coordenadas es " + a);
   }
}
