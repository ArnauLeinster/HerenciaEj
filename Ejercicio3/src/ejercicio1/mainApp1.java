/**
 * 
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author aitor arnau marc
 *
 */
public class mainApp1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			ArrayList<Electrodomestico> compraEle= createArray();
			seePrice(compraEle);
			
			
	}
	
	public static ArrayList<Electrodomestico> createArray()
	{
		ArrayList<Electrodomestico> list= new ArrayList<Electrodomestico>();
		list.add(new Television());
		list.add(new Lavadora(20,31));
		list.add(new Electrodomestico(76,"Azul",'a',180));
		list.add(new Television());
		list.add(new Television(180,10));
		list.add(new Lavadora());
		list.add(new Television(247,"Gris",'e',18,43.5,false));
		list.add(new Lavadora(50,"Rojo",'b',70,29));
		list.add(new Electrodomestico());
		list.add(new Electrodomestico(48,12));
		
		return list;
		
	}
	
	public static void seePrice(ArrayList<Electrodomestico> eleArr)
	{
		double precioEle=0;
		double precioTele=0;
		double precioLava=0;
		double actualPrice=0;
		Television tele=new Television();
		Lavadora lav= new Lavadora();
		
		Iterator<Electrodomestico> eleIter= eleArr.iterator();
		for(int i=0; i<10; i++)
		{
			Electrodomestico leTest=eleIter.next();
			actualPrice=leTest.plusPrice();
			System.out.println("El precio final del producto numero "+(i+1) +" es de "+actualPrice);
			if((leTest.getClass()==tele.getClass())&&(leTest.getClass()!=lav.getClass()))
			{
				precioTele=precioTele+actualPrice;
			
			}
			else if((leTest.getClass()!=tele.getClass())&&(leTest.getClass()==lav.getClass()))
			{
				precioLava=precioLava+actualPrice;
			}
			precioEle=precioEle+actualPrice;

		}
		System.out.println("Seran "+precioEle+" de todos los electrodomesticos "+precioLava+" por lavadoras y "+precioTele+" de televisores");
	}
}
