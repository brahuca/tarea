
package tarea;

import java.util.Scanner;

public class ejercicio_014 {
     public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double n,a=0,b,p;
      System.out.println("escriba la cantidad de notas a ingresar");
      n = variable.nextInt();
      if(n>0){
          for ( int i=0;i<n; i++){
              System.out.println(" escriba la nota "+(i+1));
      b = variable.nextDouble();
      a= a + b;
          }
         p= a/n;
       System.out.println("el promedio es "+p);
       if(p>=8){
            System.out.println("el estudiante aprobo ");
       }else{ System.out.println("el estudiante reprobo ");}
      }else{System.out.println(" ingrese un numero de notas valido ");}
  
   }
}
