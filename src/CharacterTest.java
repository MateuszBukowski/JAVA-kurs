import javax.swing.JOptionPane;

/**
 * Ten program ilustruje działanie wybranych
 * metod klasy Character służących do sprawdzania znaków.
 * @author mateusz
 *
 */

public class CharacterTest 
{

	public static void main(String[] args) 
	{
		String input; // Przechowywanie danych wejściowych od użytkowników.
		char ch; 	  // Przechowywanie jednego znaku.
		
		// Pobieranie znaku od użytkownika i zapisywanie
		// tej wartości w zmiennej ch.
		input = JOptionPane.showInputDialog("Podaj dowolny znak: ");
		ch = input.charAt(0);
		
		// Sprawdzanie znaku.
		if (Character.isLetter(ch))
		{
			JOptionPane.showMessageDialog(null, "Ten znak to litera.");
		}
		if (Character.isDigit(ch))
		{
			JOptionPane.showMessageDialog(null, "Ten znak to cyfra.");
		}
		if (Character.isLowerCase(ch))
		{
			JOptionPane.showMessageDialog(null, "Ten znak to mała litera.");
		}
		if (Character.isUpperCase(ch))
		{
			JOptionPane.showMessageDialog(null, "Ten znak to duża litera.");
		}
		if (Character.isSpaceChar(ch))
		{
			JOptionPane.showMessageDialog(null, "Ten znak to spacja.");
		}
		if (Character.isWhitespace(ch))
		{
			JOptionPane.showMessageDialog(null, "To biały znak.");
		}		
		
		System.exit(0);
	}
}
