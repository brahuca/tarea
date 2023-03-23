
package tarea;

import java.util.Scanner;

public class ejercicio_039 {
public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double a,retencion=0,neto;
         System.out.println("ingrese el salario base");
          a = variable.nextDouble();
        
          if(a>3000){
          retencion=a *0.0745;
          }else{if(a>1500){
          retencion=a*0.0525;
          }else{
          }}
          neto=a-retencion;
          System.out.println("la retencion es: "+retencion);
          System.out.println("el salario neto es: "+neto);

}
}
