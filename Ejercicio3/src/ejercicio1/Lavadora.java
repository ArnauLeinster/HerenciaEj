package ejercicio1;

public class Lavadora extends Electrodomestico {
	
	private int carga;

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public Lavadora()
	{
		this.carga=5;
	}
	public Lavadora(int priceOf,int weith)
	{
		this.precioBase=priceOf;
		this.carga=weith;
	}
	public Lavadora(double preice, String colorB, char typeEle, double weight, int charge)
	{
		super(preice,colorB,typeEle,weight);
		this.carga=charge;
	}
	@Override 
	public int plusPrice() {
		
		
	}

}
