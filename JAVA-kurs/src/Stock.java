/**
 * Klasa Stock przechowywuje dane dotycz¹ce akcji.
 * @author mateusz
 *
 */

public class Stock 
{
	private String symbol;		// Symbol gie³dowy.
	private double sharePrice; 	// Aktualna cena akcji.

	/**
	 * Konstruktor
	 * @param sym Symbol gie³dowy.
	 * @param price Cena akcji.
	 */
	public Stock(String sym, double price)
	{
		symbol = sym;
		sharePrice = price;
	}
	
	/**
	 * Metoda getSymbol.
	 * @return Symbol gie³dowy.
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
	 * @return £añcuch znaków zawieraj¹cy kod i cenê akcji.
	 */
	public String toString()
	{
		// Teorzenie ³añcucha znaków opisuj¹cego akcje.
		String str = "Symbol gie³dowy: " + symbol + 
					"\nCena akcji: " + sharePrice;
		return str;
	}
}

