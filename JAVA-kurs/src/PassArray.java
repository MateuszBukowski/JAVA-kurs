import java.util.Scanner;


/* Program ilustruje przekazywanie tablicy jako argumentu metody.
		 *  
		 */
		
public class PassArray {

	public static void main(String[] args) {
	
		final int ARRAY_SIZE = 4; // Wielkoœæ tablicy.
		
		// Tworzenie tablicy.
		int[] numbers = new int[ARRAY_SIZE];
		
		// Przekazywanie tablicy do metody getValues.
		getValues(numbers);
		
		System.out.println("Oto podane liczby: ");
		
		// Przekazywanie tablicy do metody. showArray.
		showArray(numbers);
	}
		/**
		 * Metoda getValues przyjmujê jako argument rerencjê do tablicy.
		 * Uzytkownik ma podaæ wartoœæ ka¿dego elementu tej tablicy.
		 * @param array Referencja do tablicy.
		 */
	private static void getValues(int[] array)
	{
		// Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Podaj seriê " + array.length + " liczb.");
		
		// Wczytanie wartoœæi do tablicy
		for (int index = 0; index < array.length; index++)
		{
			System.out.print("Podaj liczbê numer " + (index + 1) + ": ");
			array[index] = keyboard.nextInt();
		}
	}
	
	/**
	 * Metoda shoeArray przyjmuje argumenty w postaci tablicy
	 *  i wyœwietla jej zawartoœæ.
	 *  @param array Referencja do tablicy.
	 */
	public static void showArray(int[] array)
	{
		// Wyœwietlanie elementów tablicy.
		for (int index = 0; index < array.length; index++)
		{
			System.out.print(array[index] + " ");
		}
	}
}
