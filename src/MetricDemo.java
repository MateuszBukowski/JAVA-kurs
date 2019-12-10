import javax.swing.JOptionPane;

/**
 * Progeam ilustruje dzia�anie klasy metric.
 */

public class MetricDemo 
{

	public static void main(String[] args) 
	{
		String input; // Przechowywanie danych wej�ciowych.
		double miles; // Odleg�o�� w milach.
		double kilos; // Odleg�o�� w kilometrach.
		
		// Pobieranie odleg�o��i w milach.
		input = JOptionPane.showInputDialog("Podaj odleg�o�� w milach:");
		miles = Double.parseDouble(input);
		
		// Przekrzta�cenie odleg�o��i na kilometry.
		kilos = Metric.milesToKilometers(miles);
		JOptionPane.showMessageDialog(null, String.format("%,.2f w milach to %,.2f w kilometrach.", miles, kilos));
		
		System.exit(0);
	}
}
