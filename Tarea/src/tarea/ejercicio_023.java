
package tarea;

import java.util.Scanner;

public class ejercicio_023 {
  public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
       
        double a;
      System.out.println("ingrese un numero");
      a = variable.nextDouble();
     
      if(a>0){
          System.out.println("el numero es positivo");
      }else{
          if(a<0){
               System.out.println("el numero es negativo");
      }else{
               System.out.println("el numero es nulo");
      }}
     }
}
