/**
 * Klasa ilustruje dzia�anie pola statycznego.
 * @author mateusz
 *
 */

public class Countable 
{

private static int instanceCount = 0;

/** Konstruktor inkrementuje pole statyczne;
 *  instanceCount. Pozwala to �ledzi� liczb�
 *  utworzonych instancji tej klasy.
 */
public Countable()
{
	instanceCount++;
}

/** Metoda getInstanceCount zwraca liczb�
 * utworzonych instancji klasy.
 * @return Warto�� pola instanceCoount.
 */
public int getInstanceCount()
{
	return instanceCount;
}
}
