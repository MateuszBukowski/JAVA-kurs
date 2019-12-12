import java.util.Scanner;

/**
 * Ten program ilustruje dzia³anie statycznych
 * metod klasy Telephone.
 * @author mateusz
 *
 */

public class TelephoneTester 
{

	public static void main(String[] args) 
	{
		String phoneNumber; // Przechowywanie numeru telefonu.
		
		// Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
		Scanner keyboard = new Scanner(System.in);
		
		// Pobieranie niesformatowanego numeru telefonu.
		System.out.println("Wpisz niesformatowany numer telefonu: ");
		phoneNumber = keyboard.nextLine();
		
		// Formatowanie numeru telefonu.
		System.out.println("Sformatowany numer: " + 
							Telephone.format(phoneNumber));
		
		// Pobieranie sformatowanego numeru telefonu.
		System.out.println("Wpisz numer telefonu o formacie");
		System.out.println("(XXX)XXX-XXXX");
		phoneNumber = keyboard.nextLine();
		
		// Usuwanie formatowania numeru telefonu.
		System.out.println("Niesformatowany numer: " + 
							Telephone.unformat(phoneNumber));
	}
}
