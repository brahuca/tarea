
package tarea;

import java.util.Scanner;


public class ejercicio_041 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double a,spar=0,simpar=0,cpar=0,cimpar=0,media;
        
        for (int i = 0; i < 10; i++) {
     System.out.println("ingrese un numero");
      a = variable.nextDouble();  
        
      if(a==0){
          
      }else{
          if(a %2==0){
              spar=spar+a;
              cpar=cpar+1;
      }else{
              simpar=simpar+a;
              cimpar=cimpar+1;
      }}
        }
        media=simpar/cimpar;
      System.out.println("la suma de los pares es: "+spar);
     System.out.println("la cantidad de numeros par es: "+cpar);
     System.out.println("la media de los numeros impares es: "+media);
     }
}
