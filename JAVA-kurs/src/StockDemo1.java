/**
 * Ten program ilustruje dzia³anie
 * metody toString klasy Stock.
 * @author mateusz
 *
 */

public class StockDemo1 
{

	public static void main(String[] args) 
	{
		// Tworzenie obiektu typu Stock reprezentuj¹cego akcje firmy XYZ Company.
		// Symbol gie³dowy to XYZ, a aktualna 
		// cena akcji wynosi 9,62 z³otego.
		Stock xyzCompany = new Stock ("XYZ", 9.62);
		
		// Wyœwietlanie wartoœci z obiektu.
		System.out.println(xyzCompany);
	}
}
