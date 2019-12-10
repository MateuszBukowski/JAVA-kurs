/* Klasa ta przechowuje w tablicy wartoœci sprzeda¿y z okreœlonej liczby dni 
 * i udostêpnia metody do pobierania sumy i œredniej wartoœci sprzeda¿y, a tak¿e 
 * najwy¿szej i najni¿szej wartoœci sprzeda¿y. 
 */

public class SalesData {

	private double[] sales; // Dane sprzeda¿owe.
	
	/**
	 * Konstruktor kopiuje elementy otrzymanej tablicy do tablicy sales.
	 * @param s Kopiowana tablica.
	 */
	public SalesData(double[] s)
	{
		// Tworzenie tablicy o wielkoœci równej d lugoœci tablicy
		sales = new double[s.length];
		
		// Kopiowanie elementów z tablicy s do tablicy sales.
		for (int index = 0; index < s.length; index++)
		{
			sales[index] = s[index];
		}
	}
		/**
		 * Metodda getTotal
		 * @return Suma wartoœci elementów tablicy sales.
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
	 * @return Œrednia wartoœæ elementów tablicy sales.
	 */
	public double getAverage()
	{
		return getTotal() / sales.length;
	}
		
	/**
	 * Metoda getHighest.
	 * @return Najwiêksza wartoœc przechowywana w tablicy sales.
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
	 * @return Najmniejsz¹ wartoœc przechowywana w tablicy sales.
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
	
