import javax.swing.JOptionPane;

/**
 * Ten program pobiera wartoœci sprzeda¿y z tygodnia.
 * U¿ywana jest tu klasa SalesData do wyœwietlania sumy,
 * œredniej, najwy¿szej i najni¿szej wartoœci sprzeda¿y.
 * @author mateusz
 *
 */

public class Sales {

	public static void main(String[] args) {

		final int ONE_WEEK = 7; // Liczba elementów.
		
		// Tworzenie tablicy do przechowywania wartoœci 
		// sprzeda¿y z dni tygodnia.
		double[] sales = new double[ONE_WEEK];
		
		// Pobieranie wartoœci sprzeda¿y z tygodnia.
		getValues(sales);
		
		// Tworzenie obiektu typu SalesData zainicjowanego
		// danymi sprzeda¿owymi z okresu tygodnia.
		SalesData week = new SalesData(sales);
		
		// Wyœwietlanie sumy, œredniej, najwy¿szej i najni¿szej
		// wartoœci sprzeda¿y z okresu tygodnia.
		JOptionPane.showMessageDialog(null,
				String.format("Sprzeda¿ w sumie wynios³a %,.2f z³otych.\n" +
						"Œrednia sprzeda¿ w sumie wynios³a %,.2f z³otych.\n" +
						"Najwy¿sza wartoœæ sprzeda¿y wynios³a %,.2f z³otych.\n" +
						"Najni¿sza wartoœæ sprzeda¿y wynios³a %,.2f z³otych.\n",
						week.getTotal(),
						week.getAverage(),
						week.getHighest(),
						week.getLowest()));
		System.exit(0);
	}
	
	/**
	 * Metoda getValues wyœwietla proœbê o podanie wartoœci
	 * sprzeda¿y przypisywanych ka¿demu elementowi tablicy.
	 * @param array Tablica, w której zapisywane s¹ wartoœci.
	 */

	private static void getValues(double[] array)
	{
		String input; // Przechowywanie danych wejœciowych od u¿ytkownika.
		
		// Pobieranie wartoœci sprzeda¿y z ka¿dego dnia tygodnia.
		for (int i = 0; i < array.length; i++)
		{
			input = JOptionPane.showInputDialog("Podaj wartoœæ sprzeda¿y z dnia numer " + 
												(i + 1) + ":");
			array[i] = Double.parseDouble(input);		
		}
	}
}
