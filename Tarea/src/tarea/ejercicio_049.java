
package tarea;

import java.util.Scanner;

public class ejercicio_049 {
     public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double a,b,ca,cb,i=0;
         System.out.println("ingrese la poblacion de a");
          a= variable.nextDouble();
          System.out.println("ingrese la poblacion de b");
          b= variable.nextDouble();
          if(a<b){
              while(a<b){
                  System.out.println("poblacion de A    "+a+"    B    "+b+"    en el año "+i);
                  ca=a*0.06;
                  a=a+ca;
                  cb=b*0.03;
                  b=b+cb;
                 i++;
              }
              System.out.println("en el año "+i+"    A     "+a+"    supero B    "+b);
          }else{System.out.println("la poblacion de a tiene que se menor a b");}
} 
}
