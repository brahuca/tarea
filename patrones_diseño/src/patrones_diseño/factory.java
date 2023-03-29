
package patrones_diseño;


public class factory {
    public void factoria(int objeto){
    if(objeto==1){
        factory_1.carro();
    }else{if(objeto==2){
      factory_2.avion();
    }else{
    }if(objeto==3){
    factory_3.barco();
    }}
    
    }
}
