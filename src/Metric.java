/**
 * Klasa ilustruje dzia³anie metod statycznych.
 * @author mateusz
 *
 */

public class Metric 
{

	/**
	 * Metod mileToKilometers przekszta³aca odleg³oœæ w milach na kiometry.
	 * @param m Odleg³oœæ w milach
	 * @return Odleg³oœæ w kilometrach.
	 */
	public static double milesToKilometers(double m)
	{
		return m * 1.609;
	}
	
	/**
	 * Metoda kilometersToMiles przekszta³ca kilometry na mile.
	 * @param k Odleg³oœæ w kilometrach.
	 * @return Odleg³oœæ w milach.
	 */
	public static double kilometersToMiles(double k)
	{
		return k / 1.609;
	}
}
