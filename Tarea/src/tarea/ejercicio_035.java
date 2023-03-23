
package tarea;

import java.util.Scanner;


public class ejercicio_035 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double par=0,impar=0;
 
         for (int i = 1; i < 201; i++) {
           if(i % 2 == 0){    
           par=par+i;
           }else{
           impar=impar+i;
           }
         }
         System.out.println("la suma de los numeros par es:  "+par);
         System.out.println("la suma de los numeros impar es:  "+impar);
}
}
