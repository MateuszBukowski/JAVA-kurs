/** 
 * Klasa Telephone udost�pnia statyczne metody
 * do formatowania i usuwania formatowania ameryka�skich 
 * numer�w telefon�w.
 * @author mateusz
 *
 */

public class Telephone 
{
	// Te sta�e przechowuj� poprawn� d�ugo�� �a�cuch�w znak�w 
	// w sformatowanej i niesformatowanej postaci.
	public final static int FORMATTED_LENGTH = 13;
	public final static int UNFORMATTED_LENGTH = 10;
	
	/**
	 * Metoda isFormatted okre�la, czy �a�cuch znak�w 
	 * jest poprawnie sformatowany jako ameryka�ski
	 * numer telefonu i ma posta�:
	 * (XXX)XXX-XXXX
	 * @param str Sprawdzany �a�cuch znak�w.
	 * @return true, je�li �a�cuch znak�w jest poprawnie sformatowany,
	 * lub false w przeciwnym razie.
	 */
	public static boolean isFormatted(String str)
	{
		boolean valid; // Flaga informuj�ca, czy format jest poprawny.
		
		// Okre�lanie, czy �a�cuch str jest poprawnie sformatowany.
		if (str.length() == FORMATTED_LENGTH && 
			str.charAt(0) == '(' &&
			str.charAt(4) == ')' &&
			str.charAt(8) == '_')
			valid = true;
		else
			valid = false;
		
		// Zwracanie warto�ci flagi valid.
		return valid;
	}
	
	/**
	 * Metoda unformat przyjmuje �a�cuch znak�w zawieraj�cy
	 * numer telefonu w formacie:
	 * (XXX)XXX-XXXX.
	 * Je�li argument jest sformatowany w ten spos�b, metoda
	 * zwraca niesformatowany �a�cuch znak�w, z usuni�tym 
	 * nawiasem i my�lnikiem. W przeciwnym razie
	 * zwraca niezmodyfikowany argument.
	 * @param str �a�cuch znak�w, kt�rego formatowanie nale�y usun��.
	 * @return Niesformatowany �a�cuch znak�w.
	 */
	public static String unformat(String str)
	{
		// Tworzenie obiektu typu StringBuilder inicjowanego parametrem str.
		StringBuilder strb = new StringBuilder(str);
		
		// Je�li argument jest poprawnie sformatowany, nale�y
		// usun�� formatowanie.
		if (isFormatted(str))
		{
			// Najpierw nale�y usun�� lewy nawias z pozycji 0.
			strb.deleteCharAt(0);
			
			// Nast�pnie usuwany jest prawy nawias. Z powodu
			// wcze�niejszego usuwania znajduje
			// si� on teraz na pozycji 3.
			strb.deleteCharAt(3);
			
			// Nast�pnie usuwany jest my�lnik. Z powodu
			// wcze�niejszych operacji usuwania my�lnik
			// znajduje si� teraz na pozycji 6.
			strb.deleteCharAt(6);
		}
		
		// Zwracanie niesformatowanego �a�cucha znak�w.
		return strb.toString();
	}
	
	/**
	 * Metoda format formatuje �a�cuch znak�w do postaci:
	 * (XXX)XXX-XXXX.
	 * Je�li d�ugo�� argumentu to UNFORMATTED_LENGTH,
	 * metoda zwraca sformatowany �a�cuch znak�w. W przeciwnym
	 * razie zwraca niezmodyfikowany argument.
	 * @param str Formatowany �a�cuch znak�w.
	 * @return �a�cuch znak�w sformatowany jako ameryka�ski numer telefonu.
	 */
	public static String format(String str)
	{
		// Tworzenie obiektu typu StringBuilder zainicjowanego parametrem str.
		StringBuilder strb = new StringBuilder(str);
		
		// Je�li argument ma prawid�ow� d�ugo��, nale�y
		// go sformatowa�.
		if (str.length() == UNFORMATTED_LENGTH)
		{
			// Najpierw nale�y wstawi� lewy nawias na pozycji 0.
			strb.insert(0, "(");
			
			// Najpierw nale�y wstawi� prawy nawias na pozycji 4.
			strb.insert(4, ")");
			
			// Najpierw nale�y wstawi� my�lnik na pozycji 8.
			strb.insert(8, "-");
		}
		
		// Zwracanie sformatowanego �a�cucha znak�w.
		return strb.toString();
	}
}






























