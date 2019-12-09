/**
 * Ten program u¿ywa metody copy klasy Stock
 * do tworzenia kopii obiektu typu Stock.
 * @author mateusz
 *
 */

public class ObjectCopy 
{
	public static void main(String[] args) 
	{
		// Tworzenie obiektu typu Stock.
		Stock company1 = new Stock("XYZ", 9.62);
		
		// Deklarowanie zmiennej typu Stock.
		Stock company2;
		
		// Przypisywanie do zmiennej company2 referencji do kopii obiektu
		// wskazywanego przez zmienn¹ company1.
		company2 = company1.copy();
		
		// Wyœwietlanie zawartoœci obu obiektów.
		System.out.println("Firma 1:\n" + company1);
		System.out.println();
		System.out.println("Firma 2:\n" + company2);
		
		// Potwierdzanie, ¿e istniej¹ dwa obiekty.
		if (company1 == company2)
		{
			System.out.println("Zmenne company1 i company2 " + 
								"wskazuj¹ na ten sam obiekt.");
		}
		else
		{
			System.out.println("Zmenne company1 i company2 " + 
								"wskazuj¹ na ró¿ne obiekty.");
		}
	}
}
