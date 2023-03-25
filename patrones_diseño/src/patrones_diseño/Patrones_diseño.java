
package patrones_diseño;



public class Patrones_diseño {

    public static void main(String[] args) {

        single1 single = single1.getIntance();
        single.mensaje("hola");
        
      facade1 facade_1 = new facade1();
      facade_1.buscar("rojo", "circulo", "18cm");
 
    } 
}
