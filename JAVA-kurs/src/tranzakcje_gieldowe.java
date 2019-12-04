import java.util.Scanner;

public class tranzakcje_gieldowe {

	public static void main(String[] args) {
		/*
		 * Program do obsługi tranzakcji giełdowych.
		 */
		
		double liczbaKupionychAkcji, liczbaSprzedanychAkcji; 
		double cenaZakupu, cenaSprzedazy, calkowityKosztZakupu, zysk;
		double prowizja = 0.02; 		// Prowizja brokera zakupu i sprzedaży
		Scanner klawiatura = new Scanner(System.in); // Przygotowanie do pobrania danych od użytkownika
		
		// Pobranie ceny zakupu akcji
		System.out.println("Wprowadź cenę zakupu akcji: ");
		cenaZakupu = klawiatura.nextInt();
		
		// Pobranie ilości kupionych akcji
		System.out.println("Wprowadź ilość kupionych akcji: ");
		liczbaKupionychAkcji = klawiatura.nextInt();
		
		calkowityKosztZakupu = (liczbaKupionychAkcji * cenaZakupu) + ((liczbaKupionychAkcji * cenaZakupu) * prowizja);
		
		// Pobranie ceny sprzedaży akcji
		System.out.println("Wprowadź cenę sprzedaży akcji: ");
		cenaSprzedazy = klawiatura.nextInt();
		
		// Pobranie ilości kupionych akcji
		System.out.println("Wprowadź ilość sprzedanych akcji: ");
		liczbaSprzedanychAkcji = klawiatura.nextInt();
		
		zysk =  (liczbaSprzedanychAkcji * cenaSprzedazy)- calkowityKosztZakupu;
		
		System.out.println("Kwota zapłacona za aukcje: " + liczbaKupionychAkcji * cenaZakupu);
		System.out.println("Prowizja brokera za zakup akcji: " + (liczbaKupionychAkcji * cenaZakupu) * prowizja);
		System.out.println("Kwota za sprzedaż aukcji: " + liczbaSprzedanychAkcji * cenaSprzedazy);
		System.out.println("Prowizja brokera za sprzedaż akcji: "  + (liczbaSprzedanychAkcji * cenaSprzedazy) * prowizja);

		System.out.println("Zysk: " + zysk);
		
	}

}
