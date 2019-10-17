import java.util.Scanner;

public class Rozdzial_2 {

	public static void main(String[] args) {
// 2.2 Metody print i println
//print i println
//		System.out.println("Pierwszy tekst!");
//		System.out.println("Drugi tekst!");
//		System.out.print("Trzeci ");
//		System.out.println("tekst!");
//Sekwencja ucieczki
//Umieszczenie instrukcji steruj�cej bezpo�rednio w tek�cie
//		System.out.print("Oto najlepiej sprzedaj�ce si� produkty: \n");
//		System.out.print(" Gry\n kawa\n Aspiryna\n");
//		System.out.print("Oto najlepiej sprzedaj�ce si� produkty: \n");
//		System.out.print(" Gry\t kawa\t Aspiryna");
// 2.3 Zmienne i litera�y
//		int value;
//		value = 5;
//		System.out.print("Zmienna value jest r�wna ");
//		System.out.println(value + ".");
//2.4 Proste typy danych
// Zmienne ca�kowitoliczbowe
//		int checking;
//		byte miles;
//		short minutes;
//		long days;
//		checking = -20;
//		miles = 105;
//		minutes = 120;
//		days = 189000;
//		System.out.println("Odbyli�my podr�z o d�ugo�ci " + miles + " mil.");
//		System.out.println("Zaj�o nam to " + minutes + " minut.");
//		System.out.println("Stan konta w z�otych wynosi: " + checking);
//		System.out.println("Oko�o " + days + " dni temu w tym miejscu" +
//							" sta� kolummb.");
// Zmienne zmiennoprzecinkowe
//		double price, tax, total;
//		price = 29.75;
//		tax = 1.76;
//		total = 31.51;
//		System.out.println("Cena produktu " + 
//		"wynosi " + price + ".");
//		System.out.println("Podatek wynosi " + tax + "."); 
//		System.out.println("��czna kwota wynosi " + total + "."); 
// Zmienne boolean
//		boolean bool;
//		bool = true;
//		System.out.println(bool);
//		bool = false;
//		System.out.println(bool);
// Zmienne char - znakowe - tylko jeden znak 
//		char letter;
//		letter = 'A'; //Apostrof nie cudzys�ow!!!
//		System.out.println(letter);
//		letter = 'B';
//		System.out.println(letter);
//		letter = 65;
//		System.out.println(letter);
//		letter = 66;
//		System.out.println(letter);
// Inicjowanie zmiennej
//		int month = 2, days = 28;
//		System.out.println("Miesi�c nr " + month + " ma " +
//							days + " dni");
//2.4 Operatory arytmetyczne
//		int amount, total, price, tax, number, temp, sale, discount;
//		
//		amount = 4 + 8;
//		total = price + tax;
//		number = number + 1;
//		
//		temp = 112 - 14;
//		sale = sale - discount;
//		number = number - 1;
// Program oblicza wyp�at� + dodatek za nadgodziny
//		double regularWages;
//		double basePay = 25;
//		double regularHours = 40;
//		double overtimeWages;
//		double overtimePay = 37.5;
//		double overtimeHours = 10;
//		double totalWages;
//		regularWages = basePay * regularHours;
//		overtimeWages = overtimePay * overtimeHours;
//		totalWages = regularWages + overtimeHours;
//		System.out.println("Wyp�ata za ten tydzie� wynosi " + totalWages + " z�otyc.");
// Program oblicza kwot� odk�adana wed�ug planu emerytalnego
//		double wyplataMiesiac = 6000.0;
//		double wklad;
//// 5% pensji odk�adanej mieis�cznie.
//		wklad = wyplataMiesiac * 0.05;
//		System.out.println("Odk�adanie 5% daje " + wklad + "z�otych miesi�cznie.");
//// 8% pensji odk�adanej mieis�cznie.
//		wklad = wyplataMiesiac * 0.08;
//		System.out.println("Odk�adanie 8% daje " + wklad + "z�otych miesi�cznie.");
//// 10% pensji odk�adanej mieis�cznie.
//		wklad = wyplataMiesiac * 0.10;
//		System.out.println("Odk�adanie 10% daje " + wklad + "z�otych miesi�cznie.");
// Rzutowanie typ�w danych
//		int liczba = 1;
//		char znak;
//		znak = (char)liczba;
//		System.out.println("Teraz to jest znak " + znak);
// Zmienne
//		final double PRICE = 19.99;
//		final double INTEREST_RATE = 0.069;
//		System.out.println("Cena wynosi " + PRICE + " .");
//2.8 Klasa String
//		String pozdrowienie = "Dzie� dobry! ";
//		String imie = "Henryku.";
//		int stringSize;
//		System.out.println(pozdrowienie + imie);
//		imie = "Henryk";
//		stringSize = imie.length();
//		System.out.println("Imie: " + imie + " ma " + stringSize + " znak�w.");
//		System.out.println("Tylko ma�e znaki: " + imie.toLowerCase());
//		System.out.println("Tylko DU�E znaki: " + imie.toUpperCase());		
// Komentarze
// I. Jednowierszowe
// ***************************************************************************
// PROGRAM: Comment1.java
// Autor: Mateusz Bukowski
// Ten program oblicza p�ace w firmie.
//		
//		double payRate;     // Przechowywanie stawki godzinowej
//		double hours;       // Przechwywanie liczby przepracowanych godzin
//		int employeeNumber; // Przechowywanie numeru pracownika
		
		// Reszt� programu pomini�to.
// II. Wielowierszowe	
// ***************************************************************************
/* PROGRAM: Comment1.java
 * Autor: Mateusz Bukowski
 * Ten program oblicza p�ace w firmie.
 */
				
//				double payRate2;     // Przechowywanie stawki godzinowej
//				double hours2;       // Przechwywanie liczby przepracowanych godzin
//				int employeeNumber2; // Przechowywanie numeru pracownika
				
				// Reszt� programu pomini�to.
// ***************************************************************************
/* 
PROGRAM: Comment1.java
Autor: Mateusz Bukowski
Ten program oblicza p�ace w firmie.
*/
//	double payRate3;     // Przechowywanie stawki godzinowej
//	double hours3;       // Przechwywanie liczby przepracowanych godzin
//	int employeeNumber3; // Przechowywanie numeru pracownika
								
// Reszt� programu pomini�to.
	
	
	
/////////////////////////////////////////////
// PROGRAM: Comment1.java
// Autor: Mateusz Bukowski
// Ten program oblicza p�ace w firmie.
////////////////////////////////////////////
	
// III. Komentarze u�ywane jako dokumentacja (komentarze JAVADOC)
// Mog� by� wczytywane i przetwa�ane przez program javadoc

/**
 * Ta klasa tworzy program obliczaj�cy pensje w firmie.
 */

/**
 * Metoda main jest punktem wej�cia do programu
 */
	
//2.13. Pobieranie danych od użytkownika
//		int number;
//		Scanner klawiatura = new Scanner(System.in);
//		System.out.println("Wprowadź liczbę całkowitą: ");
//		number = klawiatura.nextInt();
//		System.out.println("Gotowe, podałeś: " + number);
	
	String nazwisko; // Przechowywanie nazwiska.
	int godziny; 	 // Przechowywanie godziny.
	double payRate;  // Stawka godzinoowa.
	double grossPay; // Pensja brutto.
	
	// Tworzenie obiektu typu Scanner do wczytania danych wejśćiowych.
	Scanner klawiatura = new Scanner(System.in);
	
	//Pobranie nazwiska użytkownika.
	System.out.print("Jak się nazywasz? ");
	nazwisko = klawiatura.nextLine();
	
	//Pobieranie liczby godzin przepracowanych w tym tygodniu.
	System.out.print("Ile godzin przepracowałeś w tym tygodniu? ");
	godziny = klawiatura.nextInt();
	
	//Pobieranie stawki godzinowej użytkownika.
	System.out.print("Ile wynosi stawka godzinowa? ");
	payRate = klawiatura.nextDouble();
	
	//Obliczanie pensji brutto.
	grossPay = godziny * payRate;
	
	// Wyświetlanie wynikowych informacji.
	System.out.println("Witaj,  " + nazwisko + ".");
	System.out.println("Twoja pensja brutto wynosi " + grossPay + " złotych.");
	
	
	
		
	}
 
}









