/**
 * Ten program umożliwia zakup akcji
 * firmy XYZ.
 * @author mateusz
 *
 */

public class StockTrader 
{

	public static void main(String[] args) 
	{
		int sharesToBuy; // Liczba kupowanych akcji.
		
		// Tworzenie obiektu typu Stock reprezentującego akcje firmy.
		// Symbol akcji to XYZ, a aktualna cena
		// wynosi 9,62 złotego za sztukę.
		Stock xyzCompany = new Stock("XYZ", 9.62);
		
		// Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
		Scanner keyboard = new Scanner(System.in);
		
		// Wyświetlanie aktualnej ceny akcji.
		System.out.printf("Akcje XYZ kosztują obecnie %,.2f złotego.\n",
							xyzCompany.getSharePrice());
		
		// Pobieranie liczby kupowanych akcji.
		System.out.print("Ile akcji chcesz kupić? ");
		sharesToBuy = keyboard.nextInt();
		
		// Tworzenie obiektu typu StockPurchase reprezentującego transakcję.
		StockPurchase buy =
				new StockPurchase(xyzCompany, sharesToBuy);
		
		// Wyświetlanie kosztów transakcji.
		System.out.printf("Cena zakupu: %,.2f", buy.getCost());
	}
}
