package Module3;

import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.Random;
import java.io.FileWriter;   
import java.io.IOException;
import java.time.ZonedDateTime;

public class JavaFX extends Application implements EventHandler<ActionEvent>{

	Button timeButton;
	Button logButton;
	Button colorButton;
	Button exitButton;
	Label timeLabel;
	String time;
	
	public static void main(String[] args) {
		launch(args);
	}

	public int random() {
		Random rand = new Random();
		int x = 0;
		while(x<10) {
			x = rand.nextInt(99);
		}
		return x;
	}
	
	public String getTime() {
		ZonedDateTime time = ZonedDateTime.now();
		String now =  time.toString();
		
		return now.substring(11,16);
	}
	
	public String randomColor() {
		String x = random() + "";
		String y = random() + "";
		return "-fx-background-color: #" + x + "cc" + y; 
	}
	
	@Override
	public void start(Stage stage1) throws Exception {

		stage1.setTitle("User Interface");
		
		VBox vbox = new VBox(4);
		vbox.setAlignment(Pos.CENTER);
		Scene scene = new Scene(vbox, 300, 300);
		
		timeLabel = new Label("0:00");
		
		timeButton = new Button("Show Time");
		timeButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				time = getTime();
				timeLabel.setText("Time: " + time);
			}
			
		});
		
		logButton = new Button("Log Time");
		logButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				try {
				      FileWriter myWriter = new FileWriter("log.txt");
				      myWriter.write("Time: " + time + "\n");
				      myWriter.close();
				      System.out.println("Successfully wrote to the file.");
				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
				
			}
			
		});
		
		colorButton = new Button("Change background");
		colorButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				vbox.setStyle(randomColor());
				
			}
			
		});
		
		exitButton = new Button("Exit");
		exitButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				stage1.close();
				
			}
			
		});
		
		
		vbox.getChildren().add(timeLabel);
		vbox.getChildren().add(timeButton);
		vbox.getChildren().add(logButton);
		vbox.getChildren().add(colorButton);
		vbox.getChildren().add(exitButton);
	
		vbox.setStyle(randomColor());
		
		stage1.setScene(scene);
		stage1.show();
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
