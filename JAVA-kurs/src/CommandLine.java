/**
 * Program wyœwietla  przekazane mu argumenty
 * z wiersza poleceñ systemu operacyjnego.
 * @author mateusz
 *
 */

public class CommandLine {

	public static void main(String[] args) {
		int aku = 0;
		for (int index = 0; index < args.length; index++)
		{
			System.out.println(args[index]);
		}
//		System.out.println("Suma = " + aku);
	}

}
