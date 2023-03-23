
package tarea;

import java.util.Scanner;


public class ejercicio_048 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
       double peso,cantidad,a=0,b=0,c=0,d=0;
       System.out.println("ingresar la cantidad de alumnos ");
          cantidad = variable.nextDouble();
         
          for (int i = 0; i < cantidad; i++) {
              System.out.println("ingresar el peso ");
          peso = variable.nextDouble();
            if(peso < 40){
              a=a+1;
          }else{if(peso < 50){
              b=b+1;
          }else{if(peso < 60){
              c=c+1;
          }else{
          d=d+1;}
          }
        }}
            System.out.println("alumnos de menos de 40kg "+a);
            System.out.println("alumnos entre 40kg y 50kg  "+b);
            System.out.println("alumnos mas 50kg y menos de 60kg "+c);
            System.out.println("alumnos igual o mas de 60kg "+d);
    }
}
