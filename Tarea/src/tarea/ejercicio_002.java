
package tarea;

import java.util.Scanner;

public class ejercicio_002 {
       public static void main(String[] args) {
           Scanner variable = new Scanner(System.in);
      System.out.println("ingrese el primer numero");
      int a = variable.nextInt();
      System.out.println("ingrese el segundo numero");
      int b = variable.nextInt();
      double c = Math.pow((double)(a + b), 2.0D) / 3.0D;
      System.out.println("el resultado es");
      System.out.println(c);
   }
}
