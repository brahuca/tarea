
package tarea;

import java.util.Scanner;


public class ejercicio_036 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double a=0,mayor=0,menor=0;
        while(a==0){
         System.out.println("ingrese un numero ");
         a= variable.nextDouble(); 
          mayor=a;
          menor=a;  
         }
        while (a!=-99) {            
         System.out.println("ingrese un numero ");
         a= variable.nextDouble();
         if(a!=0){
         if(a>mayor){
             mayor=a;
        }}}
         System.out.println("el numero mayor es:  "+mayor);
}
        }

