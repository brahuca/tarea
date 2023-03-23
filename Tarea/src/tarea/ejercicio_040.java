
package tarea;

import java.util.Scanner;

public class ejercicio_040 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double a,b,n,x,y=0;
         System.out.println("ingrese la cantidad de sucesiones");
          n = variable.nextDouble();
          System.out.println("ingrese el valor de a");
          a = variable.nextDouble();
          System.out.println("ingrese elvalor de b");
          b = variable.nextDouble();
          
          if((Math.pow(a, 2)-Math.pow(b, 2))>0){  
          x=a+b;
          }else{if((Math.pow(a, 2)-Math.pow(b, 2))==0){
          x=a-2*b;
          }else{
          x=a+b-5;
          }}
          
          for(int i=1;i<=n;i++){
              y=y+i*x;
          }
          System.out.println("el total de la sumatoria es: "+y);
}
}
