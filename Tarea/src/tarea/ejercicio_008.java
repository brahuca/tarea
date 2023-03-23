
package tarea;

import java.util.Scanner;

public class ejercicio_008 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
      System.out.println("ingrese el nombre del dinosaurio");
      String dino = variable.nextLine();
      System.out.println("ingrese el peso en libras");
      int a = variable.nextInt();
      System.out.println("ingrese la longitud en pies ");
      int b = variable.nextInt();
      double c = (double)a * 2204.62D;
      double d = c * 1000.0D;
      double e = (double)b * 0.3047D;
      System.out.println("el nombre es " + dino + " su peso en kilogramos es " + d + " su longitud en metros es " + e);
   }
}
