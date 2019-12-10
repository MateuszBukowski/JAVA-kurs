import java.util.Scanner;

/** 
 * Program zapisuje w tablicy liczb� godzin przepracowanych przez pi�ciu pracownik�w 
 * maj�cych t� sam� stawk� godzinow�.
 * @author mateusz
 *
 */

public class PayArray {

	public static void main(String[] args) {
		final int EMPLOYEES = 5; // Liczba pracownik�w.
		double payRate;  // Stawka godzinowa.
		double grossPay; // Pensaj brutto.
		
		// Tworzenie tablicy do przechpwywania liczby przepracowanyc godzin.
		int[] hours = new int[EMPLOYEES];
		
		// Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
		Scanner keyboard = new Scanner(System.in);
		
		//Pobieranie liczby godzin przepracowanych przez ka�dego pracownika.
		System.out.println("Podaj liczb� przepracowanych godzin przez " + EMPLOYEES + " pracownik�w " + 
							"maj�cych t� sam� stawk� godzinow�.");
		
		for (int index = 0; index < EMPLOYEES; index++)
		{
			System.out.print("Pracownik nr. " + (index + 1) + ": ");
			hours[index] = keyboard.nextInt();
		}
		
		// Pobieranie stawki godzinowej.
		System.out.print("Podaj stawke godzinow� wszystkich pracownik�w: ");
		payRate = keyboard.nextDouble();
		
		//Wy�wietlenie pensji brutto ka�dego pracownika.
		System.out.println("Pensje brutto wszystkich pracownik�w:");
		for (int index = 0; index < EMPLOYEES; index++)
		{
			grossPay = hours[index] * payRate;
			System.out.println("Pracownik numer " + (index + 1) + ": " + grossPay + " z�otych.");bbbbh
		}
	}

}
