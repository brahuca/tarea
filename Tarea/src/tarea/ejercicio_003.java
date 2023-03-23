
package tarea;

import java.util.Scanner;


public class ejercicio_003 {
     public static void main(String[] args) {
         Scanner variable = new Scanner(System.in);
      System.out.println("ingrese la primera calificacion");
      int a = variable.nextInt();
      System.out.println("ingrese la segundo calificacion");
      int b = variable.nextInt();
      System.out.println("ingrese la tercera calificacion");
      int c = variable.nextInt();
      System.out.println("ingrese la cuarta calificacion");
      int d = variable.nextInt();
      System.out.println("ingrese la quinta calificacion");
      int e = variable.nextInt();
      double promedio = (double)((a + b + c + d + e) / 5);
      System.out.println("el promedio es");
      System.out.println(promedio);
   }
}
