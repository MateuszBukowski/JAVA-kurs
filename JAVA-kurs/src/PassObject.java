		/**
		 * Ten program przekazuje obiekt jako argument.
		 */

public class PassObject 
{

	public static void main(String[] args) 
	{
		// Tworzenie obiektu typu Rectangle.
		Rectangle box = new Rectangle(12.0, 5.0);
		
		// Przekazywanie do metody displayRectangle 
		// referencji do obiektu.
		displayRectangle(box);
	}
	
	/**
	 * Metoda displayRectangle wy�wietla
	 * d�ugo�� i szeroko�� prostok�ta.
	 * @param r Referencja do obiektu
	 *          typu Rectangle.
	 */
	public static void displayRectangle(Rectangle r)
	{
		// Wy�wietlanie d�ugo�ci i szeroko�ci.
		System.out.println("D�ugo��: " + r.getLength() + 
						   " Szeroko��: " + r.getWidth());
	}
	
}
