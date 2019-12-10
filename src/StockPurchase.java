/**
 * Klasa StockPurchase reprezentuje zakup akcji.
 * @author mateusz
 *
 */

public class StockPurchase 
{
		private Stock stock; // Kupowane akcje.
		private int shares;  // Liczba kupowanych akcji.
		
		/**
		 * Konstruktor
		 * @param stockObject Kupowane akcje.
		 * @param numShares Liczba akcji. 
		 */
		public StockPurchase(Stock stockObject, int numShares)
		{
			// Tworzenie kopii obiektu wskazywanego
			// przez zmienną stockObject.
			stock = new Stock(stockObject);
			shares = numShares;
		}
		
		/**
		 * Metoda getStock.
		 * @return Kopia obiektu typu Stock reprezentującego
		 * kupowane akcje.
		 */
		public Stock getStock()
		{
			// Zwracanie kopii obiektu wskazywanego przez zmienną stock.
			return new Stock(stock);
		}
		
		/**
		 * Metoda getShares.
		 * @return Liczba kupowanych akcji.
		 */
		public int getShares()
		{
			return shares;
		}
		/**
		 * Metoda getCost.
		 * @return Cena kupowanych akcji.
		 */
		public double getCost()
		{
			return shares * stock.getSharePrice();
		}
	}
