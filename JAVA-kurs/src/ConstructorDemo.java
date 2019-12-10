/**
 * Program ilustruje działanie konstruktora klasy Rectangle
 * @author mateusz
 *
 */

public class ConstructorDemo {

	public static void main(String[] args) {

		// Tworzenie obiektu klasy Rectangle. Jako argumenty
		// konstruktora przekazywane są wartości 5.0 i 15.0.
		Rectangle box = new Rectangle(5.0, 15.0);
		
		// Wyświetlanie długości.
		System.out.println("Długość prostokąta wynosi " + box.getLength() + ".");
		
		// Wyświetlanie szerokości.
		System.out.println("Szerokość prostokąta wynosi " + box.getWidth() + ".");
		
		// Wyświetlanie powierzchni.
		System.out.println("Powierzchnia prostokąta wynosi " + box.getArea() + ".");
		
	}

}
