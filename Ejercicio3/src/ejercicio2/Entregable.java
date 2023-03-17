
package ejercicio2;

/**
 * @author aitor arnau marc
 *
 */
public interface Entregable {
	public void entregar();

	public void devolver();

	public boolean isEntregado();

	public void compareTo(Object a);

	public Object generador();

	public void entregados(Object a);
}
