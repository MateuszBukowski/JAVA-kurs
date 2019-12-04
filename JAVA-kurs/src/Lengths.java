/**
 * Program wyœwietla liczê wierszy i kolum tablicy dwuwymiarowej.
 * @author mateusz
 *
 */
                                                                                                                                                                                                                        
public class Lengths {

	public static void main(String[] args) {
		// Deklarowanie tablicy dwuwymiarowej o 3 wierszach i 4 kolumnach
		
		int[][]numbers = { {1, 2, 3, 4}, 
						   {5, 6, 7, 8},
						   {9, 10, 11, 12}};
						   
		// Wyœwietlenie liczby wierszy.
		System.out.println("Liczba wierszy wynosi " + numbers.length + " .");
		
		// Wyœwietlanie kolumn w ka¿dym wierszu.
		for (int index = 0; index < numbers.length; index++)
		{
			System.out.println("Liczba kolumn w wierszy nr. " + index + " wynosi " +
								numbers[index].length + " .");
		}
	}

}
