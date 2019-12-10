/**
 * Klasa ilustruje dzia³anie pola statycznego.
 * @author mateusz
 *
 */

public class Countable 
{

private static int instanceCount = 0;

/** Konstruktor inkrementuje pole statyczne;
 *  instanceCount. Pozwala to œledziæ liczbê
 *  utworzonych instancji tej klasy.
 */
public Countable()
{
	instanceCount++;
}

/** Metoda getInstanceCount zwraca liczbê
 * utworzonych instancji klasy.
 * @return Wartoœæ pola instanceCoount.
 */
public int getInstanceCount()
{
	return instanceCount;
}
}
