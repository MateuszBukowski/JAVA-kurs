/**
 * Klasa ilustruje dzia�anie metod statycznych.
 * @author mateusz
 *
 */

public class Metric 
{

	/**
	 * Metod mileToKilometers przekszta�aca odleg�o�� w milach na kiometry.
	 * @param m Odleg�o�� w milach
	 * @return Odleg�o�� w kilometrach.
	 */
	public static double milesToKilometers(double m)
	{
		return m * 1.609;
	}
	
	/**
	 * Metoda kilometersToMiles przekszta�ca kilometry na mile.
	 * @param k Odleg�o�� w kilometrach.
	 * @return Odleg�o�� w milach.
	 */
	public static double kilometersToMiles(double k)
	{
		return k / 1.609;
	}
}
