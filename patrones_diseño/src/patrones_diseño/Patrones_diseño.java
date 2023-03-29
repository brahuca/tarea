
package patrones_diseño;

import java.util.Scanner;



public class Patrones_diseño {

    public static void main(String[] args) {

        single1 single = single1.getIntance();
        single.mensaje("hola");
        
      facade1 facade_1 = new facade1();
      facade_1.buscar("rojo", "circulo", "18cm");
 
     int a=0;
        Scanner b= new Scanner(System.in);
     
     factory objeto = new factory();
     a=b.nextInt();
     
      switch(a){
          case 1:
      objeto.factoria(1);        
          case 2:      
      objeto.factoria(2);          
          case 3:
      objeto.factoria(3);             
          default:
          System.out.println("elija una opcion valida");   
      }
      
    } 
}
