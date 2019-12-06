/**
 * Klasa Stock przechowywuje dane dotycz�ce akcji.
 * @author mateusz
 *
 */

public class Stock 
{
	private String symbol;		// Symbol gie�dowy.
	private double sharePrice; 	// Aktualna cena akcji.

	/**
	 * Konstruktor
	 * @param sym Symbol gie�dowy.
	 * @param price Cena akcji.
	 */
	public Stock(String sym, double price)
	{
		symbol = sym;
		sharePrice = price;
	}
	
	/**
	 * Metoda getSymbol.
	 * @return Symbol gie�dowy.
	 */
	public String getSymbol()
	{
		return symbol;
	}
	
	/**
	 * Metoda getSharePrice.
	 * @return Cena akcji.
	 */
	public double getSharePrice() 
	{
		return sharePrice;
	}
	
	/**
	 * Metoda toString.
	 * @return �a�cuch znak�w zawieraj�cy kod i cen� akcji.
	 */
	public String toString()
	{
		// Teorzenie �a�cucha znak�w opisuj�cego akcje.
		String str = "Symbol gie�dowy: " + symbol + 
					"\nCena akcji: " + sharePrice;
		return str;
	}
}

