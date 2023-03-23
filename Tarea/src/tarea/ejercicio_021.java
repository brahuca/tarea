
package tarea;

import java.util.Scanner;


public class ejercicio_021 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
       
        double a,b,c,x;
      System.out.println("escriba el valor de a");
      a = variable.nextDouble();
      System.out.println("escriba el valor de b");
      b = variable.nextDouble();
      System.out.println("escriba el valor de c");
      c = variable.nextDouble();
      x =   (-(b)+Math.sqrt(Math.pow(b,2)-(4*a*c))/(2*a));
      if(x>=0){
           System.out.println("el resultado 1 es: "+x);
          x =   (-b-Math.sqrt((Math.pow(b,2)-(4*a*c)))/(2*a));
           System.out.println("el resultado 2 es: "+x);
      }else{
           System.out.println("el valor de la raiz es negativa y no tiene solucion");
      }
     
     }
}
