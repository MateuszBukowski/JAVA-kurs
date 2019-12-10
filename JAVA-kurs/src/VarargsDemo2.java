/**
 * Ilustruje dzia�anie metody, kt�ra przyjmuj� zmienn� warto�� argument�w.
 * @author mateusz
 *
 */
public class VarargsDemo2 {

	public static void main(String[] args) 
	{
		double total; //Przechowywanie sumy stan�w k�t.
		
		// Tworzenie obiektu BancAccount ze stanem konta 100.
		BankAccount account1 = new BankAccount(100.0);
		
		// Tworzenie obiektu BancAccount ze stanem konta 500.
		BankAccount account1 = new BankAccount(500.0);
				
		// Tworzenie obiektu BancAccount ze stanem konta 1500.
		BankAccount account1 = new BankAccount(1500.0);
				
		// Wywo�anie metody z dwoma argumentami.
		total = totalBalance(account1, account2);
		System.out.println("Suma: " + total + " z�otych.");
		
		// Wywo�anie metody z trzema argumentami.
		total = totalBalance(account1, account2, account3);
		System.out.println("Suma: " + total + " z�otych.");
	}

	
	/**
	 * Metoda totalBalance
	 * przyjmuj� zmienn� liczb� obiekt�w BankAccount i zwraca sum� ich stan�w k�t.
	 * @return Suma stan�w k�t.
	 */
	public static double totalBalance(BankAccount... accounts)
	{
		double total = 0.0; // Akumulator.
		
		// Dodawanie wszystkich warto�ci z obiekt�w z tablicy accounts.
		for (BankAccount acctObject : accounts)
			total += accountObject.getBalance();
		
		//Zwracanie sumy.
		return total;
	}
	
}
