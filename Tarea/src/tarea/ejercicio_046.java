
package tarea;

import java.util.Scanner;

public class ejercicio_046 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        int a,b,c,d,tf=0,hc=0,mv=0,tedad=0,tm=0,promedio;
        for (int i = 0; i < 20; i++) {
           System.out.println("ingrese la edad");
          a = variable.nextInt();  
          System.out.println("ingrese el estado civil");
          System.out.println("1. soltero");
          System.out.println("2. casado");
          System.out.println("3. viudo");
          b = variable.nextInt();
          System.out.println("ingrese el sexo");
          System.out.println("1. femenino");
          System.out.println("2. masculino");
          c = variable.nextInt();  
          System.out.println("ingrese el sueldo");
          System.out.println("1. menos de 1000");
          System.out.println("2. entre 1000 y 2500");
          System.out.println("3. mas de 2500");  
          d = variable.nextInt();  
          
          if(c==2){
          tf= tf +1 ;
          }
          if(b==2 && c==2 && d==3){
          hc= hc +1 ;
          }
          if(b==3 && c==1 && d==2 || d== 3 ){
          mv= mv +1 ;
          }
          if(c == 2 ){
          tedad= tedad+a;
          tm=tm+1;
          }
       
        }
        promedio=tedad/tm;
        
        System.out.println("total empleados femeninos "+tf);
        System.out.println("total hombres casados que ganan mas de 2500 "+hc);
        System.out.println("total mujeres viudas que ganan mas de 1000 "+mv);
        System.out.println("edad promedio de hombres "+promedio);
        
 

}
}
