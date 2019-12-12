/** 
 * Klasa Telephone udostêpnia statyczne metody
 * do formatowania i usuwania formatowania amerykañskich 
 * numerów telefonów.
 * @author mateusz
 *
 */

public class Telephone 
{
	// Te sta³e przechowuj¹ poprawn¹ d³ugoœæ ³añcuchów znaków 
	// w sformatowanej i niesformatowanej postaci.
	public final static int FORMATTED_LENGTH = 13;
	public final static int UNFORMATTED_LENGTH = 10;
	
	/**
	 * Metoda isFormatted okreœla, czy ³añcuch znaków 
	 * jest poprawnie sformatowany jako amerykañski
	 * numer telefonu i ma postaæ:
	 * (XXX)XXX-XXXX
	 * @param str Sprawdzany ³añcuch znaków.
	 * @return true, jeœli ³añcuch znaków jest poprawnie sformatowany,
	 * lub false w przeciwnym razie.
	 */
	public static boolean isFormatted(String str)
	{
		boolean valid; // Flaga informuj¹ca, czy format jest poprawny.
		
		// Okreœlanie, czy ³añcuch str jest poprawnie sformatowany.
		if (str.length() == FORMATTED_LENGTH && 
			str.charAt(0) == '(' &&
			str.charAt(4) == ')' &&
			str.charAt(8) == '_')
			valid = true;
		else
			valid = false;
		
		// Zwracanie wartoœci flagi valid.
		return valid;
	}
	
	/**
	 * Metoda unformat przyjmuje ³añcuch znaków zawieraj¹cy
	 * numer telefonu w formacie:
	 * (XXX)XXX-XXXX.
	 * Jeœli argument jest sformatowany w ten sposób, metoda
	 * zwraca niesformatowany ³añcuch znaków, z usuniêtym 
	 * nawiasem i myœlnikiem. W przeciwnym razie
	 * zwraca niezmodyfikowany argument.
	 * @param str £añcuch znaków, którego formatowanie nale¿y usun¹æ.
	 * @return Niesformatowany ³añcuch znaków.
	 */
	public static String unformat(String str)
	{
		// Tworzenie obiektu typu StringBuilder inicjowanego parametrem str.
		StringBuilder strb = new StringBuilder(str);
		
		// Jeœli argument jest poprawnie sformatowany, nale¿y
		// usun¹æ formatowanie.
		if (isFormatted(str))
		{
			// Najpierw nale¿y usun¹æ lewy nawias z pozycji 0.
			strb.deleteCharAt(0);
			
			// Nastêpnie usuwany jest prawy nawias. Z powodu
			// wczeœniejszego usuwania znajduje
			// siê on teraz na pozycji 3.
			strb.deleteCharAt(3);
			
			// Nastêpnie usuwany jest myœlnik. Z powodu
			// wczeœniejszych operacji usuwania myœlnik
			// znajduje siê teraz na pozycji 6.
			strb.deleteCharAt(6);
		}
		
		// Zwracanie niesformatowanego ³añcucha znaków.
		return strb.toString();
	}
	
	/**
	 * Metoda format formatuje ³añcuch znaków do postaci:
	 * (XXX)XXX-XXXX.
	 * Jeœli d³ugoœæ argumentu to UNFORMATTED_LENGTH,
	 * metoda zwraca sformatowany ³añcuch znaków. W przeciwnym
	 * razie zwraca niezmodyfikowany argument.
	 * @param str Formatowany ³añcuch znaków.
	 * @return £añcuch znaków sformatowany jako amerykañski numer telefonu.
	 */
	public static String format(String str)
	{
		// Tworzenie obiektu typu StringBuilder zainicjowanego parametrem str.
		StringBuilder strb = new StringBuilder(str);
		
		// Jeœli argument ma prawid³ow¹ d³ugoœæ, nale¿y
		// go sformatowaæ.
		if (str.length() == UNFORMATTED_LENGTH)
		{
			// Najpierw nale¿y wstawiæ lewy nawias na pozycji 0.
			strb.insert(0, "(");
			
			// Najpierw nale¿y wstawiæ prawy nawias na pozycji 4.
			strb.insert(4, ")");
			
			// Najpierw nale¿y wstawiæ myœlnik na pozycji 8.
			strb.insert(8, "-");
		}
		
		// Zwracanie sformatowanego ³añcucha znaków.
		return strb.toString();
	}
}






























