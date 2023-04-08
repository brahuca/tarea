
import java.util.Scanner;


public class SOLID {
    public static int opcion=0;
    public static double base=0,altura=0,area=0;
       
    public static void main(String[] args) {
        ingreso();
        opcion();
        menu();
        resultado();
    }
    
    public static void ingreso(){
        Scanner b= new Scanner(System.in);
        System.out.println("ingrese la base");  
       base=b.nextInt();    
       System.out.println("ingrese la altura");  
        altura=b.nextInt();
         
    }
    public static void opcion(){
      Scanner b= new Scanner(System.in);
        System.out.println("ingrese que figura geometrica quiere sacar el area"); 
        System.out.println("1  rectangulo");  
        System.out.println("2 paralelogramo");  
        System.out.println("3 triangulo");  
       opcion=b.nextInt();

    }
    public static void menu( ){
    
        switch(opcion){
            case 1:
                rectangulo();  
                break;
             case 2:
                paralelogramo();  
                break;   
            case 3:
                triangulo();  
                break; 
            default:
                error();
        }  
    }  
    public static void rectangulo(){
    rectangulo_area(); 
    }
    public static void rectangulo_area(){
     area= base*altura;
    }
    public static void paralelogramo(){
    paralelogramo_area();
    }
    public static void paralelogramo_area(){
     area= base*altura;
    }
     public static void triangulo(){
    rectangulo_area();
    }
    public static void triangulo_area(){
     area= base*altura/2;
    } 
     public static void resultado(){
     System.out.println("el area es de "+area);   
     }
     public static void error(){
     System.out.println("opcion incorrecta");   
     }
}
