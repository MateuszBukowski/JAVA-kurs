import javafx.application.Application;
import javafx.stage.Stage;

/*
 * Prosta aplikacja z interfejsem GUI oparta na bibliotece JavaFX.
 */

public class MyFirstGUI extends Application
{

	public static void main(String[] args) 
	{
		// Uruchamianie aplikacji.
		launch(args);
		
	}
	
	@Override
	public void start(Stage primarytage)
	{
		// Określenie tytułu płótna.
		primaryStage.setTitle("Pierwsza aplikacja z interf GUI");
		
		// Wyświetlenie okna
		primaryStage.show();
		
	}

}
