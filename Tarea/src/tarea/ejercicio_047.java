
package tarea;

import java.util.Scanner;


public class ejercicio_047 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
       int dia,mes,año;
         System.out.println("ingresar el dia ");
          dia = variable.nextInt();
          System.out.println("ingrese el mes");
          mes = variable.nextInt();
          System.out.println("ingrese el año");
          año = variable.nextInt();
        
          if(dia > 1 || dia < 31){
              if(mes> 1 || mes< 12){
              dia=dia+1;
              if(dia>=32){
              dia=1;
              mes=mes+1;
              if(mes>=13){
                  mes=1;
                  año=año+1;
              }
              }
              System.out.println("la fecha del dia siguente es dia "+dia+" "+mes+" "+año);
              }else{
         System.out.println("fecha invalida"); }
         }else{
         System.out.println("fecha invalida"); }

}
}
