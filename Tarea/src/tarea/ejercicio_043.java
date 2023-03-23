
package tarea;

import java.util.Scanner;


public class ejercicio_043 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
       
        double n,m,media=0,a,t;
         System.out.println("ingrese la cantidad de alumnos");
          n= variable.nextDouble();
          System.out.println("ingrese la cantidad de notas");
          m = variable.nextDouble();
          
     for (int i = 1; i <= n; i++) {
        t=0;
            for (int j =1; j <= m; j++) {
          System.out.println("ingrese la cantidad de notas");
          a = variable.nextDouble();
          t=t+a;
          media=t/m;
            }   
           System.out.println("la media del"+i+" alumno es: "+media); 
        }
         
       

}
}
