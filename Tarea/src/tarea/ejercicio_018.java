
package tarea;

import java.util.Scanner;


public class ejercicio_018 {
          public static void main(String[] args) {
         Scanner variable = new Scanner(System.in);
         
        double n,a=0;   
        int cat; 
        System.out.println("ingrese la categoria del trabajador:");
      cat = variable.nextInt();
      System.out.println("ingrese el sueldo:");
      n = variable.nextDouble();
    
              switch (cat) {
                  case 1:
          a=n*0.15;
          n=a+n;
          System.out.println("la categoria del trabajador es "+cat+" el nuevo sueldo es de: "+n);  
                      break;
                  case 2:
          a=n*0.10;
          n=a+n;
          System.out.println("la categoria del trabajador es "+cat+" el nuevo sueldo es de: "+n);  
                      break;
                  case 3:
          a=n*0.08;
          n=a+n;
          System.out.println("la categoria del trabajador es "+cat+" el nuevo sueldo es de: "+n);               
                      break;
                  case 4:
          a=n*0.07;
          n=a+n;
          System.out.println("la categoria del trabajador es "+cat+" el nuevo sueldo es de: "+n);              
                      break;
                  default:
                    System.out.println("ingrese una categoria correcta"); ;
              }
   }
}
