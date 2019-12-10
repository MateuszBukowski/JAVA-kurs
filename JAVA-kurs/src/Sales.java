import javax.swing.JOptionPane;

/**
 * Ten program pobiera warto�ci sprzeda�y z tygodnia.
 * U�ywana jest tu klasa SalesData do wy�wietlania sumy,
 * �redniej, najwy�szej i najni�szej warto�ci sprzeda�y.
 * @author mateusz
 *
 */

public class Sales {

	public static void main(String[] args) {

		final int ONE_WEEK = 7; // Liczba element�w.
		
		// Tworzenie tablicy do przechowywania warto�ci 
		// sprzeda�y z dni tygodnia.
		double[] sales = new double[ONE_WEEK];
		
		// Pobieranie warto�ci sprzeda�y z tygodnia.
		getValues(sales);
		
		// Tworzenie obiektu typu SalesData zainicjowanego
		// danymi sprzeda�owymi z okresu tygodnia.
		SalesData week = new SalesData(sales);
		
		// Wy�wietlanie sumy, �redniej, najwy�szej i najni�szej
		// warto�ci sprzeda�y z okresu tygodnia.
		JOptionPane.showMessageDialog(null,
				String.format("Sprzeda� w sumie wynios�a %,.2f z�otych.\n" +
						"�rednia sprzeda� w sumie wynios�a %,.2f z�otych.\n" +
						"Najwy�sza warto�� sprzeda�y wynios�a %,.2f z�otych.\n" +
						"Najni�sza warto�� sprzeda�y wynios�a %,.2f z�otych.\n",
						week.getTotal(),
						week.getAverage(),
						week.getHighest(),
						week.getLowest()));
		System.exit(0);
	}
	
	/**
	 * Metoda getValues wy�wietla pro�b� o podanie warto�ci
	 * sprzeda�y przypisywanych ka�demu elementowi tablicy.
	 * @param array Tablica, w kt�rej zapisywane s� warto�ci.
	 */

	private static void getValues(double[] array)
	{
		String input; // Przechowywanie danych wej�ciowych od u�ytkownika.
		
		// Pobieranie warto�ci sprzeda�y z ka�dego dnia tygodnia.
		for (int i = 0; i < array.length; i++)
		{
			input = JOptionPane.showInputDialog("Podaj warto�� sprzeda�y z dnia numer " + 
												(i + 1) + ":");
			array[i] = Double.parseDouble(input);		
		}
	}
}
