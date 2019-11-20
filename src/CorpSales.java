import java.util.Scanner;

/**
 * Ten program ilustruje dzia�anie tablicy dwuwymiarowej.
 * @author mateusz
 *
 */

public class CorpSales {

	public static void main(String[] args) {
		final int DIVS = 3;			// Trzy jednostki firmy.
		final int QTRS = 4;			// Cztery kwarta�y.
		double totalSales = 0.0;	// Akumulator.
		
		// Tworzenie tablicy do przechowywania danych
		// sprzeda�owych ka�dej jednostki z ka�dego kwarta�u.
		double[][] sales = new double[DIVS][QTRS];
		
		// Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
		Scanner keyboard = new Scanner(System.in);
		
		// Wy�wietlanie wprowadzenia.
		System.out.println("Ten program oblicza ��czn� warto�� sprzeda�y we wszystkich ");
		System.out.println("jednostkach firmy. Wprowadz nast�puj�ce dane sprzeda�owe: ");
		
		// P�tle zagnie�d�one s�u��ce do zape�niania tablicy
		// kwartalnymi warto�ciami sprzeda�y w ka�dej jednostce.

		for (int div = 0; div < DIVS; div++)
		{
			for (int qtr = 0; qtr < QTRS; qtr++)
			{
				System.out.printf("Jednostka %d, kwarta� %d: ", 
								  (div + 1), (qtr + 1));
				sales[div][qtr] = keyboard.nextDouble();
			}
			System.out.println(); // Wy�wietlenie pustego wiersza.
		}
		
		// P�tle zagnie�d�one dodaj�ce wszystkie elementy do tablicy.
		for (int div = 0; div < DIVS; div++)
		{
			for (int qtr = 0; qtr < QTRS; qtr++)
			{
				totalSales += sales[div][qtr];
			}
		}
		
		// Wy�wietlanie ��cznej warto�ci sprzeda�y.
		System.out.printf("��czna warto�� sprzeda�y to: %,.2f z�otego.\n", totalSales);
	}
}
