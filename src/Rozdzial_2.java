
public class Rozdzial_2 {

	public static void main(String[] args) {
// 2.2 Metody print i println
//print i println
//		System.out.println("Pierwszy tekst!");
//		System.out.println("Drugi tekst!");
//		System.out.print("Trzeci ");
//		System.out.println("tekst!");
//Sekwencja ucieczki
//Umieszczenie instrukcji steruj¹cej bezpoœrednio w tekœcie
//		System.out.print("Oto najlepiej sprzedaj¹ce siê produkty: \n");
//		System.out.print(" Gry\n kawa\n Aspiryna\n");
//		System.out.print("Oto najlepiej sprzedaj¹ce siê produkty: \n");
//		System.out.print(" Gry\t kawa\t Aspiryna");
// 2.3 Zmienne i litera³y
//		int value;
//		value = 5;
//		System.out.print("Zmienna value jest równa ");
//		System.out.println(value + ".");
//2.4 Proste typy danych
// Zmienne ca³kowitoliczbowe
//		int checking;
//		byte miles;
//		short minutes;
//		long days;
//		checking = -20;
//		miles = 105;
//		minutes = 120;
//		days = 189000;
//		System.out.println("Odbyliœmy podróz o d³ugoœci " + miles + " mil.");
//		System.out.println("Zajê³o nam to " + minutes + " minut.");
//		System.out.println("Stan konta w z³otych wynosi: " + checking);
//		System.out.println("Oko³o " + days + " dni temu w tym miejscu" +
//							" sta³ kolummb.");
// Zmienne zmiennoprzecinkowe
//		double price, tax, total;
//		price = 29.75;
//		tax = 1.76;
//		total = 31.51;
//		System.out.println("Cena produktu " + 
//		"wynosi " + price + ".");
//		System.out.println("Podatek wynosi " + tax + "."); 
//		System.out.println("£¹czna kwota wynosi " + total + "."); 
// Zmienne boolean
//		boolean bool;
//		bool = true;
//		System.out.println(bool);
//		bool = false;
//		System.out.println(bool);
// Zmienne char - znakowe - tylko jeden znak 
//		char letter;
//		letter = 'A'; //Apostrof nie cudzys³ow!!!
//		System.out.println(letter);
//		letter = 'B';
//		System.out.println(letter);
//		letter = 65;
//		System.out.println(letter);
//		letter = 66;
//		System.out.println(letter);
// Inicjowanie zmiennej
//		int month = 2, days = 28;
//		System.out.println("Miesi¹c nr " + month + " ma " +
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
// Program oblicza wyp³atê + dodatek za nadgodziny
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
//		System.out.println("Wyp³ata za ten tydzieñ wynosi " + totalWages + " z³otyc.");
// Program oblicza kwotê odk³adana wed³ug planu emerytalnego
//		double wyplataMiesiac = 6000.0;
//		double wklad;
//// 5% pensji odk³adanej mieisêcznie.
//		wklad = wyplataMiesiac * 0.05;
//		System.out.println("Odk³adanie 5% daje " + wklad + "z³otych miesiêcznie.");
//// 8% pensji odk³adanej mieisêcznie.
//		wklad = wyplataMiesiac * 0.08;
//		System.out.println("Odk³adanie 8% daje " + wklad + "z³otych miesiêcznie.");
//// 10% pensji odk³adanej mieisêcznie.
//		wklad = wyplataMiesiac * 0.10;
//		System.out.println("Odk³adanie 10% daje " + wklad + "z³otych miesiêcznie.");
// Rzutowanie typów danych
//		int liczba = 1;
//		char znak;
//		znak = (char)liczba;
//		System.out.println("Teraz to jest znak " + znak);
// Zmienne
//		final double PRICE = 19.99;
//		final double INTEREST_RATE = 0.069;
//		System.out.println("Cena wynosi " + PRICE + " .");
//2.8 Klasa String
		String pozdrowienie = "Dzieñ dobry! ";
		String imie = "Henryku.";
		int stringSize;
		System.out.println(pozdrowienie + imie);
		imie = "Henryk";
		stringSize = imie.length();
		System.out.println("Imie: " + imie + " ma " + stringSize + " znaków.");
		System.out.println("Tylko ma³e znaki: " + imie.toLowerCase());
		System.out.println("Tylko DU¯E znaki: " + imie.toUpperCase());		
// Komentarze
// I. Jednowierszowe
// ***************************************************************************
// PROGRAM: Comment1.java
// Autor: Mateusz Bukowski
// Ten program oblicza p³ace w firmie.
		
		double payRate;     // Przechowywanie stawki godzinowej
		double hours;       // Przechwywanie liczby przepracowanych godzin
		int employeeNumber; // Przechowywanie numeru pracownika
		
		// Resztê programu pominiêto.
// II. Wielowierszowe	
// ***************************************************************************
/* PROGRAM: Comment1.java
 * Autor: Mateusz Bukowski
 * Ten program oblicza p³ace w firmie.
 */
				
				double payRate2;     // Przechowywanie stawki godzinowej
				double hours2;       // Przechwywanie liczby przepracowanych godzin
				int employeeNumber2; // Przechowywanie numeru pracownika
				
				// Resztê programu pominiêto.
// ***************************************************************************
/* 
PROGRAM: Comment1.java
Autor: Mateusz Bukowski
Ten program oblicza p³ace w firmie.
*/
	double payRate3;     // Przechowywanie stawki godzinowej
	double hours3;       // Przechwywanie liczby przepracowanych godzin
	int employeeNumber3; // Przechowywanie numeru pracownika
								
// Resztê programu pominiêto.
	
	
	
/////////////////////////////////////////////
// PROGRAM: Comment1.java
// Autor: Mateusz Bukowski
// Ten program oblicza p³ace w firmie.
////////////////////////////////////////////
	
// III. Komentarze u¿ywane jako dokumentacja (komentarze JAVADOC)
// Mog¹ byæ wczytywane i przetwa¿ane przez program javadoc

/**
 * Ta klasa tworzy program obliczaj¹cy pensje w firmie.
 */

/**
 * Metoda main jest punktem wejœcia do programu
 */
	
	
	
	
	
	
		
	}
 
}









