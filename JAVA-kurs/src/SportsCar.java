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
	 * Konstruktor inicjuje mark�, 
	 * kolor i cen� samochodu.
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
	 * @return �a�cuch znak�w okre�laj�cy mark�,
	 * kolor i cen� samochodu.
	 */
	public String toString()
	{
		// Tworzy �a�cuch znak�w reprezentuj�cy obiekt.
		String str = String.format("Marka: %s\nKolor: %s\nCena: %,.2f z�otych", make, color, price);
		
		// Zwraca �a�cuch znak�w.
		return str;
	}
}
