import java.util.ArrayList;

/**
 * Program pokazuj� jak zastosowa� p�tle for dla kolekcji obiekt�w typu ArrayList.
 * @author mateusz
 *
 */

public class ArrrayListDemo2 
{

	public static void main(String[] args) 
	{
		// Tworzenie obiekty typu ArrayList do przechowywania imion.
		ArrayList<String> nameList = new ArrayList<String>();
		
		// Dodawanie imion do obiektu typu ArrayList.
		nameList.add("Jacek");
		nameList.add("Celina");
		nameList.add("Biorys");
		
		// Wy�wietlanie wielko�ci obiektu typu ArrayList.
		System.out.println("W tym obiekcie typu ArrayList zapisano " + nameList.size() + " elementy.");
		
		// Wy�wietlanie obiekt�w z obiektu nameList.
		for (String name : nameList)
			System.out.println(name);
	}

}

