/**
 * Program ilustruje inicjowanie tablicy.
 * @author mateusz
 *
 */

public class ArrayInitialization {

	public static void main(String[] args) {
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int index =  0; index < 12; index++)
		{
			System.out.println("Miesi¹c nr. " + (index + 1) + " ma " + days[index] + " dni.");
		}
	}

}
