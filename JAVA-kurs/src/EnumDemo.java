/**
 * Ten program przedstawia dzia�anie typu wyliczeniowego.
 * @author mateusz
 *
 */

public class EnumDemo 
{
	// Deklarowanie typu wyliczeniowego Day.
	enum Day {NIEDZIELA, PONIEDZIALEK, WTOREK, SRODA, CZWARTEK, 
			  PIATEK, SOBOTA}
	
	public static void main(String[] args) 
	{
		// Deklarowanie zmiennej Day i przypisywanie do niej warto�ci.
		Day workDay = Day.SRODA;
		
		// Poni�sza instrukcja wy�wietla s�owo SRODA.
		System.out.println(workDay);
		
		// Ta instrukcja wy�wietla numer porz�dkowy
		// warto�ci Day.NIEDZIELA, czyli 0.
		System.out.println("Numer porz�dkowy watrto�ci " + 
							Day.NIEDZIELA + " to " + 
							Day.NIEDZIELA.ordinal() + ".");
		
		// Poni�sza instrukcja wy�wietla numer porz�dkowy
		// warto�ci Day.SOBOTA, czyli 6.
		System.out.println("Numer porz�dkowy watrto�ci " + 
				Day.SOBOTA + " to " + 
				Day.SOBOTA.ordinal() + ".");
		
		// Ta instrukcja por�wnuje dwie sta�e wyliczenia.
		if (Day.PIATEK.compareTo(Day.PONIEDZIALEK) > 0)
			System.out.println(Day.PIATEK + " ma numer wi�kszy ni� " + 
							   Day.PONIEDZIALEK);
		else
			System.out.println(Day.PIATEK + " ma numer NIE wi�kszy ni� " + 
					   		   Day.PONIEDZIALEK);
	}

}
