/**
 * Program ilustruje dzia³anie klasy Countable.
 * @author mateusz
 *
 */

public class StaticDemo 
{

	public static void main(String[] args) 
	{
		int objectCount;
		// Tworzenie trzech instancji klasy Countable.
		Countable object1 = new Countable();
		Countable object2 = new Countable();
		Countable object3 = new Countable();
		
		// Pobieranie liczby instancji z pola statycznego klasy.
		objectCount = object1.getInstanceCount();
		System.out.println("Liczba utworzonych instancji to " + objectCount + ".");
	}
}
