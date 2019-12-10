/**
 * Program ilustruj� metood�, kt�ra przyjmuj� tablic� dwuwymiarrowa jako argument.
 * @author mateusz
 *
 */

public class Pass2Darray 
{

	public static void main(String[] args) 
	{

		int[][]numbers = { {1, 2, 3, 4}, 
				   {5, 6, 7, 8},
				   {9, 10, 11, 12}};
				   
		// Wy�wietlenie zawarto�ci tablicy.
		System.out.println("Oto warto�ci zapisane w tablicy:");
		showArray(numbers);
		
		// Wy�wietlenie zawarto�cic zapisanych w tablicy.
		System.out.println("Suma warto�ci wynosi " + arraySum(numbers) + ".");
	}
	
	/**
	 * Metoda showArray wy�wietla zawarto��
	 * tablicy dwuwymiarowej typu int.
	 * @param array Wy�wietlana tablica.                                                                                                                                      
	 */
	private static void showArray(int[][] array)
	{
		for (int row = 0; row < array.length; row++)
		{
			for (int col = 0; col < array[row].length; col++)
			{
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Metoda arraySum zwraca sum� warto�ci
	 * tablicy dwuwymiarowej typu int.
	 * @param array Sumowana tablica.
	 * @return Suma warto�ci element�w w tablicy.
	 */
	private static int arraySum(int[][] array)
	{
		int total = 0; // Akumulator.
		
		for (int row = 0; row < array.length; row++)
		{
			for (int col = 0; col < array[row].length; col++)
			{
				total += array[row][col];
			}
		}
		return total;
	}
	
}
