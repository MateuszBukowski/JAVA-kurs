/**
 * Ten program przekazuje obiekt jako argument. Obiekt
 * jest modyfikowany przez metodê przyjmuj¹c¹ ten argument.
 * @author mateusz
 *
 */

public class PassObject2 
{

	public static void main(String[] args) 
	{
		// Tworzenie obiektu typu Rectangle.
		Rectangle box = new Rectangle(12.0, 5.0);
		
		// Wyœwietlanie zawartoœci obiektu.
		System.out.println("Zawartoœæ obiektu box:");
		System.out.println("D³ugoœæ: " + box.getLength() +
						   " Szerokoœæ: " + box.getWidth());
		
		// Przekazywanie do metody changeRectangle
		// referencji do obiektu.
		changeRectangle(box);
		
		// Ponowne wyœwietlanie zawartoœci obiektu.
		System.out.println("\nObecna zawartoœæ obiektu box to: ");
		System.out.println("D³ugoœæ: " + box.getLength() + 
							" Szerokoœæ: " + box.getWidth());
	}

	/**
	 * Metoda changeRectangle ustawia d³ugoœæ 
	 * i szerokoœæ obiektu typu Rectangle na 0.
	 * @param r Modyfikowany obiekt typu Rectangle.
	 */
	public static void changeRectangle(Rectangle r)
	{
		r.setLength(0.0);
		r.setWidth(0.0);
	}
}
