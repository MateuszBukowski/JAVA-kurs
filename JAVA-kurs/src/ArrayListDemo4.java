import java.util.ArrayList;

/**
 * Program ilustruje wstawianie elementów.
 * @author mateusz
 *
 */

public class ArrayListDemo4 
{

	public static void main(String[] args) 
	{
		// Tworzenie obiekty typu ArrayList do przechowywania imion.
		ArrayList<String> nameList = new ArrayList<String>();
		
		// Dodawanie imion do obiektu typu ArrayList.
		nameList.add("Jacek");
		nameList.add("Celina");
		nameList.add("Borys");
	
		// Wyœwietlanie elementów  obiektu nameList i ich indeksów.
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Index: " + index + "  Imiê: " + nameList.get(index));
		}
		
		// Wstawianie elementu o indeksie 1.
		nameList.add(1, "Maria");
		
		System.out.println("Dodano imiê Maria o indeksie 1. " + "Teraz dostêpne s¹ nastêpuj¹ce elementy.");
		
		// Wyœwietlenie elementów z obiektu nameList i ich indeksów.
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Indeks: " + index + " Imie: " + nameList.get(index));
		}
	}
}
