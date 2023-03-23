
package tarea;

import java.util.Scanner;


public class ejercicio_019 {
     public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double n,t;
      System.out.println("escriba la cantidad de sonidos del grillo en 1 min");
      n = variable.nextDouble();
      
      t=n/4+40;
      System.out.println("la temperatura en Fahrenheit es "+t);
     }
}
