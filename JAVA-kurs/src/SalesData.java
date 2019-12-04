/* Klasa ta przechowuje w tablicy warto�ci sprzeda�y z okre�lonej liczby dni 
 * i udost�pnia metody do pobierania sumy i �redniej warto�ci sprzeda�y, a tak�e 
 * najwy�szej i najni�szej warto�ci sprzeda�y. 
 */

public class SalesData {

	private double[] sales; // Dane sprzeda�owe.
	
	/**
	 * Konstruktor kopiuje elementy otrzymanej tablicy do tablicy sales.
	 * @param s Kopiowana tablica.
	 */
	public SalesData(double[] s)
	{
		// Tworzenie tablicy o wielko�ci r�wnej d lugo�ci tablicy
		sales = new double[s.length];
		
		// Kopiowanie element�w z tablicy s do tablicy sales.
		for (int index = 0; index < s.length; index++)
		{
			sales[index] = s[index];
		}
	}
		/**
		 * Metodda getTotal
		 * @return Suma warto�ci element�w tablicy sales.
		 */
	public double getTotal()
	{
		double total = 0.0; // Akumulator
		
		for (int index = 0; index < sales.length; index++)
		{
			total += sales[index];
		}
			
			// Zwaracanie sumy.
			return total;
	}
	
	/** 
	 * Metoda getAverage.
	 * @return �rednia warto�� element�w tablicy sales.
	 */
	public double getAverage()
	{
		return getTotal() / sales.length;
	}
		
	/**
	 * Metoda getHighest.
	 * @return Najwi�ksza warto�c przechowywana w tablicy sales.
	 */
	public double getHighest()
	{
		double highest = sales[0];
		
		for (int index = 0; index < sales.length; index++)
		{
			if (sales[index] > highest)
				highest = sales[index];
		}
		return highest;
	}
	
	/**
	 * Metoda getLowest.
	 * @return Najmniejsz� warto�c przechowywana w tablicy sales.
	 */
	public double getLowest()
	{
		double lowest = sales[0];
		
		for (int index = 0; index < sales.length; index++)
		{
			if (sales[index] < lowest)
				lowest = sales[index];
		}
		return lowest;
	}
	
	
}
	
