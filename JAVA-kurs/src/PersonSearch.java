import java.util.Scanner;

/**
 * Ten program u�ywa metody startsWith do
 *  wyszukiwania pod�a�cuch�w.
 * @author mateusz
 *
 */

public class PersonSearch 
{

	public static void main(String[] args) 
	{
		String lookUp; // Przechowywanie szukanego �a�cucha znak�w.
		String[] people = { "Cywka, Waldemar", "Dymek, Grzegorz",
							"Dymek, Joanna", "Rabin, Piotr",
							"Rasiak, Celina", "Sagan, Cezary",
							"Surynt, Halina", "Szwoch, Borys",
							"Szwoch, Chrystian", "Wilk, Jacek" };
		
		// Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
		Scanner keyboard = new Scanner(System.in);
		
		// Pobieranie fragmentu szukanego nazwiska.
		System.out.println("Podaj kilka pierwszych liter " +
							"szukanego nazwiska: ");
		lookUp = keyboard.nextLine();
		
		// Wy�wietlanie wszystkich nazwisk rozpoczynaj�cych si�
		// od �a�cucha podanego przez u�ytkownika.
		System.out.println("Oto pasuj�ce nazwiska:");
		for (String person : people)
		{
			if (person.startsWith(lookUp))
				System.out.println(person);
		}
	}
}
