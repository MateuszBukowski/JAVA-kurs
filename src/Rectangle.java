/*
 * Klasa Rectangle 
 * Etap1
 * Etap2 
 * Etap3
 * Etap4
*/

public class Rectangle
{
	
	private double length;
	private double width;


	/**
	 Metoda setLength zapisuje wartosc w polu length.
	 @param len Wartosc zapisana w polu length.
	*/

	public void setLength(double len)
	{
	
		length = len;
	
	}

	/**
	 * Metoda setWidthzapisuje wartość w polu width.
	 * @param w Wartość zapisana w polu width.
	 */
	
	public void setWidth(double w)
	{
		width = w;
	}

	/**
	 * Metoda getLength zwraca długość obiektu typu Rectangle
	 * @return Wartość z pola length.
	 */
	
	public double getLength()
	
	{
		return length;
	}
	
	/**
	 * Metoda getWidth zwraca szerokość obiektu typu Rectangle
	 * @return Wartość z pola width.
	 */
	
	public double getWidth()
	{
		return width;
	}
	
	/*
	 * Metoda getArea zwraca powierzchnię obiektu typu Rectangle. 
	 * @return Iloczyn length i width.
	 */
	
	public double getArea()
	{
		return length * width;
	}
	
	
}

















