/**
 * Klasa SportsCar.
 * @author mateusz
 *
 */
public class SportsCar 
{
	private CarType make;   // Marka samochodu.
	private CarColor color; // Kolor samochodu.
	private double price;   // Cena samochodu.
	
	/**
	 * Konstruktor inicjuje markê, 
	 * kolor i cenê samochodu.
	 * @param aMake Marka samochodu.
	 * @param aColor Kolor samochodu.
	 * @param aPrice Cena samochodu.
	 */
	
	public SportsCar(CarType aMake, CarColor aColor, double aPrice)
	{
		make = aMake;
		color = aColor;
		price = aPrice;
	}
	
	/**
	 * Metoda getMake.
	 * @return Marka samochodu.
	 */
	public CarType getMake()
	{
		return make;
	}
	
	/**
	 * Metoda getColor.
	 * @return Kolor samochodu.
	 */
	public CarColor getColor()
	{
		return color;
	}
	
	/**
	 * Metoda getPrice.
	 * @return Cena samochodu.
	 */
	public double getPrice()
	{
		return price;
	}
	
	/**
	 * Metoda toString.
	 * @return £añcuch znaków okreœlaj¹cy markê,
	 * kolor i cenê samochodu.
	 */
	public String toString()
	{
		// Tworzy ³añcuch znaków reprezentuj¹cy obiekt.
		String str = String.format("Marka: %s\nKolor: %s\nCena: %,.2f z³otych", make, color, price);
		
		// Zwraca ³añcuch znaków.
		return str;
	}
}
