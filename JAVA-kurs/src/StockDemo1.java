/**
 * Ten program ilustruje dzia�anie
 * metody toString klasy Stock.
 * @author mateusz
 *
 */

public class StockDemo1 
{

	public static void main(String[] args) 
	{
		// Tworzenie obiektu typu Stock reprezentuj�cego akcje firmy XYZ Company.
		// Symbol gie�dowy to XYZ, a aktualna 
		// cena akcji wynosi 9,62 z�otego.
		Stock xyzCompany = new Stock ("XYZ", 9.62);
		
		// Wy�wietlanie warto�ci z obiektu.
		System.out.println(xyzCompany);
	}
}
