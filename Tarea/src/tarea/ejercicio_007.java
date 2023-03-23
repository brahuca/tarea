
package tarea;

import java.util.Scanner;


public class ejercicio_007 {
     public static void main(String[] args) {
         Scanner variable = new Scanner(System.in);
      System.out.println("ingrese la la base");
      int a = variable.nextInt();
      System.out.println("ingrese la altura");
      int b = variable.nextInt();
      int c = a * b / 2;
      System.out.println("la la superficie del triangulo es: " + c);
   }
}
