package ejercicio1;

public class Television extends Electrodomestico{
	double resolucion;
	boolean sintonizador_TDT;
	
	public Television() {
		this.resolucion = 20;
		this.sintonizador_TDT = false;
	}
	
	public Television(double precioBase, double peso) {
		this.peso = peso;
		this.precioBase = precioBase;
	}
	
	public Television(double preice, String colorB, char typeEle, 
			double weight, double resolucion, boolean sintonizador_TDT) {
		this.setPrecioBase(preice);
		this.setColor(checkColor(colorB));
		this.setConsumoEnerg(checkType(typeEle));
		this.setPeso(weight);
		this.setResolucion(resolucion);
		this.setSintonizador_TDT(sintonizador_TDT);
	}
	
	//---------------------------------------------------------------------
	@Override
	public double plusPrice() {
		double finalPrice = (int) getPrecioBase();
		switch (getConsumoEnerg()) {
		case 'a':
			finalPrice = finalPrice + 100;
			break;
		case 'b':
			finalPrice = finalPrice + 80;
			break;
		case 'c':
			finalPrice = finalPrice + 60;
			break;
		case 'd':
			finalPrice = finalPrice + 50;
			break;
		case 'e':
			finalPrice = finalPrice + 30;
			break;
		case 'f':
			finalPrice = finalPrice + 10;
			break;
		default:
			finalPrice = finalPrice + 10;
			break;
		}

		if (getPeso() < 20 || getPeso() >= 0) {
			if (getPeso() < 50 || getPeso() >= 20) {
				if (getPeso() < 79 || getPeso() >= 50) {
					if (getPeso() >= 80) {
						finalPrice = finalPrice + 100;
					} else {
						finalPrice = finalPrice + 80;
					}
				} else {
					finalPrice = finalPrice + 50;
				}
			} else {
				finalPrice = finalPrice + 10;
			}

		}
		
		if (isSintonizador_TDT()) {
			finalPrice = finalPrice + 50;
		}
		
		if (getResolucion() > 40) {
			double per;
			per = finalPrice * 0.3;
			finalPrice = finalPrice + per;
		}
		
		return finalPrice;
	}
	
	//---------------------------------------------------------------------

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizador_TDT() {
		return sintonizador_TDT;
	}

	public void setSintonizador_TDT(boolean sintonizador_TDT) {
		this.sintonizador_TDT = sintonizador_TDT;
	}
	
	
}
