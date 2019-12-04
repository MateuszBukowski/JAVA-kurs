import java.util.ArrayList;

/**
 * Program ilustruje dzia�anie klasy ArrayList.
 * @author mateusz
 *
 */

public class ArrayListDemo1 {

	public static void main(String[] args) 
	{
		// Tworzenie obiektu typu ArrayList do przechowywania imion.
		ArrayList<String> nameList = new ArrayList<>();
		
		// Dodawanie imion do obiektu typu ArrayList.
		nameList.add("Jacek");
		nameList.add("Celina");
		nameList.add("Borys");
		
		// Wy�wietlanie wielko�ci obiektu typu  ArrayList.
		System.out.println("W tym obiekcie typu ArrayList zapisno " + nameList.size() + " elementy.");
		
		// Wy�wietlenie element�w z obiektu nameList.
		for (int index = 0; index < nameList.size(); index++)
			System.out.println(nameList.get(index));
	}

}
