
package tarea;

import java.util.Scanner;


public class ejercicio_020 {
     public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double p,q,n;
      System.out.println("escriba el primer numero");
      p = variable.nextDouble();
      System.out.println("escriba el segundo numero");
      q = variable.nextDouble();
      n=Math.pow(p, 3)+Math.pow(q,4)-2*Math.pow(p,2);
      System.out.println("el resultado de la expresion es "+n);
      if(n<680){
       System.out.println("el resultado de la expresion cumple porque es menor a 680 ");
      }else{System.out.println("el resultado de la expresion no cumple porque es mayor a 680 ");
      }
     }
}
