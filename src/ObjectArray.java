import java.util.Scanner;

	/**
	 * Ten program u¿ywa tablicy zawieraj¹cej
	 * trzy obiekty typu BankAccount.
	 */

public class ObjectArray {

	public static void main(String[] args) {

		final int NUM_ACCOUNTS = 3; // Liczba kont.
		
		// Tworzenie tablicy wskazuj¹cej
		// obiekty typu BankAccount.
		BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];
		
		// Tworzenie obiektów przechowywanych w tablicy.
		createAccounts(accounts);
		
		// Wyœwietlanie stanu ka¿dego konta.
		System.out.println("Oto stan ka¿dego konta:");
		for (int index = 0; index < accounts.length; index++)
		{
			System.out.println("Konto numer " + (index + 1) + ": " + 
								accounts[index].getBalance + "z³otych");
			
		}
		
	}

	/** 
	 * Metoda createAccounts tworzy obiekt typu BankAccount
	 * odpowiadaj¹cy ka¿demu elementowi tablicy. U¿ytkownik
	 * widzi proœbê o podanie stanu ka¿dego z tych kont.
	 * @param array Tablica z elementami wskazuj¹cymi konta.
	 */
	
	private static void createAccounts(BankAccount[] array)
	{
		double balance; // Przechowywanie stanu konta.
		
		// Tworzenie obiektu typu Scanner.
		Scanner keyboard = new Scanner(System.in);
		
		// Tworzenie kont.
		for (int index = 0; index < array.length; index++)
		{
			// Pobieranie stanu kont.
			System.out.print("Podaj stan konta numer " +
							 (index + 1) + ": ");
			balance = keyboard.nextDouble();
			
			// Tworzenie konta.
			array[index] = new BankAccount(balance);
		}
	}
}
