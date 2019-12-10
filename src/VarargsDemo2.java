/**
 * Ilustruje dzia³anie metody, która przyjmujê zmienn¹ wartoœæ argumentów.
 * @author mateusz
 *
 */
public class VarargsDemo2 {

	public static void main(String[] args) 
	{
		double total; //Przechowywanie sumy stanów k¹t.
		
		// Tworzenie obiektu BancAccount ze stanem konta 100.
		BankAccount account1 = new BankAccount(100.0);
		
		// Tworzenie obiektu BancAccount ze stanem konta 500.
		BankAccount account1 = new BankAccount(500.0);
				
		// Tworzenie obiektu BancAccount ze stanem konta 1500.
		BankAccount account1 = new BankAccount(1500.0);
				
		// Wywo³anie metody z dwoma argumentami.
		total = totalBalance(account1, account2);
		System.out.println("Suma: " + total + " z³otych.");
		
		// Wywo³anie metody z trzema argumentami.
		total = totalBalance(account1, account2, account3);
		System.out.println("Suma: " + total + " z³otych.");
	}

	
	/**
	 * Metoda totalBalance
	 * przyjmujê zmiennê liczbê obiektów BankAccount i zwraca sumê ich stanów k¹t.
	 * @return Suma stanów k¹t.
	 */
	public static double totalBalance(BankAccount... accounts)
	{
		double total = 0.0; // Akumulator.
		
		// Dodawanie wszystkich wartoœci z obiektów z tablicy accounts.
		for (BankAccount acctObject : accounts)
			total += accountObject.getBalance();
		
		//Zwracanie sumy.
		return total;
	}
	
}
