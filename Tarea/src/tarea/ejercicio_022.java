
package tarea;

import java.util.Scanner;


public class ejercicio_022 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
       
        double b,c=0,p=0;
        String a;
      System.out.println("ingrese la matricula");
      a = variable.nextLine();
        for (int i = 0; i < 5; i++) {
             System.out.println("ingrese la nota "+(i+1));
      b = variable.nextDouble();
      c= c+b;
      p=c/5;
        }
         System.out.print("el alumno con matricula "+a+" con promedio "+p+" ");
   if(p>=6){
        System.out.println("aprobo");
   }else{
       System.out.println("no aprobo");
   }
      
     
     }
}
