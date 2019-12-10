import java.util.Scanner;

/** 
 * Program zapisuje w tablicy liczbê godzin przepracowanych przez piêciu pracowników 
 * maj¹cych t¹ sam¹ stawkê godzinow¹.
 * @author mateusz
 *
 */

public class PayArray {

	public static void main(String[] args) {
		final int EMPLOYEES = 5; // Liczba pracowników.
		double payRate;  // Stawka godzinowa.
		double grossPay; // Pensaj brutto.
		
		// Tworzenie tablicy do przechpwywania liczby przepracowanyc godzin.
		int[] hours = new int[EMPLOYEES];
		
		// Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
		Scanner keyboard = new Scanner(System.in);
		
		//Pobieranie liczby godzin przepracowanych przez ka¿dego pracownika.
		System.out.println("Podaj liczbê przepracowanych godzin przez " + EMPLOYEES + " pracowników " + 
							"maj¹cych tê sam¹ stawkê godzinow¹.");
		
		for (int index = 0; index < EMPLOYEES; index++)
		{
			System.out.print("Pracownik nr. " + (index + 1) + ": ");
			hours[index] = keyboard.nextInt();
		}
		
		// Pobieranie stawki godzinowej.
		System.out.print("Podaj stawke godzinow¹ wszystkich pracowników: ");
		payRate = keyboard.nextDouble();
		
		//Wyœwietlenie pensji brutto ka¿dego pracownika.
		System.out.println("Pensje brutto wszystkich pracowników:");
		for (int index = 0; index < EMPLOYEES; index++)
		{
			grossPay = hours[index] * payRate;
			System.out.println("Pracownik numer " + (index + 1) + ": " + grossPay + " z³otych.");bbbbh
		}
	}

}
