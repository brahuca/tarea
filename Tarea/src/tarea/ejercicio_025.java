
package tarea;

import java.util.Scanner;


public class ejercicio_025 {
     public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double b;
        double a[] =new double[10];
         for (int i = 0; i < 10; i++) {
             System.out.println("ingrese el sueldo");
      b= variable.nextDouble(); 
            a[i]=b;
         }
          System.out.println("nombre       sueldo");
      for (int i = 0; i < 10; i++) {
             System.out.println("empleado "+(i+1)+"    "+a[i]);

         }
      
     }
}
