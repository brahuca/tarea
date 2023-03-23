
package tarea;

import java.util.Scanner;


public class ejercicio_032 {
     public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double a,j=0;
     System.out.println("ingrese un numero");
      a= variable.nextDouble(); 
    
         for (int i = 1; i < a; i++) {
           if(a % i == 0){
           j=j+1;
           }
         }
    if(j==1){
         System.out.println("el numero es primo ");
    }else{
         System.out.println("el numero no es primo ");
    }
     

}
}
