/**
 * Program uzywa metody equals klasy Stock
 * do porównania dwóch obiektów typu Stock.
 * @author mateusz
 *
 */

public class StockCompare 
{
	public static void main(String[] args) 
	{
		// Tworzenie obiektów typu Stock o tych samych wartoœciach
		Stock company1 = new Stock("XYZ", 9.62);
		Stock company2 = new Stock("XYZ", 9.62);
		//Stock company3 = new Stock("XYZ", 9.62);
		
		// U¿ywanie metody equals do porównywania obiektów.
		if (company1.equals(company2))
			System.out.println("Obiekty s¹ takie same.");
		else
			System.out.println("Obiekty ró¿ni¹ siê od siebie.");
	}
}
