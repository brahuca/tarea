
package tarea;

import java.util.Scanner;

public class ejercicio_029 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double a,b,par=0,impar=0,j=0;

      for (int i = 0; i < 270; i++) {
          a=(int)(Math.random()*10)+1;
          System.out.println(a);
          b=a;
          if(a % 2 ==0){
          par= par+b;
          }else{
              j=j+1;
           impar= impar+ b;
          }
     }
      impar=impar/j;
       System.out.println("la suma de los numeros pares es "+par);
       System.out.println("el promedio de los numeros impares es "+impar);
}
}
