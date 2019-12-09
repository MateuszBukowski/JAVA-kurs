/**
 * Ten program ilustruje dzia³anie klasy SportsCar.
 * @author mateusz
 *
 */

public class SportsCarDemo 
{
	public static void main(String[] args) 
	{
		// Tworzenie obiektu typu SportsCar.
		SportsCar yourNewCar = new SportsCar(CarType.PORSCHE,
											CarColor.CZERWONY, 100000);
		
		// Wyœwietlanie wartoœci obiektu.
		System.out.println(yourNewCar);
	}
}
