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
	 * Metoda displayRectangle wyœwietla
	 * d³ugoœæ i szerokoœæ prostok¹ta.
	 * @param r Referencja do obiektu
	 *          typu Rectangle.
	 */
	public static void displayRectangle(Rectangle r)
	{
		// Wyœwietlanie d³ugoœci i szerokoœci.
		System.out.println("D³ugoœæ: " + r.getLength() + 
						   " Szerokoœæ: " + r.getWidth());
	}
	
}
