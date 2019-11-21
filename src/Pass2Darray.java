/**
 * Program ilustrujê metoodê, która przyjmujê tablicê dwuwymiarrowa jako argument.
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
				   
		// Wyœwietlenie zawartoœci tablicy.
		System.out.println("Oto wartoœci zapisane w tablicy:");
		showArray(numbers);
		
		// Wyœwietlenie zawartoœcic zapisanych w tablicy.
		System.out.println("Suma wartoœci wynosi " + arraySum(numbers) + ".");
	}
	
	/**
	 * Metoda showArray wyœwietla zawartoœæ
	 * tablicy dwuwymiarowej typu int.
	 * @param array Wyœwietlana tablica.                                                                                                                                      
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
	 * Metoda arraySum zwraca sumê wartoœci
	 * tablicy dwuwymiarowej typu int.
	 * @param array Sumowana tablica.
	 * @return Suma wartoœci elementów w tablicy.
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
