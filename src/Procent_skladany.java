import java.util.Scanner;

public class Procent_skladany {

	public static void main(String[] args) {
		/*
		 * Program do obliczania procentu składanego.
		 */
		
		double a; // kwota pieniędzy na koncie po określonej liczbie lat
		double p; // kwota pierwotnie zdeponowana na koncie
		double r; // roczna stopa oprocentowania
		double n; // określa, ile razy w roku odsetki są doliczane do kapitału
		double t; // liczba lat
		double lewa; // lewa strona równania
		double potega; // potęgą nt
		
		// Poproś o dane i zapisz w zmiennych.
		Scanner klawiatura = new Scanner(System.in); // Przygotowanie do pobrania danych od użytkownika
		
		// Pobranie kwoty pierwotnie zdeponowanej na koncie
		System.out.println("Wprowadź kwotę pierwotnie zdeponowaną na koncie: ");
		p = klawiatura.nextDouble();
		
		// Pobranie roczna stopa oprocentowania
		System.out.println("Wprowadź roczna stopa oprocentowania: ");
		r = klawiatura.nextDouble();
		r /= 100;
		
		// Pobranie ile razy w roku odsetki są doliczane do kapitału
		System.out.println("Wprowadź ile razy w roku odsetki są doliczane do kapitału: ");
		n = klawiatura.nextDouble();
		
		// Pobranie liczba lat
		System.out.println("Wprowadź liczba lat: ");
		t = klawiatura.nextDouble();
		
		// Obliczanie kwoty procentu skąłdanego na koncie.
		lewa = p * (1 +  (r / (100 * n)));
		potega = n * t;
		a = Math.pow(lewa, potega);
		
		// Wyświetl wynik.
		System.out.println("--= Procent składany =-- ");
		System.out.println("Kwota: " + p + " , po okresie " + t + " lat. Da w wyniku: " + a + " złotych." );
		
		
	}

}
