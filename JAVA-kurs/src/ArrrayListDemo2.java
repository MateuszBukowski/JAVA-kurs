import java.util.ArrayList;

/**
 * Program pokazujê jak zastosowaæ pêtle for dla kolekcji obiektów typu ArrayList.
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
		
		// Wyœwietlanie wielkoœci obiektu typu ArrayList.
		System.out.println("W tym obiekcie typu ArrayList zapisano " + nameList.size() + " elementy.");
		
		// Wyœwietlanie obiektów z obiektu nameList.
		for (String name : nameList)
			System.out.println(name);
	}

}

