
package tarea;

import java.util.Scanner;

public class ejercicio_028 {
     public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);

        int b=0;
             System.out.println("ingrese la cantidad de numeros");
      b= variable.nextInt(); 
     double a[] =new double[b];
     double c[] =new double[b];
      for (int i = 0; i < b; i++) {
             System.out.println("ingrese un numero");
      a[i]= variable.nextDouble(); 
      c[i]= Math.pow(a[i], 3);
     }
      
         for (int i = 0; i < b; i++) {
               System.out.println("el cubo de "+a[i]+" es "+c[i]);
         }
}
}