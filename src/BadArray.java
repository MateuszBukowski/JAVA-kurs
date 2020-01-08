/**
 * 
 * Ten program powoduje błąd i wystąpienie awarii.
 * @author mateusz
 *
 */

public class BadArray 
{

	public static void main(String[] args) 
	{
		// Tworzenie tablicy trójelementowej.
		int[] numbers = { 1, 2, 3};

		// Próba odczytu danych spoza
		// granic tablicy.
		for (int i =0; i <= 3; i++)
			System.out.println(numbers[i]);
			
	}

}
