package Module3;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class JavaFX extends Application{

	Button timeButton;
	Button logButton;
	Button colorButton;
	Button exitButton;
	Label timeLabel;
	
	public static void main(String[] args) {
		launch(args);
	}

	
	@Override
	public void start(Stage stage1) throws Exception {

		stage1.setTitle("User Interface");
		
		timeLabel = new Label("0:00");
		timeButton = new Button("Show Time");
		logButton = new Button("Log Time");
		colorButton = new Button("Change background");
		exitButton = new Button("Exit");
		
		VBox vbox = new VBox(4);
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().add(timeLabel);
		vbox.getChildren().add(timeButton);
		vbox.getChildren().add(logButton);
		vbox.getChildren().add(colorButton);
		vbox.getChildren().add(exitButton);
		
		Scene scene = new Scene(vbox, 300, 300);
		
		stage1.setScene(scene);
		stage1.show();
	}

}
