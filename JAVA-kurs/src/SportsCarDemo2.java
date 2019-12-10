/**
 * Ten program pokazuje, ¿e mo¿na wykorzystaæ 
 * typ wyliczeniowy w instrukcji switch.
 * @author mateusz
 *
 */

public class SportsCarDemo2 
{

	public static void main(String[] args) 
	{
		// Tworzenie obiektu typu SportsCar.
		SportsCar yourNewCar = new SportsCar(CarType.PORSCHE,
											CarColor.CZERWONY, 100000);
		
		// Pobieranie marki samochodu i u¿ywanie jej w instrukcji switch.
		switch (yourNewCar.getMake())
		{
		case PORSCHE :
			System.out.println("Ten samochód wyprodukowano w Niemczech.");
			break;
		case FERRARI :
			System.out.println("Ten samochód wyprodukowano we W³oszech.");
			break;
		case JAGUAR :
			System.out.println("Ten samochód wyprodukowano w Anglii.");
			break;
		default:
			System.out.println("Nie jestem pewien, gdzie wyprodukowano "
								+ "ten samochód.");
		}
	}

}
