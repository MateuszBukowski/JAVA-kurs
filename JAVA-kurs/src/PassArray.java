import java.util.Scanner;


/* Program ilustruje przekazywanie tablicy jako argumentu metody.
		 *  
		 */
		
public class PassArray {

	public static void main(String[] args) {
	
		final int ARRAY_SIZE = 4; // Wielko�� tablicy.
		
		// Tworzenie tablicy.
		int[] numbers = new int[ARRAY_SIZE];
		
		// Przekazywanie tablicy do metody getValues.
		getValues(numbers);
		
		System.out.println("Oto podane liczby: ");
		
		// Przekazywanie tablicy do metody. showArray.
		showArray(numbers);
	}
		/**
		 * Metoda getValues przyjmuj� jako argument rerencj� do tablicy.
		 * Uzytkownik ma poda� warto�� ka�dego elementu tej tablicy.
		 * @param array Referencja do tablicy.
		 */
	private static void getValues(int[] array)
	{
		// Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Podaj seri� " + array.length + " liczb.");
		
		// Wczytanie warto��i do tablicy
		for (int index = 0; index < array.length; index++)
		{
			System.out.print("Podaj liczb� numer " + (index + 1) + ": ");
			array[index] = keyboard.nextInt();
		}
	}
	
	/**
	 * Metoda shoeArray przyjmuje argumenty w postaci tablicy
	 *  i wy�wietla jej zawarto��.
	 *  @param array Referencja do tablicy.
	 */
	public static void showArray(int[] array)
	{
		// Wy�wietlanie element�w tablicy.
		for (int index = 0; index < array.length; index++)
		{
			System.out.print(array[index] + " ");
		}
	}
}
