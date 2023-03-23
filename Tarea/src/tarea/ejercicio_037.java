
package tarea;

import java.util.Scanner;

public class ejercicio_037 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double precio,cantidad,d=0,t,iva,total;
        String articulo;
 
        System.out.println("ingrese el articulo");
      articulo=variable.nextLine(); 
      System.out.println("ingrese el precio del articulo");
      precio= variable.nextDouble(); 
      System.out.println("ingrese la cantidad a comprar");
      cantidad= variable.nextDouble(); 
      
      t=cantidad* precio;
      iva=t*0.12;

      if(t>100){
          d=t*0.07;
      }
        total=t+iva-d;
         System.out.println("el articulo  "+articulo);
         System.out.println("con un precior por unidad de: "+precio+" y una cantidad a comprar de "+cantidad);
         System.out.println("total "+t);
         System.out.println("ival "+iva);
         System.out.println("descuento "+d);
         System.out.println("total a pagar "+total);
}
}
