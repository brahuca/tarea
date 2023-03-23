
package tarea;

import java.util.Scanner;


public class ejercicio_045 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double distancia,dias,precio,descuento=0;
         System.out.println("ingrese la distancia en kilometros");
          distancia = variable.nextDouble();
          System.out.println("ingrese el numero de dias de estancia");
          dias = variable.nextDouble();
          
          precio=distancia*0.75;
          if(distancia >= 800 && dias >= 7){
              descuento=precio*0.30;
          precio= precio-descuento;
          }
        System.out.println("el precio del pasaje es "+precio);
        

}
    
}
