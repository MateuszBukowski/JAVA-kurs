	import java.io.*;               // Umożliwianie używania klas File i FileNotFoundException.
	import java.util.Scanner;       // Umożliwianie używania klasy Scanner.
	import javax.swing.JOptionPane; // Umożliwianie używania klasy JOptionPane.

	/**
	 * Ten program ilustruje obsługę wyjątków
	 * typu FileNotFoundException.
	 * @author mateusz
	 *
	 */

	public class ExceptionMessage 
	{

		public static void main(String[] args) 
		{
			File file; 			// Do pobierania danych wejściowych z pliku.
			Scanner inputFile;  // Do pobierania danych wejściowych z pliku.
			String fileName;    // Przechowywanie nazwy pliku.
			
			// Pobieranie nazwy pliku od użytkownika.
			fileName = JOptionPane.showInputDialog("Podaj nazwę pliku: ");
			
			// Próba otwarcia pliku.
			try
			{
				file = new File(fileName);
				inputFile = new Scanner(file);
				JOptionPane.showMessageDialog(null, "Znaleziono plik.");
			}
			catch (FileNotFoundException e)
			{
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			
			JOptionPane.showMessageDialog(null, "Gotowe.");
			System.exit(0);
		}
	}
