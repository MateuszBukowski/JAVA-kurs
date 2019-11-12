import javax.swing.JOptionPane;

/**
 * Ten program tworzy trzy instancję klasy Rectangle.
 * @author mateusz
 *
 */

public class RoomAreas {

	public static void main(String[] args) {

		double number; 		// Przechowywanie liczby.
		double totalArea; 	// Powierzchnia całkowita
		String input;		// Przechowywanie danych wejściowych od używtkownika
		
		// Tworzenie trzech obiektów typu Rectangle.
		Rectangle kitchen = new Rectangle();
		Rectangle bedroom = new Rectangle();
		Rectangle den = new Rectangle();
			
		// Pobieranie i zapisywanie wymiarów kuchni.
		input = JOptionPane.showInputDialog("Podaj długość kuchni: ");
		number = Double.parseDouble(input);
		kitchen.setLength(number);
		input = JOptionPane.showInputDialog("Podaj szerokość kuchni: ");
		number = Double.parseDouble(input);
		kitchen.setWidth(number);
		
		// Pobieranie i zapisywanie wymiarów sypialni.
		input = JOptionPane.showInputDialog("Podaj długość sypialni: ");
		number = Double.parseDouble(input);
		bedroom.setLength(number);
		input = JOptionPane.showInputDialog("Podaj szerokość sypialni: ");
		number = Double.parseDouble(input);
		bedroom.setWidth(number);
		
		// Pobieranie i zapisywanie wymiarów salonu.
		input = JOptionPane.showInputDialog("Podaj długość salonu: ");
		number = Double.parseDouble(input);
		den.setLength(number);
		input = JOptionPane.showInputDialog("Podaj szerokość salonu: ");
		number = Double.parseDouble(input);
		den.setWidth(number);
		
		// Obliczanie łącznej powierzchni pomieszczeń.
		totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
		
		// Wyświetlanie łącznej powierzchni pomieszczeń.
		JOptionPane.showMessageDialog(null, "Łączna powierzchnia pomiesczeń wynosi " + totalArea + ".");
		
		System.exit(0);
		
	}

}
