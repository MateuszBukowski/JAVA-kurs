import java.util.Scanner;
import javax.swing.JOptionPane; // Potrzebne do tego, by móc używać klasy JOptionPane.


public class Rozdzial_3 {

	public static void main(String[] args) {
/*
 * Rozdział 3.
 */
		
//// 3.1 IF
//		double score1,  // Wynik nr 1
//			   score2,  // Wynik nr 2
//			   score3,  // Wynik nr 3
//			   average; // Średni wynik
//		
//		// Tworzenie obiektu klasy Scanner do wczytywania danych wejściowych.
//		Scanner keyboard = new Scanner(System.in);
//		
//		System.out.println("Ten program oblicza średnią wyników trzech testów.");
//		
//		//Pobranie pierwszego wyniku
//		System.out.print("Wprowadź wynik nr 1: ");
//		score1 = keyboard.nextDouble();
//		
//		//Pobranie pierwszego wyniku
//		System.out.print("Wprowadź wynik nr 2: ");
//		score2 = keyboard.nextDouble();
//				
//		//Pobranie pierwszego wyniku
//		System.out.print("Wprowadź wynik nr 3: ");
//		score3 = keyboard.nextDouble();
//				
//		// Obliczanie i wyświetlanie średniego wyniku.
//		average = (score1 + score2 + score3) / 3.0;
//		
//		System.out.println("Średnia wynosi " + average + ".");
//		
//		// Jeśli średnia przekracza 95, należy pogratulować użytkownikowi.
//		if (average > 95)
//			System.out.println("To świetny wynik!");
//		
// 3.2 IF-ELSE
//		24
//		25     if (number2 == 0)
//		26     {
//		27       System.out.println("Dzielenie przez zero nie jest możliwe.");
//		28       System.out.println("Uruchom program ponownie ");
//		29       System.out.println("i wprowadź liczbę różną od zera.");
//		30     }
//		31     else
//		32     {
//		33       quotient = number1 / number2;
//		34       System.out.print("Wynik dzielenia " + number1);
//		35       System.out.print(" przez " + number2);
//		36       System.out.println(" wynosi " + quotient + ".");
//		37     }
//// 3.3.	Zagnieżdżone instrukcje if
//		26     // Określanie, czy użytkownik spełnia warunki otrzymania pożyczki.
//		27     if (salary >= 50000)
//		28     {
//		29       if (yearsOnJob >= 2)
//		30       {
//		31         System.out.println("Spełniasz warunki uzyskania pożyczki.");
//		32       }
//		33       else
//		34       {
//		35         System.out.println("Musisz być zatrudniony w obecnej " +
//		36                            "pracy przynajmniej od dwóch lat, " +
//		37                            "aby uzyskać pożyczkę.");
//		38       }
//		39     }
//		40     else
//		41     {
//		42       System.out.println("Musisz zarabiać przynajmniej " +
//		43       "50 000 złotych rocznie, aby uzyskać pożyczkę.");
//		44     }	
//// 3.4.	Instrukcja if-else-if		
//		int testScore;  // Liczbowy wynik testu.
//		String input;   // Do przechowywania danych wejściowych od użytkownika.
//
//		// Pobieranie liczbowego wyniku testu.
//		input = JOptionPane.showInputDialog("Wprowadź liczbowy wynik testu, " +
//		               						"a poznasz swoją ocenę: ");
//		testScore = Integer.parseInt(input);
//
//		// Wyświetlanie oceny.
//		if (testScore < 60)
//			JOptionPane.showMessageDialog(null, "Twoja ocena to 1.");
//		else if (testScore < 70)
//			JOptionPane.showMessageDialog(null, "Twoja ocena to 2.");
//		else if (testScore < 80)
//			JOptionPane.showMessageDialog(null, "Twoja ocena to 3.");
//		
//		else if (testScore < 90)
//			JOptionPane.showMessageDialog(null, "Twoja ocena to 4.");
//		else
//			JOptionPane.showMessageDialog(null, "Twoja ocena to 5.");
//		System.exit(0);	
//// 3.5.	Operatory logiczne
		// Operator &&
//		int temperature = 13, minuty = 13;
//		
//		if (temperature < 20 && minuty > 12)
//		{
//			System.out.println("Temperatura jest na niebezpiecznym poziomie.");
//		}
		// Operator ||
//		
//		int temperature = 13;
//		
//		if (temperature < 20 || temperature > 100)
//		{
//			System.out.println("Temperatura jest na niebezpiecznym poziomie.");
//		}
		// Operator !
//		int temperature = 98;
//		
//		if (!(temperature > 100))
//			System.out.println("Temperatura spadła poniżej minimum! ");
// Sprawdzanie przynależności liczb do przedziałów za pomocą operatorów logicznych
//		int x = 233;
//		if (x >= 20 && x <= 40)
//			System.out.println(x  + " znajduję się w dopuszczonym przedziale. ");
//		if (x < 20 || x > 40)
//			System.out.println(x  + " NIE znajduję się w dopuszczonym przedziale. ");		
// 3.6.	Porównywanie obiektów typu String
		/**
	   		Ten program w poprawny sposób porównuje dwa obiekty 
			typu String, używając metody equals.
		*/	
//		
//		  String name1 = "Alan",
//				 name2 = "Alan",
//				 name3 = "Alka";
//		  
//		  // Porównanie Alan z Alan
//		  if (name1.equals(name2))
//		  {
//			  System.out.println(name1 + " i " + name2 + " są identyczne.");
//		  }
//		  else
//		  {
//			  System.out.println(name1 + " i " + name2 + " NIE są identyczne.");
//		  }
//		
//		// Porównanie Alan z Alka
//		  if (name1.equals(name3))
//		  {
//			  System.out.println(name1 + " i " + name3 + " są identyczne.");
//		  }
//		  else
//		  {
//			  System.out.println(name1 + " i " + name3 + " NIE są identyczne.");
//		  } 
//// 3.7.	Jeszcze o deklarowaniu i zasięgu zmiennych		
		
//// 3.8.	Operator warunkowy (opcjonalny)	
		// Pierwszy przykład
//		int x, y, z;
//		
//		x = 1;
//		y = 2;			
//		
//		z = x > y ? 1 : 20;
		//
//		Drugi przykład
//		System.out.println("Z = " + z);
//		int result = -1;
//		String wynik;
//		wynik = result >= 0 ? "Wynik jest dodatni." : "Wynik jest ujemny.";
//		System.out.println(wynik);
////  3.9.	Instrukcja switch
		
  /**
    Ten program ilustruje działanie instrukcji switch.
  */	
		
//		int number ; // Liczba wprowadzona przez użytkownika
//		
//		// Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
//		Scanner keyboard = new Scanner(System.in);
//		
//		// Pobieranie od użytkownika jednej z liczb: 1, 2 lub 3.
//		System.out.print("Wpisz 1, 2 lub 3: ");
//		number = keyboard.nextInt();
//		
//		// Określanie wprowadzonej wartości.
//		switch (number)
//		{
//		case 1:
//			System.out.println("Wpisałeś 1.");
//			break;
//		case 2:
//			System.out.println("Wpisałeś 2.");
//			break;
//		case 3:
//			System.out.println("Wpisałeś 3.");
//			break;
//		default:
//			System.out.println("Wartość jest inna niż 1,2 lub 3!");
//			
//		}
		
//// 3.10.	Wyświetlanie sformatowanych danych wyjściowych za pomocą instrukcji System.out.printf i String.format
		/**
			Ten program wyświetla różne liczby
			zmiennoprzecinkowe w kolumnie, wyrównane
			względem kropki dziesiętnej.
		*/
		
		// Deklarowanie różnych zmiennych typu double.
//		double num1 = 127.899;
//		double num2 = 3465.148;
//		double num3 = 3.776;
//		double num4 = 264.821;
//		double num5 = 88.081;
//		double num6 = 1799.999;
//		// Wyświetlanie każdej zmiennej w polu o długości
//		// ośmiu znaków z dwoma cyframi po przecinku.
//		System.out.printf("%8.2f\n", num1);
//		System.out.printf("%8.2f\n", num2);
//		System.out.printf("%8.2f\n", num3);
//		System.out.printf("%8.2f\n", num4);
//		System.out.printf("%8.2f\n", num5);
//		System.out.printf("%8.2f\n", num6);
//		
//		double amount = 1234567.89;
//		System.out.printf("%,f\n", amount);
//		
//		double sales = 28756.89;
//		System.out.printf("Sprzedaż w tym miesiącu wyniosła %,.2f.\n", sales);
		
		/**
		 * Ten program pokazuje, jak stosować metodę System.out.printf
		 * do formatowania liczb jako kwot pieniędzy.
		 */
//		double monthlyPay = 5000.0;
//		double annualPay = monthlyPay * 12;
//		System.out.printf("Roczna pensja wynosi %,.2f złotych.\n", annualPay);
		
		/**
		 * Ten program wyświetla liczby dopełnione początkowymi zerami.
		 */
		
		// Deklarowanie różnych zmiennych typu double.
//		double number1 = 1.234;
//		double number2 = 12.345;
//		double number3 = 123.456;
//		
//		// Wyświetlanie każdej zmiennej z początkowymi zerami
//		// w polu o szerokości 9 znaków
//		// i z zaokrągleniem do dwóch miejsc po przecinku.
//		System.out.printf("%09.2f\n", number1);
//		System.out.printf("%09.2f\n", number2);
//		System.out.printf("%09.2f\n", number3);
//// Metoda String.format
//		String.format(ŁańcuchFormatowania, ListaArgumentów)
		/**
		  Ten program pokazuje, jak używać metody String.format
		  do formatowania liczby jako kwoty pieniędzy.
		*/
		double monthlyPay = 5000.0;
		double annualPay = monthlyPay * 12;
		String output = String.format("Roczna pensja wynosi %,.2f złotych.", annualPay);
		JOptionPane.showMessageDialog(null, output);
		
		
		
		
		
		
		
		
	}

}
