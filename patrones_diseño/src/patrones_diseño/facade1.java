

package patrones_diseño;

public class facade1 {
    private fecade2 fecade;

    public facade1() {
		 fecade = new fecade2();
	}
	
	public void buscar(String color, String figura, String tamaño) {
		fecade.buscarobjeto(color, figura, tamaño);
		
	}		      
}
