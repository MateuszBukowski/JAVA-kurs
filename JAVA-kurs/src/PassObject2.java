/**
 * Ten program przekazuje obiekt jako argument. Obiekt
 * jest modyfikowany przez metod� przyjmuj�c� ten argument.
 * @author mateusz
 *
 */

public class PassObject2 
{

	public static void main(String[] args) 
	{
		// Tworzenie obiektu typu Rectangle.
		Rectangle box = new Rectangle(12.0, 5.0);
		
		// Wy�wietlanie zawarto�ci obiektu.
		System.out.println("Zawarto�� obiektu box:");
		System.out.println("D�ugo��: " + box.getLength() +
						   " Szeroko��: " + box.getWidth());
		
		// Przekazywanie do metody changeRectangle
		// referencji do obiektu.
		changeRectangle(box);
		
		// Ponowne wy�wietlanie zawarto�ci obiektu.
		System.out.println("\nObecna zawarto�� obiektu box to: ");
		System.out.println("D�ugo��: " + box.getLength() + 
							" Szeroko��: " + box.getWidth());
	}

	/**
	 * Metoda changeRectangle ustawia d�ugo�� 
	 * i szeroko�� obiektu typu Rectangle na 0.
	 * @param r Modyfikowany obiekt typu Rectangle.
	 */
	public static void changeRectangle(Rectangle r)
	{
		r.setLength(0.0);
		r.setWidth(0.0);
	}
}
