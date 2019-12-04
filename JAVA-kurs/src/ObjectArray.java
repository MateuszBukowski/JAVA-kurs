import java.util.Scanner;

	/**
	 * Ten program u�ywa tablicy zawieraj�cej
	 * trzy obiekty typu BankAccount.
	 */

public class ObjectArray {

	public static void main(String[] args) {

		final int NUM_ACCOUNTS = 3; // Liczba kont.
		
		// Tworzenie tablicy wskazuj�cej
		// obiekty typu BankAccount.
		BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];
		
		// Tworzenie obiekt�w przechowywanych w tablicy.
		createAccounts(accounts);
		
		// Wy�wietlanie stanu ka�dego konta.
		System.out.println("Oto stan ka�dego konta:");
		for (int index = 0; index < accounts.length; index++)
		{
			System.out.println("Konto numer " + (index + 1) + ": " + 
								accounts[index].getBalance + "z�otych");
			
		}
		
	}

	/** 
	 * Metoda createAccounts tworzy obiekt typu BankAccount
	 * odpowiadaj�cy ka�demu elementowi tablicy. U�ytkownik
	 * widzi pro�b� o podanie stanu ka�dego z tych kont.
	 * @param array Tablica z elementami wskazuj�cymi konta.
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
