
package tarea;

import java.util.Scanner;


public class ejercicio_001 {
  public static void main(String[] args) {
      Scanner variable = new Scanner(System.in);
      System.out.println("ingrese el primer numero");
      String a = variable.nextLine();
      System.out.println("ingrese el segundo numero");
      String b = variable.nextLine();
      System.out.println("ingrese el tercer numero");
      String c = variable.nextLine();
      System.out.println("ingrese el cuarto numero");
      String d = variable.nextLine();
      System.out.println("el orden inverso de los numeros ingresados son");
      System.out.println(d + " " + c + " " + b + " " + a);
   }
}
