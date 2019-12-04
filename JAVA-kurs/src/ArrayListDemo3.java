import java.util.ArrayList;

/**
 * Program iluistruje dzia�anie obiektu typu ArrayList.
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
	
		// Wy�wietlanie element�w z obiektu namweList i ich indeks�w.
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Indeks: " + index + " Imi�: " + nameList.get(index));
		}
		
		// Usuwanie elementu o indeksie 1.
		nameList.remove(1);
		System.out.println("Usuni�to element o indeksie 1. " + 
							"Teraz dost�pne s� nast�puj�ce elementy.");
		
		// Wy�wietlanie element�w z obiektu nameList i ich indeks�w.
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Indeks: " + index + " Imi�: " + nameList.get(index));
		}
	}

}
