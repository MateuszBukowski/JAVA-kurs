import java.util.ArrayList;

/**
 * Program ilustruje wstawianie element�w.
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
	
		// Wy�wietlanie element�w  obiektu nameList i ich indeks�w.
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Index: " + index + "  Imi�: " + nameList.get(index));
		}
		
		// Wstawianie elementu o indeksie 1.
		nameList.add(1, "Maria");
		
		System.out.println("Dodano imi� Maria o indeksie 1. " + "Teraz dost�pne s� nast�puj�ce elementy.");
		
		// Wy�wietlenie element�w z obiektu nameList i ich indeks�w.
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Indeks: " + index + " Imie: " + nameList.get(index));
		}
	}
}
