package ejercicio5;
/**
 * @author aitor arnau marc
 *
 */
public abstract class Persona {
	String nombre;
	double edad;
	String sexo;
	boolean presente;

	protected abstract boolean novillo();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getEdad() {
		return edad;
	}

	public void setEdad(double edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}
	
	
	
}
