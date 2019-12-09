/**
 * Ten program przedstawia dzia³anie typu wyliczeniowego.
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
		// Deklarowanie zmiennej Day i przypisywanie do niej wartoœci.
		Day workDay = Day.SRODA;
		
		// Poni¿sza instrukcja wyœwietla s³owo SRODA.
		System.out.println(workDay);
		
		// Ta instrukcja wyœwietla numer porz¹dkowy
		// wartoœci Day.NIEDZIELA, czyli 0.
		System.out.println("Numer porz¹dkowy watrtoœci " + 
							Day.NIEDZIELA + " to " + 
							Day.NIEDZIELA.ordinal() + ".");
		
		// Poni¿sza instrukcja wyœwietla numer porz¹dkowy
		// wartoœci Day.SOBOTA, czyli 6.
		System.out.println("Numer porz¹dkowy watrtoœci " + 
				Day.SOBOTA + " to " + 
				Day.SOBOTA.ordinal() + ".");
		
		// Ta instrukcja porównuje dwie sta³e wyliczenia.
		if (Day.PIATEK.compareTo(Day.PONIEDZIALEK) > 0)
			System.out.println(Day.PIATEK + " ma numer wiêkszy ni¿ " + 
							   Day.PONIEDZIALEK);
		else
			System.out.println(Day.PIATEK + " ma numer NIE wiêkszy ni¿ " + 
					   		   Day.PONIEDZIALEK);
	}

}
