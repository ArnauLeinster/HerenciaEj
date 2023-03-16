/**
 * 
 */
package ejercicio6;

/**
 * @author aitor
 *
 */
public class Sala {
	
	static final int fil = 8;
	static final int colum = 9;
	
	int sala [][] = new int[fil][colum];
	
	private String posicion;
	private boolean isEnabled;
	
	
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public boolean isEnabled() {
		return isEnabled;
	}
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	

}
