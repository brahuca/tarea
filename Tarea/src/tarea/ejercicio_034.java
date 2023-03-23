
package tarea;

import java.util.Scanner;

public class ejercicio_034 {
     public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double a;
             System.out.println("ingrese el peso en libras");
      a= variable.nextDouble(); 

    a=a*0.453592;
    System.out.println("ingrese el peso en kilogramos es "+a);
     }
}
