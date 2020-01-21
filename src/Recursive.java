/**
 * Ta klasa obejmuje rekurencyjną metodę message,
 * wyświetlającą komunikat n razy.
 * @author mateusz
 *
 */

public class Recursive {
	public static void message(int n)
	{
		if (n > 0)
		{
			System.out.println("To metoda rekurencyjna.");
			message(n - 1);
		}
	}

}
