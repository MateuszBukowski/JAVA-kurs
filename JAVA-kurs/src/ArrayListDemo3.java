import java.util.ArrayList;

/**
 * Program iluistruje dzia³anie obiektu typu ArrayList.
 * @author mateusz
 *
 */

public class ArrayListDemo3 
{

	public static void main(String[] args) 
	{
		// Tworzenie obiekty typu ArrayList do przechowywania imion.
		ArrayList<String> nameList = new ArrayList<String>();
		
		// Dodawanie imion do obiektu typu ArrayList.
		nameList.add("Jacek");
		nameList.add("Celina");
		nameList.add("Borys");
	
		// Wyœwietlanie elementów z obiektu namweList i ich indeksów.
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Indeks: " + index + " Imiê: " + nameList.get(index));
		}
		
		// Usuwanie elementu o indeksie 1.
		nameList.remove(1);
		System.out.println("Usuniêto element o indeksie 1. " + 
							"Teraz dostêpne s¹ nastêpuj¹ce elementy.");
		
		// Wyœwietlanie elementów z obiektu nameList i ich indeksów.
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Indeks: " + index + " Imiê: " + nameList.get(index));
		}
	}

}
