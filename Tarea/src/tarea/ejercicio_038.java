
package tarea;

import java.util.Scanner;


public class ejercicio_038 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double n;
       System.out.println("ingrese un numero mayor de 4");
      n= variable.nextDouble(); 
        if(n>4){
            for (int i = 5; i < n; i++) {
                if(i%4==0){
                 System.out.println("es multiplo de 4 :  "+i);   
                }
                
            }
        }else{
          System.out.println("numero menor de 4");  
        }

}
}
