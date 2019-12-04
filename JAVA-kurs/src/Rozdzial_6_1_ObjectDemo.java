import java.util.Scanner; // Na potrzeby klasy Scaner
import java.util.Random;  // Na potrzeby klasy Rando,
import java.io.*;         // Na potrzeby klasy z plkowymi oeracjami wej-wyj

/**
 * ObjectDemo
 * Ten program zapisuje liczby losowe w pliku.
 * @author mateusz
 *
 */

public class Rozdzial_6_1_ObjectDemo {

	public static void main(String[] args) throws IOException
	{
		int maxNumbers; // Max liczba wartoœci losowych
		int number; 	// Przechowywanie liczby losowej.
		
		// Tworzenie obiektu typu Scanner do pobierania danych z klawiatury
		Scanner keyboard = new Scanner(System.in);
		
		// Tworzenie obiektu typu Random do generowania liczb losowych.
		Random rand = new Random();
		
		// Tworzenie obiektu typu PrintWriter s³u¿¹cego do otwierania pliku.
		PrintWriter outputFile = new PrintWriter("numbers.txt");
		
		// Pobieranie liczby zapisanych liczb losowych
		System.out.print("Ile liczb losowych program ma zapisaæ ?");
		maxNumbers = keyboard.nextInt();
		
		// Zapisanie liczb losowych w pliku.
		for(int count = 0 ; count < maxNumbers; count++) 
		{
			// Generowanie losowej liczby ca³kowitej .
			number = rand.nextInt();
			
			// Zapisanie losowej liczby ca³kowitej w pliku.
			outputFile.println(number);
		}
		// Zamykanie pliku
		outputFile.close();
		
		System.out.println("Gotowe.");	
	}

}
