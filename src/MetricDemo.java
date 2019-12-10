import javax.swing.JOptionPane;

/**
 * Progeam ilustruje dzia³anie klasy metric.
 */

public class MetricDemo 
{

	public static void main(String[] args) 
	{
		String input; // Przechowywanie danych wejœciowych.
		double miles; // Odleg³oœæ w milach.
		double kilos; // Odleg³oœæ w kilometrach.
		
		// Pobieranie odleg³oœæi w milach.
		input = JOptionPane.showInputDialog("Podaj odleg³oœæ w milach:");
		miles = Double.parseDouble(input);
		
		// Przekrzta³cenie odleg³oœæi na kilometry.
		kilos = Metric.milesToKilometers(miles);
		JOptionPane.showMessageDialog(null, String.format("%,.2f w milach to %,.2f w kilometrach.", miles, kilos));
		
		System.exit(0);
	}
}
