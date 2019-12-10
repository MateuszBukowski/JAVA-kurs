import java.util.Scanner;

/**
 * Program pokazuje jak zapisywać i wyświetlać elementy tablicy.
 * @author mateusz
 *
 */

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		final int EMPLOYEES = 3;  			// Liczba pracowników.
		int[] hours = new int[EMPLOYEES]; 	// Tablica z przepracowanymi godzinami.
		
		// Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Podaj liczbe godzin przepracowanych przez " + EMPLOYEES + " pracowników.");
		
		// Pobieranie liczby godzin przepracowanych przez pracownika numer 1.
		System.out.print("Pracownik numer 1: ");
		hours[0] = keyboard.nextInt();
		
		// Pobieranie liczby godzin przepracowanych przez pracownika numer 2.
		System.out.print("Pracownik numer 2: ");
		hours[1] = keyboard.nextInt();
		
		// Pobieranie liczby godzin przepracowanych przez pracownika numer 3.
		System.out.print("Pracownik numer 3: ");
		hours[2] = keyboard.nextInt();
		
		// Wyświetlanie podanych wartości.
		System.out.println("Wpisana liczba godzin to: ");
		System.out.println(hours[0]);
		System.out.println(hours[1]);
		System.out.println(hours[2]);
		
  
	}

}
