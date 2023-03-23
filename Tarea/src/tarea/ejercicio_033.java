
package tarea;

import java.util.Scanner;

public class ejercicio_033 {
     public static void main(String[] args) {
         Scanner variable = new Scanner(System.in);
         
        double a,b,c;   
        int cat; 
        System.out.println("elija una de las opciones");
        System.out.println("1. superficie de un triangulo");
        System.out.println("2. area de un circulo");
        System.out.println("3. base de un triangulo");
        System.out.println("4. radio de un circulo");
      cat = variable.nextInt();

              switch (cat) {
                  case 1:
          System.out.println("ingrese la base del triangulo");
          a = variable.nextDouble();
          System.out.println("ingrese altura del triangulo");
          b = variable.nextDouble();
          
          c=a * b / 2;
           System.out.println("la superficie del triangulo es "+c);
                      break;
                      
                  case 2:
        System.out.println("ingrese la radio del circulo");
         a = variable.nextDouble();
         
         c= Math.PI*Math.pow(a, 2);
         System.out.println("la el area del circulo es "+c);
                      break;
                      
                  case 3:
          System.out.println("ingrese superficie del triangulo");
          a = variable.nextDouble();
          System.out.println("ingrese altura del triangulo");
          b = variable.nextDouble();
          
          c=a*2/b;
           System.out.println("la base del triangulo es "+c);
                      break;
                  case 4:
         System.out.println("ingrese el area circulo");
         a = variable.nextDouble();
         
         c= Math.sqrt(a/Math.PI);
         System.out.println("la radio del circulo es "+c);
                      break;
                  default:
                    System.out.println("ingrese una opcion correcta"); ;
              }
     }
}
