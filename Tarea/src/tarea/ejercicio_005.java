
package tarea;

import java.util.Scanner;

public class ejercicio_005 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
      System.out.println("ingrese la base");
      int a = variable.nextInt();
      System.out.println("ingrese la altura");
      int b = variable.nextInt();
      int c = a * b;
      int d = 2 * (a + b);
      System.out.println("la superficie del cuadradro es " + c);
      System.out.println("el perimetro del cuadrado es " + d);
   }
}
