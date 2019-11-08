// import Rectangle;

/**
 * Ten program ilustruje działanie metody stLength, setWidth, getLength, getWidth, getArea klasy Rectangle
 * @author mateusz
 *
 */

public class Rozdzial_6_3_LengthDemo {

	public static void main(String[] args) 
	{
		// Tworzenie obiektu klasy Rectangle i przypisanie jego adresu do zmiennej box.
		Rectangle box = new Rectangle();
		
		// Informowanie o tym co się dzieje.
		System.out.println("Przekazanie wartości 10.0 do metody setLenght.");
		
		// Wywołanie metody setLength obiektu box
		box.setLength(10.0);

		// Informowanie o zakończeniu pracy.
		System.out.println("Gotowe");
		
		// Informowanie o tym co się dzieje.
		System.out.println("Przekazanie wartości 20.0 do metody setWidth.");
		
		// Wywołanie metody setWidth obiektu box
		box.setWidth(20.0);
		
		// Informowanie o zakończeniu pracy.
		System.out.println("Gotowe");
		
		// Wyświetlanie długości i szerokości obiektu.
		System.out.println("Długość prostokąta wynosi " +
							box.getLength() + ".");
		System.out.println("Szerokość prostokąta wynosi " + 
							box.getWidth() + ".");
		
		// Wyświetlanie powierzchni.
		System.out.println("Powierzchnia prostokąta wynosi " + box.getArea() + ".");
		
	}

}
