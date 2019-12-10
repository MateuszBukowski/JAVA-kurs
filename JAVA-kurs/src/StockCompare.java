/**
 * Program uzywa metody equals klasy Stock
 * do por�wnania dw�ch obiekt�w typu Stock.
 * @author mateusz
 *
 */

public class StockCompare 
{
	public static void main(String[] args) 
	{
		// Tworzenie obiekt�w typu Stock o tych samych warto�ciach
		Stock company1 = new Stock("XYZ", 9.62);
		Stock company2 = new Stock("XYZ", 9.62);
		//Stock company3 = new Stock("XYZ", 9.62);
		
		// U�ywanie metody equals do por�wnywania obiekt�w.
		if (company1.equals(company2))
			System.out.println("Obiekty s� takie same.");
		else
			System.out.println("Obiekty r�ni� si� od siebie.");
	}
}
