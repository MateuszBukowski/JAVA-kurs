import java.util.Scanner;

/**
 * Ten program u¿ywa metody startsWith do
 *  wyszukiwania pod³añcuchów.
 * @author mateusz
 *
 */

public class PersonSearch 
{

	public static void main(String[] args) 
	{
		String lookUp; // Przechowywanie szukanego ³añcucha znaków.
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
		
		// Wyœwietlanie wszystkich nazwisk rozpoczynaj¹cych siê
		// od ³añcucha podanego przez u¿ytkownika.
		System.out.println("Oto pasuj¹ce nazwiska:");
		for (String person : people)
		{
			if (person.startsWith(lookUp))
				System.out.println(person);
		}
	}
}
