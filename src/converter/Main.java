package converter;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

/**
 * Launch the program.
 * @author Pimwalun Witchawanitchanun
 *
 */
public class Main extends Application {
	
	/**
	 * Start the application
	 * @param stage the primary "stage" for showing the scene.
	 */
	@Override
	public void start(Stage stage) {
		try {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("ConverterUI.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.sizeToScene();
			stage.show();
		} catch(Exception e) {
			System.out.println("Exception creating scene: " + e.getMessage());
		}
	}
	
	/**
	 * Launch the program.
	 * @param args not use.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
