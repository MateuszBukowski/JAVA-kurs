import java.util.Scanner;

/**
 * Ten program ilustruje dzia³anie tablicy dwuwymiarowej.
 * @author mateusz
 *
 */

public class CorpSales {

	public static void main(String[] args) {
		final int DIVS = 3;			// Trzy jednostki firmy.
		final int QTRS = 4;			// Cztery kwarta³y.
		double totalSales = 0.0;	// Akumulator.
		
		// Tworzenie tablicy do przechowywania danych
		// sprzeda¿owych ka¿dej jednostki z ka¿dego kwarta³u.
		double[][] sales = new double[DIVS][QTRS];
		
		// Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
		Scanner keyboard = new Scanner(System.in);
		
		// Wyœwietlanie wprowadzenia.
		System.out.println("Ten program oblicza ³¹czn¹ wartoœæ sprzeda¿y we wszystkich ");
		System.out.println("jednostkach firmy. Wprowadz nastêpuj¹ce dane sprzeda¿owe: ");
		
		// Pêtle zagnie¿d¿one s³u¿¹ce do zape³niania tablicy
		// kwartalnymi wartoœciami sprzeda¿y w ka¿dej jednostce.

		for (int div = 0; div < DIVS; div++)
		{
			for (int qtr = 0; qtr < QTRS; qtr++)
			{
				System.out.printf("Jednostka %d, kwarta³ %d: ", 
								  (div + 1), (qtr + 1));
				sales[div][qtr] = keyboard.nextDouble();
			}
			System.out.println(); // Wyœwietlenie pustego wiersza.
		}
		
		// Pêtle zagnie¿d¿one dodaj¹ce wszystkie elementy do tablicy.
		for (int div = 0; div < DIVS; div++)
		{
			for (int qtr = 0; qtr < QTRS; qtr++)
			{
				totalSales += sales[div][qtr];
			}
		}
		
		// Wyœwietlanie ³¹cznej wartoœci sprzeda¿y.
		System.out.printf("³¹czna wartoœæ sprzeda¿y to: %,.2f z³otego.\n", totalSales);
	}
}
