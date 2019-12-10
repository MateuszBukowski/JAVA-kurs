import java.util.Scanner;
import java.io.*;

public class Rozdzial_4 {

	public static void main(String[] args) throws IOException
	{
		/*
		 * Rozdział 4.
		 */
//// 4.1.	Operatory inkrementacji i dekrementacji
		/**
		  Ten program ilustruje działanie operatorów ++ i −−.
	*/
//		int number = 4; // Początkowa wartość zmiennej number to 4.
//		// Wyświetlanie wartości zmiennej number.
//		System.out.println("Wartość zmiennej number to " + number + ".");
//		System.out.println("Inkrementacja zmiennej number.");
//		// Inkrementacja zmiennej number.
//		number++;
//		// Ponowne wyświetlanie wartości zmiennej number.
//		System.out.println("Wartość zmiennej number to " + number + ".");
//		System.out.println("Dekrementacja zmiennej number.");
//		// Dekrementacja zmiennej number.
//		number--;
//		// Ponowne wyświetlanie wartości zmiennej number.
//		System.out.println("Wartość zmiennej number to " + number + ".");
//// 4.2.	Pętla while
//		int number = 1;
//		while (number <= 5)
//		{
//			System.out.println("Witaj" + number);
//			number++;
//		}
//		System.out.println("To już wszystko!");
//// 4.3.	Stosowanie pętli while do sprawdzania poprawności danych wejściowych
//		int number;
//		// Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
//		Scanner keyboard = new Scanner(System.in);
//		// Pobieranie liczby od użytkownika.
//		System.out.print("Podaj liczbę z przedziału od 1 do 100: ");
//		number = keyboard.nextInt();
//		// Sprawdzanie poprawności danych wejściowych.
//		while (number < 1 || number > 100)
//		{
//			  System.out.print("Błędne dane wejściowe. Podaj liczbę z przedziału" +
//			                   "od 1 do 100: ");
//			  number = keyboard.nextInt();
//			}
//// 4.4.	Pętla do-while
//		/**
//		  Ten program ilustruje kontrolowaną przez użytkownika pętlę.
//		*/	
//		int score1, score2, score3; // Wyniki trzech testów.
//		double average;             // Średni wynik testu.
//		char repeat;                // Przechowywanie 't' lub 'n'.
//		String input;               // Przechowywanie danych wejściowych.
//		System.out.println("Ten program oblicza średnią " + 
//						   "wyników trzech testów.");
//		
//		// Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
//		Scanner keyboard = new Scanner(System.in);
//		
//		// Pobieranie tylu zbiorów wyników testów, ile użytkownik chce podać.
//		do
//		{
//			// Pobieranie wyniku pierwszego testu z danego zbioru.
//			System.out.print("Podaj wynik nr 1: ");
//			score1 = keyboard.nextInt();
//			
//			// Pobieranie wyniku drugiego testu z danego zbioru.
//			System.out.print("Podaj wynik nr 2: ");
//			score2 = keyboard.nextInt();
//			
//			// Pobieranie wyniku trzeciego testu z danego zbioru.
//			System.out.print("Podaj wynik nr 3: ");
//			score3 = keyboard.nextInt();
//			
//			// Pobieranie pozostałego znaku nowego wiersza.
//			keyboard.nextLine();
//			
//			// Obliczanie i wyświetlanie średniej wyników testów.
//			average = (score1 + score2 + score3) / 3.0;
//			System.out.println("Średnia wynosi " + average + ".");
//			System.out.println(); // Wyświetlanie pustego wiersza.
//			
//			// Czy użytkownik chce obliczyć średnią następnego zbioru wyników?
//			System.out.println("Chcesz obliczyć średnią " +
//								"następnego zbioru wyników testów?");
//			System.out.print("Wpisz T (tak) lub N (nie): ");
//			input = keyboard.nextLine();  // Wczytywanie wiersza.
//			repeat = input.charAt(0);     // Pobieranie pierwszego znaku.
//			
//		} while (repeat == 'T' || repeat == 't');
//		
//// 4.5.	Pętla for	
//		int number;
//		for (number = 1; number <= 10; number++)
//			System.out.print(number + " ");
//		System.out.println("");
//	
//		System.out.println("Liczba    Kwadrat liczby");
//		System.out.println("------------------------");
//		// Zmienna number istnieje tylko w pentli w tym przypadku.
//		for (int number = 1; number <= 10; number++)
//		{
//			System.out.println(number + "\t\t" +
//								number * number);
//		}
		
//// 4.6.	Suma bieżąca i wartość wartownika
		
//// 4.7 Pętle zagnieżdżone.
		
//		final int COLS = 6;
//		final int ROWS = 8;
//		
//		for (int row = 0; row < ROWS; row++)
//		{
//			
//			for (int col = 0; col < COLS; col++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		final int BASE_SIZE = 8;
//		
//		for (int r = 0; r < BASE_SIZE; r++)
//		{
//			for (int c = 0; c < (r + 1); c++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//// 4.8.	Instrukcje break i continue (opcjonalne)
		
//// 4.10.	Wprowadzenie do zapisu i odczytu plików
//		/**
//		 * Ten program zapisuje dane w pliku.
//		 */
//		String filename;    // Nazwa pliku.
//		String friendName;  // Imię znajomego.
//		int numFriends;     // Liczba znajomych.
//		
//		// Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
//		Scanner keyboard = new Scanner(System.in);
//		
//		// Pobieranie liczby znajomych.
//		System.out.print("Ilu masz znajomych? ");
//		numFriends = keyboard.nextInt();
//		
//		// Pobieranie pozostawionego znaku nowego wiersza.
//		keyboard.nextLine();
//		
//		// Pobieranie nazwy pliku.
//		System.out.print("Podaj nazwę pliku: ");
//		filename = keyboard.nextLine();
//		
//		// Otwieranie pliku.
//		PrintWriter outputFile = new PrintWriter(filename);
//		
//		// Pobieranie danych i zapisywanie ich w pliku.
//		for (int i = 1; i <= numFriends; i++)
//		{
//			// Pobieranie imienia znajomego.
//			System.out.print("Podaj imię znajomego " + "numer " + i + ": ");
//			friendName = keyboard.nextLine();
//			// Zapisywanie imienia w pliku.
//			outputFile.println(friendName);
//		}
//		// Zamykanie pliku.
//		outputFile.close();
//		System.out.println("Dane zostały zapisane w pliku.");
		
		
	}

}
