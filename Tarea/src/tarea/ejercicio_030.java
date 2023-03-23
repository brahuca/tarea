
package tarea;

import java.util.Scanner;

public class ejercicio_030 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double b=0,a=0,j=0;
             System.out.println("ingrese la cantidad de numeros");
      b= variable.nextDouble(); 

      for (int i = 0; i < b; i++) {
          j=j+1;
   a= Math.pow(j, j)+a;
      }
      System.out.println("el resultado de la serie de numeros es "+a);
     }
}
